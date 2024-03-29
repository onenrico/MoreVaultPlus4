//
// Decompiled by Procyon v0.5.30
//

package me.onenrico.mvpcore.nbtapi;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

import org.bukkit.inventory.ItemStack;

import me.onenrico.mvpcore.mainapi.MCVer;

public enum ReflectionMethod {
	COMPOUND_SET_FLOAT(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, Float.TYPE },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setFloat") }),
	COMPOUND_SET_STRING(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setString") }),
	COMPOUND_SET_INT(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, Integer.TYPE },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setInt") }),
	COMPOUND_SET_BYTEARRAY(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, byte[].class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setByteArray") }),
	COMPOUND_SET_INTARRAY(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, int[].class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setIntArray") }),
	COMPOUND_SET_LONG(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, Long.TYPE },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setLong") }),
	COMPOUND_SET_SHORT(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, Short.TYPE },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setShort") }),
	COMPOUND_SET_BYTE(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, Byte.TYPE },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setByte") }),
	COMPOUND_SET_DOUBLE(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, Double.TYPE },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setDouble") }),
	COMPOUND_SET_BOOLEAN(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class, Boolean.TYPE },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setBoolean") }),
	COMPOUND_ADD(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz() },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "a") }),
	COMPOUND_GET_FLOAT(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getFloat") }),
	COMPOUND_GET_STRING(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getString") }),
	COMPOUND_GET_INT(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getInt") }),
	COMPOUND_GET_BYTEARRAY(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getByteArray") }),
	COMPOUND_GET_INTARRAY(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getIntArray") }),
	COMPOUND_GET_LONG(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getLong") }),
	COMPOUND_GET_SHORT(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getShort") }),
	COMPOUND_GET_BYTE(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getByte") }),
	COMPOUND_GET_DOUBLE(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getDouble") }),
	COMPOUND_GET_BOOLEAN(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "getBoolean") }),
	COMPOUND_REMOVE_KEY(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "remove") }),
	COMPOUND_HAS_KEY(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "hasKey") }),
	COMPOUND_GET_TYPE(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[] { String.class },
			MCVer.MC1_8_R3,
			new Since[] { new Since(MCVer.MC1_8_R3, "b"), new Since(MCVer.MC1_9_R1, "d") }),
	COMPOUND_GET_KEYS(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[0], MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "c"),
					new Since(MCVer.MC1_13_R1, "getKeys") }),
	LISTCOMPOUND_GET_KEYS(ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), new Class[0], MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "c"),
					new Since(MCVer.MC1_13_R1, "getKeys") }),
	LIST_REMOVE_KEY(ClassWrapper.NMS_NBTTAGLIST.getClazz(), new Class[] { Integer.TYPE }, MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "a"), new Since(MCVer.MC1_9_R1, "remove") }),
	LIST_SIZE(ClassWrapper.NMS_NBTTAGLIST.getClazz(), new Class[0], MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "size") }),
	LIST_SET(ClassWrapper.NMS_NBTTAGLIST.getClazz(), new Class[] { Integer.TYPE, ClassWrapper.NMS_NBTBASE.getClazz() },
			MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "a"), new Since(MCVer.MC1_13_R1, "set") }),
	LIST_ADD(ClassWrapper.NMS_NBTTAGLIST.getClazz(), new Class[] { ClassWrapper.NMS_NBTBASE.getClazz() },
			MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "add"),
					new Since(MCVer.MC1_14_R1, "add",
							new Class[] { Integer.TYPE, ClassWrapper.NMS_NBTBASE.getClazz() }) }),
	LIST_GET_STRING(ClassWrapper.NMS_NBTTAGLIST.getClazz(), new Class[] { Integer.TYPE }, MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "getString") }),
	LIST_GET(ClassWrapper.NMS_NBTTAGLIST.getClazz(), new Class[] { Integer.TYPE }, MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "get") }),
	ITEMSTACK_SET_TAG(ClassWrapper.NMS_ITEMSTACK.getClazz(), new Class[] { ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz() },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "setTag") }),
	ITEMSTACK_NMSCOPY(ClassWrapper.CRAFT_ITEMSTACK.getClazz(), new Class[] { ItemStack.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "asNMSCopy") }),
	ITEMSTACK_BUKKITMIRROR(ClassWrapper.CRAFT_ITEMSTACK.getClazz(),
			new Class[] { ClassWrapper.NMS_ITEMSTACK.getClazz() }, MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "asCraftMirror") }),
	CRAFT_WORLD_GET_HANDLE(ClassWrapper.CRAFT_WORLD.getClazz(), new Class[0], MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "getHandle") }),
	NMS_WORLD_GET_TILEENTITY(ClassWrapper.NMS_WORLD.getClazz(),
			new Class[] { ClassWrapper.NMS_BLOCKPOSITION.getClazz() }, MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "getTileEntity") }),
	TILEENTITY_GET_NBT(ClassWrapper.NMS_TILEENTITY.getClazz(),
			new Class[] { ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz() }, MCVer.MC1_8_R3,
			new Since[] { new Since(MCVer.MC1_8_R3, "b"), new Since(MCVer.MC1_9_R1, "save") }),
	TILEENTITY_SET_NBT(ClassWrapper.NMS_TILEENTITY.getClazz(),
			new Class[] { ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz() }, MCVer.MC1_8_R3,
			new Since[] { new Since(MCVer.MC1_8_R3, "a"), new Since(MCVer.MC1_12_R1, "load") }),
	CRAFT_ENTITY_GET_HANDLE(ClassWrapper.CRAFT_ENTITY.getClazz(), new Class[0], MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "getHandle") }),
	NMS_ENTITY_SET_NBT(ClassWrapper.NMS_ENTITY.getClazz(), new Class[] { ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz() },
			MCVer.MC1_8_R3, new Since[] { new Since(MCVer.MC1_8_R3, "f") }),
	NMS_ENTITY_GET_NBT(ClassWrapper.NMS_ENTITY.getClazz(), new Class[] { ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz() },

			MCVer.MC1_8_R3,
			new Since[] { new Since(MCVer.MC1_8_R3, "e"), new Since(MCVer.MC1_12_R1, "save") }),
	NBTFILE_READ(ClassWrapper.NMS_NBTCOMPRESSEDSTREAMTOOLS.getClazz(), new Class[] { InputStream.class },
			MCVer.MC1_7_R4, new Since[] { new Since(MCVer.MC1_7_R4, "a") }),
	NBTFILE_WRITE(ClassWrapper.NMS_NBTCOMPRESSEDSTREAMTOOLS.getClazz(),
			new Class[] { ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz(), OutputStream.class }, MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "a") }),
	PARSE_NBT(ClassWrapper.NMS_MOJANGSONPARSER.getClazz(), new Class[] { String.class }, MCVer.MC1_7_R4,
			new Since[] { new Since(MCVer.MC1_7_R4, "parse") });

	private Since targetVersion;
	private Method method;
	private boolean loaded;
	private boolean compatible;

	private ReflectionMethod(final Class<?> targetClass, Class<?>[] args, final MCVer addedSince,
			final Since[] methodnames) {
		loaded = false;
		compatible = false;
		final MCVer server = MCVer.getVersion();
		if (server.compareTo(addedSince) < 0) {
			return;
		}
		compatible = true;
		Since target = methodnames[0];
		for (final Since s : methodnames) {
			if (s.version.getVersionId() <= server.getVersionId()
					&& target.version.getVersionId() < s.version.getVersionId()) {
				target = s;
			}
		}
		targetVersion = target;
		try {
			(method = targetClass.getMethod(targetVersion.name, targetVersion.args == null ? args : targetVersion.args))
					.setAccessible(true);
			loaded = true;
		} catch (NullPointerException | NoSuchMethodException | SecurityException ex3) {
			ex3.printStackTrace();
		}
	}

	public Object run(final Object target, final Object... args) {
		try {
			return method.invoke(target, args);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public boolean isLoaded() {
		return loaded;
	}

	public boolean isCompatible() {
		return compatible;
	}

	public static class Since {
		public final MCVer version;
		public final String name;
		public final Class<?>[] args;

		public Since(MCVer version, String name) {
			this.version = version;
			this.name = name;
			args = null;
		}

		public Since(MCVer version, String name, final Class<?>[] args) {
			this.version = version;
			this.name = name;
			this.args = args;
		}
	}
}
