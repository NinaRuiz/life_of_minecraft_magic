package com.nikels.lifeofminecraftmagic.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.nikels.lifeofminecraftmagic.LifeOfMinecraftMagic;
import net.minecraft.client.gui.chat.NarratorChatListener;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.BookViewScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class StudentLetterGUI extends Screen {

    private String text = "Dear Student:\n" +
            "We have notice that you\ndrank a Magic Potion.\nNow you have a great\nresponsability on\nyou're back.\n" +
            "You will need to learn\nawesome things about\nthe magical world and\nchoose you're path wisely.\n" +
            "To start this journey\nyou will need the\nCompendium Level 1 that\ncan be obteined by\nputting together an\namethyst and a book.\n" +
            "Good luck and welcome.";
    public StudentLetterGUI() {
        super(NarratorChatListener.NO_TITLE);
    }

    @Override
    public void render(PoseStack p_96562_, int p_96563_, int p_96564_, float p_96565_) {
        this.renderBackground(p_96562_);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, new ResourceLocation(LifeOfMinecraftMagic.MOD_ID, "textures/gui/student_letter.png"));
        int i = (this.width - 192) / 2;
        this.blit(p_96562_, i, 2, 0, 0, 192, 215);
        String[] textLines = this.text.split("\n");
        for (int j = 0; j < textLines.length; j++) {
            this.font.draw(p_96562_, textLines[j], (float)(i + 30), 12.0F * (j + 1), 0);
        }

        super.render(p_96562_, p_96563_, p_96564_, p_96565_);
    }
}
