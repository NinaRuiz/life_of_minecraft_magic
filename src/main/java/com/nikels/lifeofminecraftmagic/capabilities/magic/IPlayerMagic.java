package com.nikels.lifeofminecraftmagic.capabilities.magic;

import net.minecraft.nbt.CompoundTag;

public interface IPlayerMagic {
    public int getNaturalMagicMax();

    public void setNaturalMagicMax(int naturalMagicMax);

    public int getHellMagicMax();

    public void setHellMagicMax(int hellMagicMax);

    public int getHeavenMagicMax();

    public void setHeavenMagicMax(int heavenMagicMax);

    public int getPotionsMagicMax();

    public void setPotionsMagicMax(int potionsMagicMax);

    public int getAnimalMagicMax();

    public void setAnimalMagicMax(int animalMagicMax);

    public int getDarkMagicMax();

    public void setDarkMagicMax(int darkMagicMax);

    public int getNaturalMagic();

    public void setNaturalMagic(int naturalMagic);

    public int getHellMagic();

    public void setHellMagic(int hellMagic);

    public int getHeavenMagic();

    public void setHeavenMagic(int heavenMagic);

    public int getPotionsMagic();

    public void setPotionsMagic(int potionsMagic);

    public int getAnimalMagic();

    public void setAnimalMagic(int animalMagic);

    public int getDarkMagic();

    public void setDarkMagic(int darkMagic);

    public void copyFrom(PlayerMagic source);

    public void saveNBTData(CompoundTag nbt);

    public void loadNBTData(CompoundTag nbt);
}
