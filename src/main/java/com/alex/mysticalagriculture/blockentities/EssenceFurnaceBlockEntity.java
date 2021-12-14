package com.alex.mysticalagriculture.blockentities;

import com.alex.mysticalagriculture.blocks.EssenceFurnaceBlock;
import com.alex.mysticalagriculture.init.BlockEntities;
import com.alex.mysticalagriculture.util.util.Localizable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public abstract class EssenceFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
	public EssenceFurnaceBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state, RecipeType.SMELTING);
	}

	@Override
	protected Text getContainerName() {
		return Localizable.of(String.format("container.mysticalagriculture.%s_furnace", this.getTier().getName())).build();

	}

	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new FurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
	}

	@Override
	protected int getFuelTime(ItemStack fuel) {
		return (int) (super.getFuelTime(fuel) * this.getTier().getBurnTimeMultiplier());
	}


	public abstract EssenceFurnaceBlock.FurnaceTier getTier();

	public static class Inferium extends EssenceFurnaceBlockEntity {
		public Inferium(BlockPos pos, BlockState state) {
			super(BlockEntities.INFERIUM_FURNACE, pos, state);
		}

		@Override
		public EssenceFurnaceBlock.FurnaceTier getTier() {
			return EssenceFurnaceBlock.FurnaceTier.INFERIUM;
		}
	}

	public static class Prudentium extends EssenceFurnaceBlockEntity {
		public Prudentium(BlockPos pos, BlockState state) {
			super(BlockEntities.PRUDENTIUM_FURNACE, pos, state);
		}

		@Override
		public EssenceFurnaceBlock.FurnaceTier getTier() {
			return EssenceFurnaceBlock.FurnaceTier.PRUDENTIUM;
		}
	}

	public static class Tertium extends EssenceFurnaceBlockEntity {
		public Tertium(BlockPos pos, BlockState state) {
			super(BlockEntities.TERTIUM_FURNACE, pos, state);
		}

		@Override
		public EssenceFurnaceBlock.FurnaceTier getTier() {
			return EssenceFurnaceBlock.FurnaceTier.TERTIUM;
		}
	}

	public static class Imperium extends EssenceFurnaceBlockEntity {
		public Imperium(BlockPos pos, BlockState state) {
			super(BlockEntities.IMPERIUM_FURNACE, pos, state);
		}

		@Override
		public EssenceFurnaceBlock.FurnaceTier getTier() {
			return EssenceFurnaceBlock.FurnaceTier.IMPERIUM;
		}
	}

	public static class Supremium extends EssenceFurnaceBlockEntity {
		public Supremium(BlockPos pos, BlockState state) {
			super(BlockEntities.SUPREMIUM_FURNACE, pos, state);
		}

		@Override
		public EssenceFurnaceBlock.FurnaceTier getTier() {
			return EssenceFurnaceBlock.FurnaceTier.SUPREMIUM;
		}
	}
}
