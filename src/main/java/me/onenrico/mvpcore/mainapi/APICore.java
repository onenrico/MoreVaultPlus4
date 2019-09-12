package me.onenrico.mvpcore.mainapi;

import org.bukkit.plugin.java.JavaPlugin;

import me.onenrico.mvpcore.guiapi.MenuListener;
import me.onenrico.mvpcore.guiapi.MenuLiveUpdate;

public class APICore extends JavaPlugin {
	static APICore instance;

	public static APICore getThis2() {
		return instance;
	}

	@Override
	public void onEnable() {
		instance = this;
		MCVer.getVersion();
		MenuLiveUpdate.startTimer();
		getServer().getPluginManager().registerEvents(new MenuListener(), this);
	}

}
