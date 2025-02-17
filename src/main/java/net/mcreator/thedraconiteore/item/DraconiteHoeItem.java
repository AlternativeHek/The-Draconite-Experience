
package net.mcreator.thedraconiteore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.thedraconiteore.init.TheDraconiteOreModTabs;

public class DraconiteHoeItem extends HoeItem {
	public DraconiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 0, -1f, new Item.Properties().tab(TheDraconiteOreModTabs.TAB_DRAC_CREAT_TAB).fireResistant());
	}
}
