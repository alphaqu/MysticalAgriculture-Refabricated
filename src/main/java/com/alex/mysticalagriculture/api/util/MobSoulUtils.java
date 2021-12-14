package com.alex.mysticalagriculture.api.util;

import com.alex.mysticalagriculture.api.soul.MobSoulType;
import com.alex.mysticalagriculture.lib.ModMobSoulTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

public class MobSoulUtils {

    public static NbtCompound makeTag(MobSoulType type) {
        return makeTag(type, type.getSoulRequirement());
    }

    public static NbtCompound makeTag(MobSoulType type, double souls) {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("Type", type.getId().toString());
        nbt.putDouble("Souls", Math.min(souls, type.getSoulRequirement()));
        return nbt;
    }

    public static ItemStack getSoulJar(MobSoulType type, double souls, Item item) {
        NbtCompound nbt = makeTag(type, souls);
        ItemStack stack = new ItemStack(item);
        stack.setNbt(nbt);

        return stack;
    }

    public static ItemStack getFilledSoulJar(MobSoulType type, Item item) {
        NbtCompound nbt = makeTag(type);
        ItemStack stack = new ItemStack(item);
        stack.setNbt(nbt);

        return stack;
    }

    public static MobSoulType getType(ItemStack stack) {
        NbtCompound nbt = stack.getNbt();
        if (nbt != null && nbt.contains("Type")) {
            String type = nbt.getString("Type");
            return ModMobSoulTypes.getMobSoulTypeById(new Identifier(type));
        }

        return null;
    }

    public static double getSouls(ItemStack stack) {
        NbtCompound nbt = stack.getNbt();
        if (nbt != null && nbt.contains("Souls"))
            return nbt.getDouble("Souls");

        return 0D;
    }

    public static boolean canAddTypeToJar(ItemStack stack, MobSoulType type) {
        MobSoulType containedType = getType(stack);
        return containedType == null || containedType == type;
    }

    public static double addSoulsToJar(ItemStack stack, MobSoulType type, double amount) {
        MobSoulType containedType = getType(stack);
        if (containedType != null && containedType != type)
            return amount;

        double requirement = type.getSoulRequirement();
        if (containedType == null) {
            NbtCompound nbt = makeTag(type, amount);
            stack.setNbt(nbt);

            return Math.max(0, amount - requirement);
        } else {
            double souls = getSouls(stack);
            if (souls < requirement) {
                NbtCompound nbt = stack.getNbt();

                if (nbt != null) {
                    double newSouls = Math.min(requirement, souls + amount);
                    nbt.putDouble("Souls", newSouls);

                    return Math.max(0, amount - (newSouls - souls));
                }
            }
        }

        return amount;
    }
}
