package com.nikels.lifeofminecraftmagic.init;

import com.nikels.lifeofminecraftmagic.LifeOfMinecraftMagic;
import com.nikels.lifeofminecraftmagic.items.StudentLetterItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LifeOfMinecraftMagic.MOD_ID);

    public static final RegistryObject<Item> STUDENT_LETTER = ITEMS.register("student_letter",
            StudentLetterItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
