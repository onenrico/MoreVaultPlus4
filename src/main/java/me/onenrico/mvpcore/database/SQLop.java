package me.onenrico.mvpcore.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import me.onenrico.mvpcore.messageapi.MessageUT;
import me.onenrico.mvpcore.utilsapi.Pair;

public class SQLop {
	

	public static String quote(final String d) {
		return "`" + d + "`";
	}

	public static Boolean tableExist(final Connection con, final String table) {
		ResultSet tables = null;
		try {
			final DatabaseMetaData dbm = con.getMetaData();
			tables = dbm.getTables(null, null, table, null);
			return tables.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(null, tables);
		}
		return false;
	}

	public static Boolean columnExist(final Connection con, final String table, final String column) {
		final String sql = select(table, "*");
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			Pair<PreparedStatement, ResultSet> psrs = executeQuery(con, sql);
			ps = psrs.getLeft();
			rs = psrs.getRight();
			final ResultSetMetaData metaData = rs.getMetaData();
			final int rowCount = metaData.getColumnCount();
			boolean there = false;
			for (int i = 1; i <= rowCount; ++i) {
				if (column.equalsIgnoreCase(metaData.getColumnName(i))) {
					there = true;
				}
			}
			psrs = null;
			return there;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			close(ps, rs);
		}
	}

	public static void addColumn(final Connection con, final String table, final String name, final String type) {
		if (!columnExist(con, table, name)) {
			executeUpdate(con, "ALTER TABLE " + table + " ADD" + " " + quote(name) + " " + type);
		}
	}

	public static Pair<PreparedStatement, ResultSet> executeQuery(final Connection con,final String sql) {
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			final Pair<PreparedStatement, ResultSet> result = new Pair<>(ps,
					ps.executeQuery());
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			close(ps, null);
			return null;
		}
	}

	public static int executeUpdate(final Connection con, final String sql) {
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(ps, null);
		}
		return 0;
	}

	public static boolean execute(final Connection con,final String sql) {
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			return ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(ps, null);
		}
		return false;
	}

	public static int[] executeBatch(final Connection con, final List<String> sqls) {
		if (sqls.isEmpty()) {
			return null;
		}
		Statement ps = null;
		try {
			ps = con.createStatement();
			if (sqls.size() > 1000) {
				for (int x = 0; x < 1000; ++x) {
					ps.addBatch(sqls.get(x));
				}
				ps.executeBatch();
				for (int x = 0; x < 1000; ++x) {
					sqls.remove(0);
				}
				return executeBatch(con,sqls);
			}
			for (final String sql : sqls) {
				ps.addBatch(sql);
			}
			return ps.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}
		return null;
	}

	public static String sqlcondition(final HashMap<String, Object> condition, final String operator) {
		String sql = " WHERE (";
		int index = 0;
		String[] op = { "AND" };
		if (operator != null) {
			op = operator.split(",");
		}
		for (final String key : condition.keySet()) {
			final String qkey = quote(key);
			if (index == 0) {
				sql = sql + "%s=";
			} else if (op.length > 1) {
				sql = sql + " " + op[index - 1].toUpperCase() + " (%s=";
			} else {
				sql = sql + " " + op[0].toUpperCase() + " (%s=";
			}
			sql = sql.replace("%s", qkey);
			if (condition.get(key) instanceof String) {
				sql = sql + "'%s')";
			} else {
				sql = sql + "%s)";
			}
			sql = sql.replace("%s", condition.get(key).toString());
			++index;
		}
		sql = sql + ";";
		return sql;
	}

	public static String createTable(final String tablename, final HashMap<String, String> tablevalue,
			final List<String> pkey) {
		String result = "CREATE TABLE IF NOT EXISTS " + tablename + " (";
		int index = 0;
		for (final String key : tablevalue.keySet()) {
			++index;
			String nn = " NOT NULL";
			String ty = tablevalue.get(key);
			if (ty.contains("null")) {
				ty = ty.replace(" null", "");
				nn = "";
			}
			if (index >= tablevalue.keySet().size()) {
				result += "`" + key + "` " + ty + nn;
			} else {
				result += "`" + key + "` " + ty + nn + ",";
			}
		}
		if (pkey != null || !pkey.isEmpty()) {
			result = result + ",PRIMARY KEY (`" ;
			int index2 = 0;
			for(String key : pkey){
				++index2;
				if(index2 >= pkey.size()){
					result+=key;
				}else{
					result+=key+",";
				}
			}
			result += "`))";

		} else {
			result += ")";
		}
		result += ";";
		return result;
	}

	public static String droptable(final String tablename) {
		return "DROP TABLE IF EXISTS " + tablename;
	}

	public static String insert(final String table, final HashMap<String, Object> columns) {
		String column = "(";
		String values = "(";
		int index = 0;
		String query = "";
		for (final String c : columns.keySet()) {
			column = column + quote(c);
			if (columns.get(c) instanceof String || columns.get(c) instanceof UUID) {
				values = values + "'%s'";
			} else {
				values = values + "%s";
			}
			values = values.replace("%s", new StringBuilder().append(columns.get(c)).toString());
			if (index + 1 != columns.keySet().size()) {
				column = column + ", ";
				values = values + ", ";
				++index;
			} else {
				column = column + ")";
				values = values + ")";
			}
		}
		query = "REPLACE INTO " + table + " " + column + " " + "VALUES " + values + ";";
		return query;
	}

	public static String select(final String table, final String column) {
		return select(table, column, null, null);
	}

	public static String select(final String table, final String column, final HashMap<String, Object> condition) {
		return select(table, column, condition, null);
	}

	public static String select(final String table, final String column, final HashMap<String, Object> condition,
			final String conditionop) {
		String sql = "SELECT " + column + " FROM " + table;
		if (condition != null && !condition.isEmpty()) {
			sql = sql + sqlcondition(condition, conditionop);
		}
		return sql;
	}

	public static String delete(final String table, final HashMap<String, Object> condition) {
		return delete(table, condition, null);
	}

	public static String delete(final String table, final HashMap<String, Object> condition, final String conditionop) {
		String sql = "DELETE FROM " + table;
		if (condition != null && !condition.isEmpty()) {
			sql = sql + sqlcondition(condition, conditionop);
		}
		return sql;
	}

	public static String update(final String table, final String column, final Object value,
			final HashMap<String, Object> condition) {
		return update(table, column, value, condition, null);
	}

	public static String update(final String table, final String column, final Object value,
			final HashMap<String, Object> condition, final String conditionop) {
		String sql = "UPDATE " + table + " SET";
		final String qkey = quote(column);
		sql = sql + " " + qkey + "=";
		if (value instanceof String) {
			sql = sql + "'%s'";
		} else {
			sql = sql + "%s";
		}
		sql = sql.replace("%s", new StringBuilder().append(value).toString());
		if (condition != null && !condition.isEmpty()) {
			sql = sql + sqlcondition(condition, conditionop);
		}
		return sql;
	}

	public static void close(final PreparedStatement ps, final ResultSet rs) {
		try {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException ex3) {
			MessageUT.cmsg("F: " + ex3);
		}
	}
}
