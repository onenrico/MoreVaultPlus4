package me.onenrico.mvpcore.configapi;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.onenrico.mvpcore.enumsapi.EMaterial;
import me.onenrico.mvpcore.guiapi.GUIMenu;
import me.onenrico.mvpcore.guiapi.MenuItemContainer;
import me.onenrico.mvpcore.guiapi.OpenAnimation;
import me.onenrico.mvpcore.guiapi.WaveAnimation;
import me.onenrico.mvpcore.itemapi.ItemBuilder;
import me.onenrico.mvpcore.managerapi.PlaceholderManager;

public class GUIConfig extends EYaml {
	public PlaceholderManager pm;
	public String locale;
	public List<GUIMenu> loadedGUI = new ArrayList<>();

	public GUIConfig(Plugin handler, String path, String locale) {
		super(handler, path.replace("gui", "gui_" + locale.toUpperCase()));
		this.locale = locale;
		setup();
	}
	public GUIMenu request(String gui) {
		for(GUIMenu gm : loadedGUI) {
			if(gm.getAlias().equalsIgnoreCase(gui)) {
				return gm;
			}
		}
		return load(gui);
	}

	public MenuItemContainer load(GUIMenu gm, String item) {
		String pref = gm.getAlias()+"."+item+".";
		ItemStack material = EMaterial.fromString(getStr(pref+"Material", "TORCH")).parseItem().clone();
		String displayname = getStr(pref+"Displayname",item+" Displayname not set...");
		List<String> description = getStrList(pref+"Description",new ArrayList<>());
		int slot = getInt(pref+"Slot");
		ItemStack is = ItemBuilder.changeDisplayName(material, displayname);
		is = ItemBuilder.changeLore(is, description);
		gm.addConfigItems(item, pm.process(is), slot);
		return gm.getConfigItem(item);
	}
	
	public GUIMenu load(String gui) {
		GUIMenu gm = new GUIMenu(handler, gui, getStr(gui+"."+"Title",gui+" Title Not Set !"), getInt(gui+"."+"Row",6));
		if(getSection(gui) == null) {
			for(String item : getDefSection(gui).getKeys(false)) {
				if(item.equalsIgnoreCase("title")
						|| item.equalsIgnoreCase("row")
				)continue;
				load(gm,item);
			}
		}else {
			for(String item : getSection(gui).getKeys(false)) {
				if(item.equalsIgnoreCase("title")
						|| item.equalsIgnoreCase("row")
				)continue;
				load(gm,item);
			}
		}
		loadedGUI.add(gm);
		return gm;
	}
	
	@Override
	public void setup() {
		loadedGUI.clear();
		Locales locales = ConfigModule.request(handler).getLocaleConfig(locale);
		pm = locales.pm;
		
		for(String gui : getSection("").getKeys(false)) {
			load(gui);
		}
		EYaml guianimation = new EYaml(handler, "gui_animation.yml");
		for(String animation : guianimation.getSection("").getKeys(false)) {
			List<ItemStack> block_items = new ArrayList<>();
			List<ItemStack> wave_items = new ArrayList<>();
			for(String block : guianimation.getStrList(animation+".blocks")) {
				block_items.add(EMaterial.fromString(block).parseItem());
			}
			for(String wave : guianimation.getStrList(animation+".waves")) {
				wave_items.add(EMaterial.fromString(wave).parseItem());
			}
			for(String gui : guianimation.getStrList(animation+".menu")) {
				GUIMenu gm = request(gui);
				if(gm != null) {
					OpenAnimation anim = new WaveAnimation(block_items, wave_items);
					gm.setAnimation(anim);
				}
			}
		}
	}
	
}
