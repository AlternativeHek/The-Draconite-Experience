
package net.mcreator.thedraconiteore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.thedraconiteore.init.TheDraconiteOreModTabs;

public class DraconiteNuggetItem extends Item {
	public DraconiteNuggetItem() {
		super(new Item.Properties().tab(TheDraconiteOreModTabs.TAB_DRAC_CREAT_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
