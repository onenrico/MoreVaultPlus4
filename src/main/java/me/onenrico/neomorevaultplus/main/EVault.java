package me.onenrico.neomorevaultplus.main;

import me.onenrico.mvpcore.database.EObject;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;

public class EVault extends EObject {

    public EVault(Plugin handler, String identifier) {
        super(handler, identifier);
    }

    @Override
    public HashMap<String, Object> getValues() {
        return null;
    }
}
