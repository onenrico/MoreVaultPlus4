//
// Decompiled by Procyon v0.5.30
//

package me.onenrico.mvpcore.mainapi;

import org.bukkit.Bukkit;

import me.onenrico.mvpcore.messageapi.MessageUT;

public enum MCVer {
	Unknown("Unknown", 99, Integer.MAX_VALUE), MC1_7_R4("MC1_7_R4", 1, 174), MC1_8_R3("MC1_8_R3", 2, 183),
	MC1_9_R1("MC1_9_R1", 3, 191), MC1_9_R2("MC1_9_R2", 4, 192), MC1_10_R1("MC1_10_R1", 5, 1101),
	MC1_11_R1("MC1_11_R1", 6, 1111), MC1_12_R1("MC1_12_R1", 7, 1121), MC1_13_R1("MC1_13_R1", 8, 1131),
	MC1_13_R2("MC1_13_R2", 9, 1132), MC1_14_R1("MC1_14_R1", 9, 1141);

	private static MCVer version;
	private static Boolean hasGsonSupport;
	private final int versionId;
	private final int n;

	private MCVer(final String s, final int n, final int versionId) {
		this.versionId = versionId;
		this.n = n;
	}

	public int getVersionId() {
		return versionId;
	}

	public int getN() {
		return n;
	}

	public boolean higher(MCVer mv) {
		return getN() >= mv.getN();
	}

	public static MCVer getVersion() {
		if (MCVer.version != null) {
			return MCVer.version;
		}
		final String ver = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
		MessageUT.cmsg("&fYou are running on &7'&e" + ver + "&7' &fversion");
		try {
			MCVer.version = valueOf(ver.replace("v", "MC"));
		} catch (IllegalArgumentException ex) {
			MCVer.version = MCVer.Unknown;
		}
		if (MCVer.version != MCVer.Unknown
				&& MCVer.version.higher(MCVer.MC1_8_R3)) {
			MessageUT.cmsg("&eNMS &fsupport &7'&e" + MCVer.version.name() + "&7' &bloaded!");
		} else {
			MessageUT.cmsg(
					"&7'&e" + MCVer.version.name() + "&7' &fcurrently &cnot supported &fplease tell Dev");
		}
		return MCVer.version;
	}

	public static boolean hasGsonSupport() {
		if (MCVer.hasGsonSupport != null) {
			return MCVer.hasGsonSupport;
		}
		try {
			MCVer.hasGsonSupport = true;
		} catch (Exception ex) {
			MCVer.hasGsonSupport = false;
		}
		return MCVer.hasGsonSupport;
	}
}
