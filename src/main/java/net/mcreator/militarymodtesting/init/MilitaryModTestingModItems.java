
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.militarymodtesting.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.militarymodtesting.item.Tech9Item;
import net.mcreator.militarymodtesting.item.PistolItem;
import net.mcreator.militarymodtesting.item.BulletItem;
import net.mcreator.militarymodtesting.MilitaryModTestingMod;

public class MilitaryModTestingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MilitaryModTestingMod.MODID);
	public static final RegistryObject<Item> TECH_9 = REGISTRY.register("tech_9", () -> new Tech9Item());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
}
