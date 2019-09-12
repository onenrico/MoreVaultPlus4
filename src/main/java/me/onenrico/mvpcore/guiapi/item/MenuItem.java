package me.onenrico.mvpcore.guiapi.item;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import me.onenrico.mvpcore.guiapi.action.ClickAction;
import org.bukkit.inventory.ItemStack;

import me.onenrico.mvpcore.managerapi.PlaceholderManager;

public class MenuItem {
	private MenuItemContainer item;
	private Set<ClickAction> actions = new HashSet<>();
	private PlaceholderManager pm;

	public MenuItem(final int slot, final ItemStack item) {
		this.item = new MenuItemContainer(item, slot);
	}

	public MenuItem(final int slot, final ItemStack item, final PlaceholderManager pm) {
		this.item = new MenuItemContainer(item, slot);
		this.pm = pm;
	}

	public MenuItem(final MenuItemContainer item) {
		this.item = item;
	}

	public MenuItem(final MenuItemContainer item, final PlaceholderManager pm) {
		this.item = item;
		this.pm = pm;
	}

	public int getSlot() {
		return item.slot;
	}

	public void setSlot(final int slot) {
		item.slot = slot;
	}

	public MenuItemContainer getContainer() {
		return item;
	}

	public ItemStack getItem() {
		return item.item;
	}

	public void setItem(final ItemStack item) {
		this.item.item = item;
	}

	public MenuItem addAction(final ClickAction action) {
		for (final ClickAction act : new ArrayList<>(actions)) {
			if (act.valid(action.getClickType())) {
				actions.remove(act);
				actions.add(action);
				return this;
			}
		}
		actions.add(action);
		return this;
	}

	@Override
	public MenuItem clone() {
		final MenuItem result = new MenuItem(item.cloneThis(), pm);
		result.actions = new HashSet<>(actions);
		return result;
	}

	public void setActions(final Set<ClickAction> actions) {
		this.actions = actions;
	}

	public Set<ClickAction> getActions() {
		return actions;
	}

	public PlaceholderManager getPm() {
		return pm;
	}

	public void setPm(final PlaceholderManager pm) {
		this.pm = pm;
	}
}
