package com.nikels.lifeofminecraftmagic.utils;

import com.nikels.lifeofminecraftmagic.capabilities.magic.PlayerMagic;

public class MagicLevels {

    public static void setLevel1(PlayerMagic playerMagic) {
        playerMagic.setMagicLevel(1);

        playerMagic.setNaturalMagic(300);
        playerMagic.setNaturalMagicMax(300);

        playerMagic.setHellMagic(100);
        playerMagic.setHellMagicMax(100);

        playerMagic.setHeavenMagic(100);
        playerMagic.setHeavenMagicMax(100);

        playerMagic.setPotionsMagic(300);
        playerMagic.setPotionsMagicMax(300);

        playerMagic.setDarkMagic(100);
        playerMagic.setDarkMagicMax(100);

        playerMagic.setAnimalMagic(100);
        playerMagic.setAnimalMagicMax(100);
    }
}
