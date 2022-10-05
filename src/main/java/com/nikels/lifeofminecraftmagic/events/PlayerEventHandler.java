package com.nikels.lifeofminecraftmagic.events;

import com.mojang.blaze3d.vertex.PoseStack;
import com.nikels.lifeofminecraftmagic.LifeOfMinecraftMagic;
import com.nikels.lifeofminecraftmagic.capabilities.magic.PlayerMagic;
import com.nikels.lifeofminecraftmagic.capabilities.magic.PlayerMagicProvider;
import com.nikels.lifeofminecraftmagic.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.Gui;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LifeOfMinecraftMagic.MOD_ID)
public class PlayerEventHandler {

    @SubscribeEvent
    public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event) {
        if(event.getObject() instanceof Player) {
            if(!event.getObject().getCapability(PlayerMagicProvider.PLAYER_MAGIC).isPresent()) {
                event.addCapability(new ResourceLocation(LifeOfMinecraftMagic.MOD_ID, "magic_properties"), new PlayerMagicProvider());
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event) {
        if(event.isWasDeath()) {
            event.getOriginal().getCapability(PlayerMagicProvider.PLAYER_MAGIC).ifPresent(oldStore -> {
                event.getOriginal().getCapability(PlayerMagicProvider.PLAYER_MAGIC).ifPresent(newStore -> {
                    newStore.copyFrom(oldStore);
                });
            });
        }
    }

    @SubscribeEvent
    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
        event.register(PlayerMagic.class);
    }

    @SubscribeEvent
    public static void onPlayerWakeUpEvent( PlayerWakeUpEvent event )
    {
        event.getEntity().getCapability(PlayerMagicProvider.PLAYER_MAGIC).ifPresent(playerMagic -> {
            if (playerMagic.isNew) {
                event.getEntity().addItem(new ItemStack(ModItems.STUDENT_LETTER.get()));
                playerMagic.isNew = false;
            }
        });
    }
}
