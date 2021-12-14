package com.alex.mysticalagriculture.world;

import com.alex.mysticalagriculture.init.Blocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

import java.util.function.Predicate;

import static com.alex.mysticalagriculture.MysticalAgriculture.MOD_ID;

public final class ModWorldgenRegistration {

	public static void onCommonSetup() {
		registerOre("soulstone", BiomeSelectors.foundInTheNether(), Blocks.SOULSTONE, 64, 4, 128);
		registerOre("prosperity_ore", BiomeSelectors.foundInOverworld(), Blocks.PROSPERITY_ORE, 8, 12, 50);
		registerOre("inferium_ore", BiomeSelectors.foundInOverworld(), Blocks.INFERIUM_ORE, 8, 16, 50);
	}

	private static void registerOre(String name, Predicate<BiomeSelectionContext> biome, Block block, int size, int rate, int height) {
		Identifier ore = new Identifier(MOD_ID, name);
		ConfiguredFeature<?, ?> configuredFeature = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, block.getDefaultState(), size));

		PlacedFeature placedFeature = configuredFeature.withPlacement(
				CountPlacementModifier.of(rate),
				SquarePlacementModifier.of(),
				HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(height)));

		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore, configuredFeature);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, ore, placedFeature);
		BiomeModifications.addFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, ore));

	}
}
