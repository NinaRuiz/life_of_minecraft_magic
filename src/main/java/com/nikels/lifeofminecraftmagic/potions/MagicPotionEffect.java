package com.nikels.lifeofminecraftmagic.potions;

import com.nikels.lifeofminecraftmagic.capabilities.magic.PlayerMagicProvider;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;


public class MagicPotionEffect extends MobEffect {

    public MagicPotionEffect() {
        super(MobEffectCategory.BENEFICIAL, 0);
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyEffectTick(@NotNull LivingEntity livingEntity, int int1) {
        if (livingEntity instanceof Player) {
            livingEntity.getCapability(PlayerMagicProvider.PLAYER_MAGIC).ifPresent(playerMagic -> {
                if (!playerMagic.hasMagic){
                    playerMagic.setLevel1();
                    playerMagic.isNew = true;
                    playerMagic.hasMagic = true;
                }
            });

        }
    }
}
