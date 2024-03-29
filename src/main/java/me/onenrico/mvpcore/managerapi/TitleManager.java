package me.onenrico.mvpcore.managerapi;

import java.lang.reflect.Constructor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TitleManager {
	public static void sendTitle(final Player player, final Integer fadeIn, final Integer stay, final Integer fadeOut,
			final String message) {
		sendTitle(player, fadeIn, stay, fadeOut, message, null);
	}

	public static void sendSubtitle(final Player player, final Integer fadeIn, final Integer stay,
			final Integer fadeOut, final String message) {
		sendTitle(player, fadeIn, stay, fadeOut, null, message);
	}

	public static void sendFullTitle(final Player player, final Integer fadeIn, final Integer stay,
			final Integer fadeOut, final String title, final String subtitle) {
		sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
	}

	public static void sendPacket(final Player player, final Object packet) {
		try {
			final Object handle = player.getClass().getMethod("getHandle", new Class[0]).invoke(player, new Object[0]);
			final Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
			playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Class<?> getNMSClass(final String name) {
		final String version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
		try {
			return Class.forName("net.minecraft.server." + version + "." + name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	public static void sendTitle(final Player player, final Integer fadeIn, final Integer stay, final Integer fadeOut,
			String title, String subtitle) {
		try {
			if(title == null) {
				title = "";
			}
			if(subtitle == null) {
				subtitle = "";
			}
			if (title != null) {
				title = ChatColor.translateAlternateColorCodes('&', title);
				title = title.replaceAll("%player%", player.getDisplayName());
				Object e = getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("TIMES").get(null);
				Object chatTitle = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0]
						.getMethod("a", String.class).invoke(null, "{\"text\":\"" + title + "\"}");
				Constructor subtitleConstructor = getNMSClass("PacketPlayOutTitle").getConstructor(
						getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0], getNMSClass("IChatBaseComponent"),
						Integer.TYPE, Integer.TYPE, Integer.TYPE);
				Object titlePacket = subtitleConstructor.newInstance(e, chatTitle, fadeIn, stay, fadeOut);
				sendPacket(player, titlePacket);
				e = getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("TITLE").get(null);
				chatTitle = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class)
						.invoke(null, "{\"text\":\"" + title + "\"}");
				subtitleConstructor = getNMSClass("PacketPlayOutTitle").getConstructor(
						getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0], getNMSClass("IChatBaseComponent"));
				titlePacket = subtitleConstructor.newInstance(e, chatTitle);
				sendPacket(player, titlePacket);
			}
			if (subtitle != null) {
				subtitle = ChatColor.translateAlternateColorCodes('&', subtitle);
				subtitle = subtitle.replaceAll("%player%", player.getDisplayName());
				Object e = getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("TIMES").get(null);
				Object chatSubtitle = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0]
						.getMethod("a", String.class).invoke(null, "{\"text\":\"" + title + "\"}");
				Constructor subtitleConstructor = getNMSClass("PacketPlayOutTitle").getConstructor(
						getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0], getNMSClass("IChatBaseComponent"),
						Integer.TYPE, Integer.TYPE, Integer.TYPE);
				Object subtitlePacket = subtitleConstructor.newInstance(e, chatSubtitle, fadeIn, stay, fadeOut);
				sendPacket(player, subtitlePacket);
				e = getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("SUBTITLE").get(null);
				chatSubtitle = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class)
						.invoke(null, "{\"text\":\"" + subtitle + "\"}");
				subtitleConstructor = getNMSClass("PacketPlayOutTitle").getConstructor(
						getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0], getNMSClass("IChatBaseComponent"),
						Integer.TYPE, Integer.TYPE, Integer.TYPE);
				subtitlePacket = subtitleConstructor.newInstance(e, chatSubtitle, fadeIn, stay, fadeOut);
				sendPacket(player, subtitlePacket);
			}
		} catch (Exception var11) {
			var11.printStackTrace();
		}
	}

	public static void clearTitle(final Player player) {
		sendTitle(player, 0, 0, 0, "", "");
	}
}
