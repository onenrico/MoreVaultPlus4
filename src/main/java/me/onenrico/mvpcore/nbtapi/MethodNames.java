//
// Decompiled by Procyon v0.5.30
//

package me.onenrico.mvpcore.nbtapi;

import me.onenrico.mvpcore.mainapi.MCVer;

public class MethodNames {
	private static final MCVer MINECRAFT_VERSION;

	static {
		MINECRAFT_VERSION = MCVer.getVersion();
	}

	public static String getTileDataMethodName() {
		if (MethodNames.MINECRAFT_VERSION == MCVer.MC1_8_R3) {
			return "b";
		}
		return "save";
	}

	public static String getEntityNbtGetterMethodName() {
		return "b";
	}

	public static String getEntityNbtSetterMethodName() {
		return "a";
	}
}
