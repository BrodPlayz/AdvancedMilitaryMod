
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.militarymodtesting.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.militarymodtesting.entity.Tech9Entity;
import net.mcreator.militarymodtesting.entity.PistolEntity;
import net.mcreator.militarymodtesting.MilitaryModTestingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MilitaryModTestingModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MilitaryModTestingMod.MODID);
	public static final RegistryObject<EntityType<Tech9Entity>> TECH_9 = register("projectile_tech_9",
			EntityType.Builder.<Tech9Entity>of(Tech9Entity::new, MobCategory.MISC).setCustomClientFactory(Tech9Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PistolEntity>> PISTOL = register("projectile_pistol",
			EntityType.Builder.<PistolEntity>of(PistolEntity::new, MobCategory.MISC).setCustomClientFactory(PistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
