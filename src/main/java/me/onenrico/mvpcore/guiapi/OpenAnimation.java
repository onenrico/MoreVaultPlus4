package me.onenrico.mvpcore.guiapi;

import org.bukkit.entity.Player;

public abstract class OpenAnimation {
	public abstract void open(final Runnable callback, final GUIView view, final Player player);
}
