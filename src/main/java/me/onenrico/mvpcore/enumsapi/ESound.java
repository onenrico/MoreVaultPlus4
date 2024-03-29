//
// Decompiled by Procyon v0.5.30
//

package me.onenrico.mvpcore.enumsapi;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public enum ESound {
	AMBIENCE_CAVE("AMBIENCE_CAVE", 0, new String[] { "AMBIENCE_CAVE", "AMBIENT_CAVE" }),
	AMBIENCE_RAIN("AMBIENCE_RAIN", 1, new String[] { "AMBIENCE_RAIN", "WEATHER_RAIN" }),
	AMBIENCE_THUNDER("AMBIENCE_THUNDER", 2,
			new String[] { "AMBIENCE_THUNDER", "ENTITY_LIGHTNING_THUNDER", "ENTITY_LIGHTNING_BOLT_THUNDER" }),
	ANVIL_BREAK("ANVIL_BREAK", 3, new String[] { "ANVIL_BREAK", "BLOCK_ANVIL_BREAK" }),
	ANVIL_LAND("ANVIL_LAND", 4, new String[] { "ANVIL_LAND", "BLOCK_ANVIL_LAND" }),
	ANVIL_USE("ANVIL_USE", 5, new String[] { "ANVIL_USE", "BLOCK_ANVIL_USE" }),
	ARROW_HIT("ARROW_HIT", 6, new String[] { "ARROW_HIT", "ENTITY_ARROW_HIT" }),
	BURP("BURP", 7, new String[] { "BURP", "ENTITY_PLAYER_BURP" }),
	CHEST_CLOSE("CHEST_CLOSE", 8, new String[] { "CHEST_CLOSE", "ENTITY_CHEST_CLOSE", "BLOCK_CHEST_CLOSE" }),
	CHEST_OPEN("CHEST_OPEN", 9, new String[] { "CHEST_OPEN", "ENTITY_CHEST_OPEN", "BLOCK_CHEST_OPEN" }),
	CLICK("CLICK", 10, new String[] { "CLICK", "UI_BUTTON_CLICK" }),
	DOOR_CLOSE("DOOR_CLOSE", 11, new String[] { "DOOR_CLOSE", "BLOCK_WOODEN_DOOR_CLOSE" }),
	DOOR_OPEN("DOOR_OPEN", 12, new String[] { "DOOR_OPEN", "BLOCK_WOODEN_DOOR_OPEN" }),
	DRINK("DRINK", 13, new String[] { "DRINK", "ENTITY_GENERIC_DRINK" }),
	EAT("EAT", 14, new String[] { "EAT", "ENTITY_GENERIC_EAT" }),
	EXPLODE("EXPLODE", 15, new String[] { "EXPLODE", "ENTITY_GENERIC_EXPLODE" }),
	FALL_BIG("FALL_BIG", 16, new String[] { "FALL_BIG", "ENTITY_GENERIC_BIG_FALL" }),
	FALL_SMALL("FALL_SMALL", 17, new String[] { "FALL_SMALL", "ENTITY_GENERIC_SMALL_FALL" }),
	FIRE("FIRE", 18, new String[] { "FIRE", "BLOCK_FIRE_AMBIENT" }),
	FIRE_IGNITE("FIRE_IGNITE", 19, new String[] { "FIRE_IGNITE", "ITEM_FLINTANDSTEEL_USE" }),
	FIZZ("FIZZ", 20, new String[] { "FIZZ", "BLOCK_FIRE_EXTINGUISH" }),
	FUSE("FUSE", 21, new String[] { "FUSE", "ENTITY_TNT_PRIMED" }),
	GLASS("GLASS", 22, new String[] { "GLASS", "BLOCK_GLASS_BREAK" }),
	HURT_FLESH("HURT_FLESH", 23, new String[] { "HURT_FLESH", "ENTITY_PLAYER_HURT" }),
	ITEM_BREAK("ITEM_BREAK", 24, new String[] { "ITEM_BREAK", "ENTITY_ITEM_BREAK" }),
	ITEM_PICKUP("ITEM_PICKUP", 25, new String[] { "ITEM_PICKUP", "ENTITY_ITEM_PICKUP" }),
	LAVA("LAVA", 26, new String[] { "LAVA", "BLOCK_LAVA_AMBIENT" }),
	LAVA_POP("LAVA_POP", 27, new String[] { "LAVA_POP", "BLOCK_LAVA_POP" }),
	LEVEL_UP("LEVEL_UP", 28, new String[] { "LEVEL_UP", "ENTITY_PLAYER_LEVELUP" }),
	MINECART_BASE("MINECART_BASE", 29, new String[] { "MINECART_BASE", "ENTITY_MINECART_RIDING" }),
	MINECART_INSIDE("MINECART_INSIDE", 30, new String[] { "MINECART_INSIDE", "ENTITY_MINECART_RIDING" }),
	NOTE_BASS("NOTE_BASS", 31, new String[] { "NOTE_BASS", "BLOCK_NOTE_BASS", "BLOCK_NOTE_BLOCK_BASS" }),
	NOTE_PIANO("NOTE_PIANO", 32, new String[] { "NOTE_PIANO", "BLOCK_NOTE_HARP", "BLOCK_NOTE_BLOCK_HARP" }),
	NOTE_BASS_DRUM("NOTE_BASS_DRUM", 33,
			new String[] { "NOTE_BASS_DRUM", "BLOCK_NOTE_BASEDRUM", "BLOCK_NOTE_BLOCK_BASEDRUM" }),
	NOTE_STICKS("NOTE_STICKS", 34, new String[] { "NOTE_STICKS", "BLOCK_NOTE_HAT", "BLOCK_NOTE_BLOCK_HAT" }),
	NOTE_BASS_GUITAR("NOTE_BASS_GUITAR", 35,
			new String[] { "NOTE_BASS_GUITAR", "BLOCK_NOTE_GUITAR", "BLOCK_NOTE_BLOCK_GUITAR", "BLOCK_NOTE_BASS" }),
	NOTE_SNARE_DRUM("NOTE_SNARE_DRUM", 36,
			new String[] { "NOTE_SNARE_DRUM", "BLOCK_NOTE_SNARE", "BLOCK_NOTE_BLOCK_SNARE" }),
	NOTE_PLING("NOTE_PLING", 37, new String[] { "NOTE_PLING", "BLOCK_NOTE_PLING", "BLOCK_NOTE_BLOCK_PLING" }),
	ORB_PICKUP("ORB_PICKUP", 38, new String[] { "ORB_PICKUP", "ENTITY_EXPERIENCE_ORB_PICKUP" }),
	PISTON_EXTEND("PISTON_EXTEND", 39, new String[] { "PISTON_EXTEND", "BLOCK_PISTON_EXTEND" }),
	PISTON_RETRACT("PISTON_RETRACT", 40, new String[] { "PISTON_RETRACT", "BLOCK_PISTON_CONTRACT" }),
	PORTAL("PORTAL", 41, new String[] { "PORTAL", "BLOCK_PORTAL_AMBIENT" }),
	PORTAL_TRAVEL("PORTAL_TRAVEL", 42, new String[] { "PORTAL_TRAVEL", "BLOCK_PORTAL_TRAVEL" }),
	PORTAL_TRIGGER("PORTAL_TRIGGER", 43, new String[] { "PORTAL_TRIGGER", "BLOCK_PORTAL_TRIGGER" }),
	SHOOT_ARROW("SHOOT_ARROW", 44, new String[] { "SHOOT_ARROW", "ENTITY_ARROW_SHOOT" }),
	SPLASH("SPLASH", 45, new String[] { "SPLASH", "ENTITY_GENERIC_SPLASH" }),
	SPLASH2("SPLASH2", 46, new String[] { "SPLASH2", "ENTITY_BOBBER_SPLASH", "ENTITY_FISHING_BOBBER_SPLASH" }),
	STEP_GRASS("STEP_GRASS", 47, new String[] { "STEP_GRASS", "BLOCK_GRASS_STEP" }),
	STEP_GRAVEL("STEP_GRAVEL", 48, new String[] { "STEP_GRAVEL", "BLOCK_GRAVEL_STEP" }),
	STEP_LADDER("STEP_LADDER", 49, new String[] { "STEP_LADDER", "BLOCK_LADDER_STEP" }),
	STEP_SAND("STEP_SAND", 50, new String[] { "STEP_SAND", "BLOCK_SAND_STEP" }),
	STEP_SNOW("STEP_SNOW", 51, new String[] { "STEP_SNOW", "BLOCK_SNOW_STEP" }),
	STEP_STONE("STEP_STONE", 52, new String[] { "STEP_STONE", "BLOCK_STONE_STEP" }),
	STEP_WOOD("STEP_WOOD", 53, new String[] { "STEP_WOOD", "BLOCK_WOOD_STEP" }),
	STEP_WOOL("STEP_WOOL", 54, new String[] { "STEP_WOOL", "BLOCK_CLOTH_STEP", "BLOCK_WOOL_STEP" }),
	SWIM("SWIM", 55, new String[] { "SWIM", "ENTITY_GENERIC_SWIM" }),
	WATER("WATER", 56, new String[] { "WATER", "BLOCK_WATER_AMBIENT" }),
	WOOD_CLICK("WOOD_CLICK", 57,
			new String[] { "WOOD_CLICK", "BLOCK_WOOD_BUTTON_CLICK_ON", "BLOCK_WOODEN_BUTTON_CLICK_ON" }),
	BAT_DEATH("BAT_DEATH", 58, new String[] { "BAT_DEATH", "ENTITY_BAT_DEATH" }),
	BAT_HURT("BAT_HURT", 59, new String[] { "BAT_HURT", "ENTITY_BAT_HURT" }),
	BAT_IDLE("BAT_IDLE", 60, new String[] { "BAT_IDLE", "ENTITY_BAT_AMBIENT" }),
	BAT_LOOP("BAT_LOOP", 61, new String[] { "BAT_LOOP", "ENTITY_BAT_LOOP" }),
	BAT_TAKEOFF("BAT_TAKEOFF", 62, new String[] { "BAT_TAKEOFF", "ENTITY_BAT_TAKEOFF" }),
	BLAZE_BREATH("BLAZE_BREATH", 63, new String[] { "BLAZE_BREATH", "ENTITY_BLAZE_AMBIENT" }),
	BLAZE_DEATH("BLAZE_DEATH", 64, new String[] { "BLAZE_DEATH", "ENTITY_BLAZE_DEATH" }),
	BLAZE_HIT("BLAZE_HIT", 65, new String[] { "BLAZE_HIT", "ENTITY_BLAZE_HURT" }),
	CAT_HISS("CAT_HISS", 66, new String[] { "CAT_HISS", "ENTITY_CAT_HISS" }),
	CAT_HIT("CAT_HIT", 67, new String[] { "CAT_HIT", "ENTITY_CAT_HURT" }),
	CAT_MEOW("CAT_MEOW", 68, new String[] { "CAT_MEOW", "ENTITY_CAT_AMBIENT" }),
	CAT_PURR("CAT_PURR", 69, new String[] { "CAT_PURR", "ENTITY_CAT_PURR" }),
	CAT_PURREOW("CAT_PURREOW", 70, new String[] { "CAT_PURREOW", "ENTITY_CAT_PURREOW" }),
	CHICKEN_IDLE("CHICKEN_IDLE", 71, new String[] { "CHICKEN_IDLE", "ENTITY_CHICKEN_AMBIENT" }),
	CHICKEN_HURT("CHICKEN_HURT", 72, new String[] { "CHICKEN_HURT", "ENTITY_CHICKEN_HURT" }),
	CHICKEN_EGG_POP("CHICKEN_EGG_POP", 73, new String[] { "CHICKEN_EGG_POP", "ENTITY_CHICKEN_EGG" }),
	CHICKEN_WALK("CHICKEN_WALK", 74, new String[] { "CHICKEN_WALK", "ENTITY_CHICKEN_STEP" }),
	COW_IDLE("COW_IDLE", 75, new String[] { "COW_IDLE", "ENTITY_COW_AMBIENT" }),
	COW_HURT("COW_HURT", 76, new String[] { "COW_HURT", "ENTITY_COW_HURT" }),
	COW_WALK("COW_WALK", 77, new String[] { "COW_WALK", "ENTITY_COW_STEP" }),
	CREEPER_HISS("CREEPER_HISS", 78, new String[] { "CREEPER_HISS", "ENTITY_CREEPER_PRIMED" }),
	CREEPER_DEATH("CREEPER_DEATH", 79, new String[] { "CREEPER_DEATH", "ENTITY_CREEPER_DEATH" }),
	ENDERDRAGON_DEATH("ENDERDRAGON_DEATH", 80,
			new String[] { "ENDERDRAGON_DEATH", "ENTITY_ENDERDRAGON_DEATH", "ENTITY_ENDER_DRAGON_DEATH" }),
	ENDERDRAGON_GROWL("ENDERDRAGON_GROWL", 81,
			new String[] { "ENDERDRAGON_GROWL", "ENTITY_ENDERDRAGON_GROWL", "ENTITY_ENDER_DRAGON_GROWL" }),
	ENDERDRAGON_HIT("ENDERDRAGON_HIT", 82,
			new String[] { "ENDERDRAGON_HIT", "ENTITY_ENDERDRAGON_HURT", "ENTITY_ENDER_DRAGON_HURT" }),
	ENDERDRAGON_WINGS("ENDERDRAGON_WINGS", 83,
			new String[] { "ENDERDRAGON_WINGS", "ENTITY_ENDERDRAGON_FLAP", "ENTITY_ENDER_DRAGON_FLAP" }),
	ENDERMAN_DEATH("ENDERMAN_DEATH", 84,
			new String[] { "ENDERMAN_DEATH", "ENTITY_ENDERMEN_DEATH", "ENTITY_ENDERMAN_DEATH" }),
	ENDERMAN_HIT("ENDERMAN_HIT", 85, new String[] { "ENDERMAN_HIT", "ENTITY_ENDERMEN_HURT", "ENTITY_ENDERMAN_HURT" }),
	ENDERMAN_IDLE("ENDERMAN_IDLE", 86,
			new String[] { "ENDERMAN_IDLE", "ENTITY_ENDERMEN_AMBIENT", "ENTITY_ENDERMAN_AMBIENT" }),
	ENDERMAN_TELEPORT("ENDERMAN_TELEPORT", 87,
			new String[] { "ENDERMAN_TELEPORT", "ENTITY_ENDERMEN_TELEPORT", "ENTITY_ENDERMAN_TELEPORT" }),
	ENDERMAN_SCREAM("ENDERMAN_SCREAM", 88,
			new String[] { "ENDERMAN_SCREAM", "ENTITY_ENDERMEN_SCREAM", "ENTITY_ENDERMAN_SCREAM" }),
	ENDERMAN_STARE("ENDERMAN_STARE", 89,
			new String[] { "ENDERMAN_STARE", "ENTITY_ENDERMEN_STARE", "ENTITY_ENDERMAN_STARE" }),
	GHAST_SCREAM("GHAST_SCREAM", 90, new String[] { "GHAST_SCREAM", "ENTITY_GHAST_SCREAM" }),
	GHAST_SCREAM2("GHAST_SCREAM2", 91, new String[] { "GHAST_SCREAM2", "ENTITY_GHAST_HURT" }),
	GHAST_CHARGE("GHAST_CHARGE", 92, new String[] { "GHAST_CHARGE", "ENTITY_GHAST_WARN" }),
	GHAST_DEATH("GHAST_DEATH", 93, new String[] { "GHAST_DEATH", "ENTITY_GHAST_DEATH" }),
	GHAST_FIREBALL("GHAST_FIREBALL", 94, new String[] { "GHAST_FIREBALL", "ENTITY_GHAST_SHOOT" }),
	GHAST_MOAN("GHAST_MOAN", 95, new String[] { "GHAST_MOAN", "ENTITY_GHAST_AMBIENT" }),
	IRONGOLEM_ATTACK("IRONGOLEM_ATTACK", 96,
			new String[] { "IRONGOLEM_THROW", "ENTITY_IRONGOLEM_ATTACK", "ENTITY_IRON_GOLEM_ATTACK" }),
	IRONGOLEM_DEATH("IRONGOLEM_DEATH", 97,
			new String[] { "IRONGOLEM_DEATH", "ENTITY_IRONGOLEM_DEATH", "ENTITY_IRON_GOLEM_DEATH" }),
	IRONGOLEM_HIT("IRONGOLEM_HIT", 98,
			new String[] { "IRONGOLEM_HIT", "ENTITY_IRONGOLEM_HURT", "ENTITY_IRON_GOLEM_HURT" }),
	IRONGOLEM_WALK("IRONGOLEM_WALK", 99,
			new String[] { "IRONGOLEM_WALK", "ENTITY_IRONGOLEM_STEP", "ENTITY_IRON_GOLEM_STEP" }),
	MAGMACUBE_WALK("MAGMACUBE_WALK", 100,
			new String[] { "MAGMACUBE_WALK", "ENTITY_MAGMACUBE_SQUISH", "ENTITY_MAGMA_CUBE_SQUISH" }),
	MAGMACUBE_WALK2("MAGMACUBE_WALK2", 101,
			new String[] { "MAGMACUBE_WALK2", "ENTITY_MAGMACUBE_SQUISH", "ENTITY_MAGMA_CUBE_SQUISH_SMALL" }),
	MAGMACUBE_JUMP("MAGMACUBE_JUMP", 102,
			new String[] { "MAGMACUBE_JUMP", "ENTITY_MAGMACUBE_JUMP", "ENTITY_MAGMA_CUBE_JUMP" }),
	PIG_IDLE("PIG_IDLE", 103, new String[] { "PIG_IDLE", "ENTITY_PIG_AMBIENT" }),
	PIG_DEATH("PIG_DEATH", 104, new String[] { "PIG_DEATH", "ENTITY_PIG_DEATH" }),
	PIG_WALK("PIG_WALK", 105, new String[] { "PIG_WALK", "ENTITY_PIG_STEP" }),
	SHEEP_IDLE("SHEEP_IDLE", 106, new String[] { "SHEEP_IDLE", "ENTITY_SHEEP_AMBIENT" }),
	SHEEP_SHEAR("SHEEP_SHEAR", 107, new String[] { "SHEEP_SHEAR", "ENTITY_SHEEP_SHEAR" }),
	SHEEP_WALK("SHEEP_WALK", 108, new String[] { "SHEEP_WALK", "ENTITY_SHEEP_STEP" }),
	SILVERFISH_HIT("SILVERFISH_HIT", 109, new String[] { "SILVERFISH_HIT", "ENTITY_SILVERFISH_HURT" }),
	SILVERFISH_KILL("SILVERFISH_KILL", 110, new String[] { "SILVERFISH_KILL", "ENTITY_SILVERFISH_DEATH" }),
	SILVERFISH_IDLE("SILVERFISH_IDLE", 111, new String[] { "SILVERFISH_IDLE", "ENTITY_SILVERFISH_AMBIENT" }),
	SILVERFISH_WALK("SILVERFISH_WALK", 112, new String[] { "SILVERFISH_WALK", "ENTITY_SILVERFISH_STEP" }),
	SKELETON_IDLE("SKELETON_IDLE", 113, new String[] { "SKELETON_IDLE", "ENTITY_SKELETON_AMBIENT" }),
	SKELETON_DEATH("SKELETON_DEATH", 114, new String[] { "SKELETON_DEATH", "ENTITY_SKELETON_DEATH" }),
	SKELETON_HURT("SKELETON_HURT", 115, new String[] { "SKELETON_HURT", "ENTITY_SKELETON_HURT" }),
	SKELETON_WALK("SKELETON_WALK", 116, new String[] { "SKELETON_WALK", "ENTITY_SKELETON_STEP" }),
	SLIME_ATTACK("SLIME_ATTACK", 117, new String[] { "SLIME_ATTACK", "ENTITY_SLIME_ATTACK" }),
	SLIME_WALK("SLIME_WALK", 118, new String[] { "SLIME_WALK", "ENTITY_SLIME_JUMP" }),
	SLIME_WALK2("SLIME_WALK2", 119, new String[] { "SLIME_WALK2", "ENTITY_SLIME_SQUISH" }),
	SPIDER_IDLE("SPIDER_IDLE", 120, new String[] { "SPIDER_IDLE", "ENTITY_SPIDER_AMBIENT" }),
	SPIDER_DEATH("SPIDER_DEATH", 121, new String[] { "SPIDER_DEATH", "ENTITY_SPIDER_DEATH" }),
	SPIDER_WALK("SPIDER_WALK", 122, new String[] { "SPIDER_WALK", "ENTITY_SPIDER_STEP" }),
	WITHER_DEATH("WITHER_DEATH", 123, new String[] { "WITHER_DEATH", "ENTITY_WITHER_DEATH" }),
	WITHER_HURT("WITHER_HURT", 124, new String[] { "WITHER_HURT", "ENTITY_WITHER_HURT" }),
	WITHER_IDLE("WITHER_IDLE", 125, new String[] { "WITHER_IDLE", "ENTITY_WITHER_AMBIENT" }),
	WITHER_SHOOT("WITHER_SHOOT", 126, new String[] { "WITHER_SHOOT", "ENTITY_WITHER_SHOOT" }),
	WITHER_SPAWN("WITHER_SPAWN", 127, new String[] { "WITHER_SPAWN", "ENTITY_WITHER_SPAWN" }),
	WOLF_BARK("WOLF_BARK", 128, new String[] { "WOLF_BARK", "ENTITY_WOLF_AMBIENT" }),
	WOLF_DEATH("WOLF_DEATH", 129, new String[] { "WOLF_DEATH", "ENTITY_WOLF_DEATH" }),
	WOLF_GROWL("WOLF_GROWL", 130, new String[] { "WOLF_GROWL", "ENTITY_WOLF_GROWL" }),
	WOLF_HOWL("WOLF_HOWL", 131, new String[] { "WOLF_HOWL", "ENTITY_WOLF_HOWL" }),
	WOLF_HURT("WOLF_HURT", 132, new String[] { "WOLF_HURT", "ENTITY_WOLF_HURT" }),
	WOLF_PANT("WOLF_PANT", 133, new String[] { "WOLF_PANT", "ENTITY_WOLF_PANT" }),
	WOLF_SHAKE("WOLF_SHAKE", 134, new String[] { "WOLF_SHAKE", "ENTITY_WOLF_SHAKE" }),
	WOLF_WALK("WOLF_WALK", 135, new String[] { "WOLF_WALK", "ENTITY_WOLF_STEP" }),
	WOLF_WHINE("WOLF_WHINE", 136, new String[] { "WOLF_WHINE", "ENTITY_WOLF_WHINE" }),
	ZOMBIE_METAL("ZOMBIE_METAL", 137, new String[] { "ZOMBIE_METAL", "ENTITY_ZOMBIE_ATTACK_IRON_DOOR" }),
	ZOMBIE_WOOD("ZOMBIE_WOOD", 138,
			new String[] { "ZOMBIE_WOOD", "ENTITY_ZOMBIE_ATTACK_DOOR_WOOD", "ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR" }),
	ZOMBIE_WOODBREAK("ZOMBIE_WOODBREAK", 139,
			new String[] { "ZOMBIE_WOODBREAK", "ENTITY_ZOMBIE_BREAK_DOOR_WOOD", "ENTITY_ZOMBIE_BREAK_WOODEN_DOOR" }),
	ZOMBIE_IDLE("ZOMBIE_IDLE", 140, new String[] { "ZOMBIE_IDLE", "ENTITY_ZOMBIE_AMBIENT" }),
	ZOMBIE_DEATH("ZOMBIE_DEATH", 141, new String[] { "ZOMBIE_DEATH", "ENTITY_ZOMBIE_DEATH" }),
	ZOMBIE_HURT("ZOMBIE_HURT", 142, new String[] { "ZOMBIE_HURT", "ENTITY_ZOMBIE_HURT" }),
	ZOMBIE_INFECT("ZOMBIE_INFECT", 143, new String[] { "ZOMBIE_INFECT", "ENTITY_ZOMBIE_INFECT" }),
	ZOMBIE_UNFECT("ZOMBIE_UNFECT", 144, new String[] { "ZOMBIE_UNFECT", "ENTITY_ZOMBIE_VILLAGER_CONVERTED" }),
	ZOMBIE_REMEDY("ZOMBIE_REMEDY", 145, new String[] { "ZOMBIE_REMEDY", "ENTITY_ZOMBIE_VILLAGER_CURE" }),
	ZOMBIE_WALK("ZOMBIE_WALK", 146, new String[] { "ZOMBIE_WALK", "ENTITY_ZOMBIE_STEP" }),
	ZOMBIE_PIG_IDLE("ZOMBIE_PIG_IDLE", 147,
			new String[] { "ZOMBIE_PIG_IDLE", "ENTITY_ZOMBIE_PIG_AMBIENT", "ENTITY_ZOMBIE_PIGMAN_AMBIENT" }),
	ZOMBIE_PIG_ANGRY("ZOMBIE_PIG_ANGRY", 148,
			new String[] { "ZOMBIE_PIG_ANGRY", "ENTITY_ZOMBIE_PIG_ANGRY", "ENTITY_ZOMBIE_PIGMAN_ANGRY" }),
	ZOMBIE_PIG_DEATH("ZOMBIE_PIG_DEATH", 149,
			new String[] { "ZOMBIE_PIG_DEATH", "ENTITY_ZOMBIE_PIG_DEATH", "ENTITY_ZOMBIE_PIGMAN_DEATH" }),
	ZOMBIE_PIG_HURT("ZOMBIE_PIG_HURT", 150,
			new String[] { "ZOMBIE_PIG_HURT", "ENTITY_ZOMBIE_PIG_HURT", "ENTITY_ZOMBIE_PIGMAN_HURT" }),
	DIG_WOOL("DIG_WOOL", 151, new String[] { "DIG_WOOL", "BLOCK_CLOTH_BREAK", "BLOCK_WOOL_BREAK" }),
	DIG_GRASS("DIG_GRASS", 152, new String[] { "DIG_GRASS", "BLOCK_GRASS_BREAK" }),
	DIG_GRAVEL("DIG_GRAVEL", 153, new String[] { "DIG_GRAVEL", "BLOCK_GRAVEL_BREAK" }),
	DIG_SAND("DIG_SAND", 154, new String[] { "DIG_SAND", "BLOCK_SAND_BREAK" }),
	DIG_SNOW("DIG_SNOW", 155, new String[] { "DIG_SNOW", "BLOCK_SNOW_BREAK" }),
	DIG_STONE("DIG_STONE", 156, new String[] { "DIG_STONE", "BLOCK_STONE_BREAK" }),
	DIG_WOOD("DIG_WOOD", 157, new String[] { "DIG_WOOD", "BLOCK_WOOD_BREAK" }),
	FIREWORK_BLAST("FIREWORK_BLAST", 158,
			new String[] { "FIREWORK_BLAST", "ENTITY_FIREWORK_BLAST", "ENTITY_FIREWORK_ROCKET_BLAST" }),
	FIREWORK_BLAST2("FIREWORK_BLAST2", 159,
			new String[] { "FIREWORK_BLAST2", "ENTITY_FIREWORK_BLAST_FAR", "ENTITY_FIREWORK_ROCKET_BLAST_FAR" }),
	FIREWORK_LARGE_BLAST("FIREWORK_LARGE_BLAST", 160,
			new String[] { "FIREWORK_LARGE_BLAST", "ENTITY_FIREWORK_LARGE_BLAST",
					"ENTITY_FIREWORK_ROCKET_LARGE_BLAST" }),
	FIREWORK_LARGE_BLAST2("FIREWORK_LARGE_BLAST2", 161,
			new String[] { "FIREWORK_LARGE_BLAST2", "ENTITY_FIREWORK_LARGE_BLAST_FAR",
					"ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR" }),
	FIREWORK_LAUNCH("FIREWORK_LAUNCH", 162,
			new String[] { "FIREWORK_LAUNCH", "ENTITY_FIREWORK_LAUNCH", "ENTITY_FIREWORK_ROCKET_LAUNCH" }),
	FIREWORK_TWINKLE("FIREWORK_TWINKLE", 163,
			new String[] { "FIREWORK_TWINKLE", "ENTITY_FIREWORK_TWINKLE", "ENTITY_FIREWORK_ROCKET_TWINKLE" }),
	FIREWORK_TWINKLE2("FIREWORK_TWINKLE2", 164,
			new String[] { "FIREWORK_TWINKLE2", "ENTITY_FIREWORK_TWINKLE_FAR", "ENTITY_FIREWORK_ROCKET_TWINKLE_FAR" }),
	SUCCESSFUL_HIT("SUCCESSFUL_HIT", 165, new String[] { "SUCCESSFUL_HIT", "ENTITY_PLAYER_ATTACK_STRONG" }),
	HORSE_ANGRY("HORSE_ANGRY", 166, new String[] { "HORSE_ANGRY", "ENTITY_HORSE_ANGRY" }),
	HORSE_ARMOR("HORSE_ARMOR", 167, new String[] { "HORSE_ARMOR", "ENTITY_HORSE_ARMOR" }),
	HORSE_BREATHE("HORSE_BREATHE", 168, new String[] { "HORSE_BREATHE", "ENTITY_HORSE_BREATHE" }),
	HORSE_DEATH("HORSE_DEATH", 169, new String[] { "HORSE_DEATH", "ENTITY_HORSE_DEATH" }),
	HORSE_GALLOP("HORSE_GALLOP", 170, new String[] { "HORSE_GALLOP", "ENTITY_HORSE_GALLOP" }),
	HORSE_HIT("HORSE_HIT", 171, new String[] { "HORSE_HIT", "ENTITY_HORSE_HURT" }),
	HORSE_IDLE("HORSE_IDLE", 172, new String[] { "HORSE_IDLE", "ENTITY_HORSE_AMBIENT" }),
	HORSE_JUMP("HORSE_JUMP", 173, new String[] { "HORSE_JUMP", "ENTITY_HORSE_JUMP" }),
	HORSE_LAND("HORSE_LAND", 174, new String[] { "HORSE_LAND", "ENTITY_HORSE_LAND" }),
	HORSE_SADDLE("HORSE_SADDLE", 175, new String[] { "HORSE_SADDLE", "ENTITY_HORSE_SADDLE" }),
	HORSE_SOFT("HORSE_SOFT", 176, new String[] { "HORSE_SOFT", "ENTITY_HORSE_STEP" }),
	HORSE_WOOD("HORSE_WOOD", 177, new String[] { "HORSE_WOOD", "ENTITY_HORSE_STEP_WOOD" }),
	DONKEY_ANGRY("DONKEY_ANGRY", 178, new String[] { "DONKEY_ANGRY", "ENTITY_DONKEY_ANGRY" }),
	DONKEY_DEATH("DONKEY_DEATH", 179, new String[] { "DONKEY_DEATH", "ENTITY_DONKEY_DEATH" }),
	DONKEY_HIT("DONKEY_HIT", 180, new String[] { "DONKEY_HIT", "ENTITY_DONKEY_HURT" }),
	DONKEY_IDLE("DONKEY_IDLE", 181, new String[] { "DONKEY_IDLE", "ENTITY_DONKEY_AMBIENT" }),
	HORSE_SKELETON_DEATH("HORSE_SKELETON_DEATH", 182,
			new String[] { "HORSE_SKELETON_DEATH", "ENTITY_SKELETON_HORSE_DEATH" }),
	HORSE_SKELETON_HIT("HORSE_SKELETON_HIT", 183, new String[] { "HORSE_SKELETON_HIT", "ENTITY_SKELETON_HORSE_HURT" }),
	HORSE_SKELETON_IDLE("HORSE_SKELETON_IDLE", 184,
			new String[] { "HORSE_SKELETON_IDLE", "ENTITY_SKELETON_HORSE_AMBIENT" }),
	HORSE_ZOMBIE_DEATH("HORSE_ZOMBIE_DEATH", 185, new String[] { "HORSE_ZOMBIE_DEATH", "ENTITY_ZOMBIE_HORSE_DEATH" }),
	HORSE_ZOMBIE_HIT("HORSE_ZOMBIE_HIT", 186, new String[] { "HORSE_ZOMBIE_HIT", "ENTITY_ZOMBIE_HORSE_HURT" }),
	HORSE_ZOMBIE_IDLE("HORSE_ZOMBIE_IDLE", 187, new String[] { "HORSE_ZOMBIE_IDLE", "ENTITY_ZOMBIE_HORSE_AMBIENT" }),
	VILLAGER_DEATH("VILLAGER_DEATH", 188, new String[] { "VILLAGER_DEATH", "ENTITY_VILLAGER_DEATH" }),
	VILLAGER_TRADE("VILLAGER_TRADE", 189,
			new String[] { "VILLAGER_HAGGLE", "ENTITY_VILLAGER_TRADING", "ENTITY_VILLAGER_TRADE" }),
	VILLAGER_HIT("VILLAGER_HIT", 190, new String[] { "VILLAGER_HIT", "ENTITY_VILLAGER_HURT" }),
	VILLAGER_IDLE("VILLAGER_IDLE", 191, new String[] { "VILLAGER_IDLE", "ENTITY_VILLAGER_AMBIENT" }),
	VILLAGER_NO("VILLAGER_NO", 192, new String[] { "VILLAGER_NO", "ENTITY_VILLAGER_NO" }),
	VILLAGER_YES("VILLAGER_YES", 193, new String[] { "VILLAGER_YES", "ENTITY_VILLAGER_YES" });

	private String[] versionDependentNames;
	private static Map<String, ESound> cachedesound;
	private static Map<String, Sound> cachedsound;

	static {
		ESound.cachedesound = new HashMap<>();
		ESound.cachedsound = new HashMap<>();
	}

	private ESound(final String s, final int n, final String... versionDependentNames) {
		this.versionDependentNames = versionDependentNames;
	}

	public Sound parseSound() {
		if (ESound.cachedsound.containsKey(toString())) {
			return ESound.cachedsound.get(toString());
		}
		final String[] versionDependentNames;
		final int length = (versionDependentNames = this.versionDependentNames).length;
		int i = 0;
		while (i < length) {
			final String name = versionDependentNames[i];
			try {
				final Sound s = Sound.valueOf(name);
				ESound.cachedsound.put(toString(), s);
				return s;
			} catch (IllegalArgumentException ex) {
				++i;
			}
		}
		ESound.cachedsound.put(toString(), ESound.CLICK.parseSound());
		return ESound.CLICK.parseSound();
	}

	public static ESound match(String str) {
		if (str == null || str.isEmpty()) {
			return ESound.CLICK;
		}
		str = str.toUpperCase();
		if (ESound.cachedesound.containsKey(str)) {
			return ESound.cachedesound.get(str);
		}
		try {
			final ESound es = valueOf(str);
			ESound.cachedesound.put(str, es);
			return es;
		} catch (IllegalArgumentException ignore2) {
			ESound[] values;
			for (int length = (values = values()).length, i = 0; i < length; ++i) {
				final ESound es2 = values[i];
				String[] versionDependentNames;
				for (int length2 = (versionDependentNames = es2.versionDependentNames).length, j = 0; j < length2; ++j) {
					final String vd = versionDependentNames[j];
					if (str.equalsIgnoreCase(vd)) {
						ESound.cachedesound.put(str, es2);
						return es2;
					}
				}
			}
			return ESound.CLICK;
		}
	}

	public void playSound(final Player player) {
		this.playSound(player, 1.0f, 1.0f);
	}

	public void playSound(final Player player, final float volume, final float pitch) {
		player.playSound(player.getLocation(), parseSound(), volume, pitch);
	}
}
