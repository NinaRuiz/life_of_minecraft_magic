package com.nikels.lifeofminecraftmagic.items;

import com.nikels.lifeofminecraftmagic.gui.StudentLetterGUI;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class StudentLetterItem extends Item {
    public StudentLetterItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (level.isClientSide()) {
            Minecraft.getInstance().setScreen(new StudentLetterGUI());
        }
        return super.use(level, player, interactionHand);
    }
}
