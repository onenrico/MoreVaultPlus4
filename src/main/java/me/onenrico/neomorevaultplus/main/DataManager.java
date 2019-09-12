package me.onenrico.neomorevaultplus.main;

import me.onenrico.mvpcore.database.DataManagerBase;
import me.onenrico.mvpcore.database.EObject;
import me.onenrico.mvpcore.database.ETable;
import me.onenrico.mvpcore.messageapi.MessageUT;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class DataManager extends DataManagerBase {
    public DataManager(Plugin handler) {
        super(handler);
        setupTable();
    }

    private ETable table_vault;
    private ETable table_player;

    public void setupTable() {
        List<ETable> tables = new ArrayList<>();

        table_vault = new ETable(handler, "NeoVault_VaultData", EObject.class)
                .addPrimary("Id")
                .addPrimary("Owner")
                .addColumn("Id","bigint")
                .addColumn("Owner","char(36)")
                .addColumn("Space","smallint(2)")
                .addColumn("Name","text")
                .addColumn("Icon","varchar(50)")
                .addColumn("Content","text")
                .addColumn("Balance","float(2)")
                .addColumn("Exp","float(2)")
                .addColumn("Description","text")
                .addQueue()
        ;

        table_player = new ETable(handler, "NeoVault_PlayerData", EObject.class)
                .addPrimary("Owner")
                .addColumn("Owner","char(36)")
                .addColumn("Maxvault","bigint")
                .addColumn("Linkedvault","bigint")
                .addColumn("Autosell","tinyint")
                .addQueue()
        ;
        final long beginning = System.currentTimeMillis();
        ETable.createQueue(handler, new BukkitRunnable() {
            @Override
            public void run() {
                final long after = System.currentTimeMillis();
                final double diff = (after - beginning) / 1000L;
                MessageUT.cmsg("Database successfuly load in " + diff + "s");
                MessageUT.cmsg("Total Data:");
                for (final ETable e : ETable.loaded.get(handler)) {
                    MessageUT.cmsg(String.valueOf(e.getName()) + ": " + e.getLoadedData().size() + " data");
                }
            }
        });
    }
}
