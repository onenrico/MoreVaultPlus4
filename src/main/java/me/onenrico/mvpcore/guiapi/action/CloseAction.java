package me.onenrico.mvpcore.guiapi.action;

import org.bukkit.event.inventory.InventoryCloseEvent;

public interface CloseAction {
	void act(InventoryCloseEvent event);
}
