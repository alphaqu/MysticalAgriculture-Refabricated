package com.alex.mysticalagriculture.init;

import com.alex.mysticalagriculture.blockentities.*;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public class BlockEntities {
    public static BlockEntityType<EssenceFurnaceBlockEntity.Inferium> INFERIUM_FURNACE;
    public static BlockEntityType<EssenceFurnaceBlockEntity.Prudentium> PRUDENTIUM_FURNACE;
    public static BlockEntityType<EssenceFurnaceBlockEntity.Tertium> TERTIUM_FURNACE;
    public static BlockEntityType<EssenceFurnaceBlockEntity.Imperium> IMPERIUM_FURNACE;
    public static BlockEntityType<EssenceFurnaceBlockEntity.Supremium> SUPREMIUM_FURNACE;
    public static BlockEntityType<InfusionPedestalBlockEntity> INFUSION_PEDESTAL;
    public static BlockEntityType<InfusionAltarBlockEntity> INFUSION_ALTAR;
    public static BlockEntityType<TinkeringTableBlockEntity> TINKERING_TABLE;
    public static BlockEntityType<ReprocessorBlockEntity.Basic> BASIC_REPROCESSOR;
    public static BlockEntityType<ReprocessorBlockEntity.Inferium> INFERIUM_REPROCESSOR;
    public static BlockEntityType<ReprocessorBlockEntity.Prudentium> PRUDENTIUM_REPROCESSOR;
    public static BlockEntityType<ReprocessorBlockEntity.Tertium> TERTIUM_REPROCESSOR;
    public static BlockEntityType<ReprocessorBlockEntity.Imperium> IMPERIUM_REPROCESSOR;
    public static BlockEntityType<ReprocessorBlockEntity.Supremium> SUPREMIUM_REPROCESSOR;


    public static void registerBlockEntities() {
        INFERIUM_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:inferium_furnace", FabricBlockEntityTypeBuilder.create(EssenceFurnaceBlockEntity.Inferium::new, Blocks.INFERIUM_FURNACE).build(null));
        PRUDENTIUM_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:prudentium_furnace", FabricBlockEntityTypeBuilder.create(EssenceFurnaceBlockEntity.Prudentium::new, Blocks.PRUDENTIUM_FURNACE).build(null));
        TERTIUM_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:tertium_furnace", FabricBlockEntityTypeBuilder.create(EssenceFurnaceBlockEntity.Tertium::new, Blocks.TERTIUM_FURNACE).build(null));
        IMPERIUM_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:imperium_furnace", FabricBlockEntityTypeBuilder.create(EssenceFurnaceBlockEntity.Imperium::new, Blocks.IMPERIUM_FURNACE).build(null));
        SUPREMIUM_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:supremium_furnace", FabricBlockEntityTypeBuilder.create(EssenceFurnaceBlockEntity.Supremium::new, Blocks.SUPREMIUM_FURNACE).build(null));
        INFUSION_PEDESTAL = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:infusion_pedestal", FabricBlockEntityTypeBuilder.create(InfusionPedestalBlockEntity::new, Blocks.INFUSION_PEDESTAL).build(null));
        INFUSION_ALTAR = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:infusion_altar_block", FabricBlockEntityTypeBuilder.create(InfusionAltarBlockEntity::new, Blocks.INFUSION_ALTAR).build(null));
        TINKERING_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:tinkering_table", FabricBlockEntityTypeBuilder.create(TinkeringTableBlockEntity::new, Blocks.TINKERING_TABLE).build(null));
        BASIC_REPROCESSOR = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:basic_reprocessor", FabricBlockEntityTypeBuilder.create(ReprocessorBlockEntity.Basic::new, Blocks.BASIC_REPROCESSOR).build(null));
        INFERIUM_REPROCESSOR = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:inferium_reprocessor", FabricBlockEntityTypeBuilder.create(ReprocessorBlockEntity.Inferium::new, Blocks.INFERIUM_REPROCESSOR).build(null));
        PRUDENTIUM_REPROCESSOR = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:prudentium_reprocessor", FabricBlockEntityTypeBuilder.create(ReprocessorBlockEntity.Prudentium::new, Blocks.PRUDENTIUM_REPROCESSOR).build(null));
        TERTIUM_REPROCESSOR = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:tertium_reprocessor", FabricBlockEntityTypeBuilder.create(ReprocessorBlockEntity.Tertium::new, Blocks.TERTIUM_REPROCESSOR).build(null));
        IMPERIUM_REPROCESSOR = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:imperium_reprocessor", FabricBlockEntityTypeBuilder.create(ReprocessorBlockEntity.Imperium::new, Blocks.IMPERIUM_REPROCESSOR).build(null));
        SUPREMIUM_REPROCESSOR = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mysticalagriculture:supremium_reprocessor", FabricBlockEntityTypeBuilder.create(ReprocessorBlockEntity.Supremium::new, Blocks.SUPREMIUM_REPROCESSOR).build(null));

    }
}
