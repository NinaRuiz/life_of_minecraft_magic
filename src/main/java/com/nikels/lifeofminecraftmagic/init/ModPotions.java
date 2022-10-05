package com.nikels.lifeofminecraftmagic.init;

import com.nikels.lifeofminecraftmagic.LifeOfMinecraftMagic;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, LifeOfMinecraftMagic.MOD_ID);

    public static final RegistryObject<Potion> MAGIC_POTION = POTIONS.register("magic_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.INITIALIZE_MAGIC.get(), 200, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }

    private static ItemStack getType(Potion type) {
        return PotionUtils.setPotion(new ItemStack(Items.POTION), type);
    }
}
