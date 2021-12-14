package com.alex.mysticalagriculture.compat.rei;

//import com.alex.mysticalagriculture.crafting.recipe.InfusionRecipe;
//import me.shedaniel.rei.api.EntryStack;
//import me.shedaniel.rei.api.RecipeDisplay;
//import me.shedaniel.rei.api.common.category.CategoryIdentifier;
//import me.shedaniel.rei.api.common.display.Display;
//import me.shedaniel.rei.api.common.entry.EntryIngredient;
//import me.shedaniel.rei.api.common.entry.EntryStack;
//import net.minecraft.util.Identifier;
//import org.jetbrains.annotations.NotNull;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//public class InfusionRecipeDisplay implements Display {
//
//    private final List<EntryIngredient> input;
//    private final List<EntryIngredient> output;
//
//    public InfusionRecipeDisplay(InfusionRecipe recipe) {
//        input = EntryStack.of(recipe.getIngredients());
//        output = new ArrayList<>();
//        output.add(Collections.singletonList(EntryStack.create(recipe.getOutput())));
//    }
//
//    @Override
//    public List<EntryIngredient> getInputEntries() {
//        return input;
//    }
//
//    @Override
//    public List<EntryIngredient> getOutputEntries() {
//        return null;
//    }
//
//    @Override
//    public @NotNull List<List<EntryStack<?>>> getResultingEntries() {
//        return output;
//    }
//
//    @Override
//    public List<EntryIngredient> getRequiredEntries() {
//        return input;
//    }
//
//    @Override
//    public CategoryIdentifier<?> getCategoryIdentifier() {
//        return CategoryIdentifier.of( new Identifier("mysticalagriculture:infusion"));
//    }
//
//
//
//    @Override
//    public @NotNull Optional<Identifier> getRecipeLocation() {
//        return RecipeDisplay.super.getRecipeLocation();
//    }
//
//}
//