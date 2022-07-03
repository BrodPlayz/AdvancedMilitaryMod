
package net.mcreator.militarymodtesting.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.militarymodtesting.init.MilitaryModTestingModTabs;

public class BulletItem extends Item {
	public BulletItem() {
		super(new Item.Properties().tab(MilitaryModTestingModTabs.TAB_MILITARY_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
