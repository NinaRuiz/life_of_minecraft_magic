package com.nikels.lifeofminecraftmagic.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

public class ModBrewingRecipes {

    public static void register() {
        System.out.println(ModPotions.MAGIC_POTION);
        BrewingRecipeRegistry.addRecipe(Ingredient.of(getType(Potions.AWKWARD)), Ingredient.of(Items.AMETHYST_SHARD), getType(ModPotions.MAGIC_POTION.get()));
    }

    private static ItemStack getType(Potion type) {
        return PotionUtils.setPotion(new ItemStack(Items.POTION), type);
    }
}
