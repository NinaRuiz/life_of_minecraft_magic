package com.nikels.lifeofminecraftmagic.capabilities.magic;

import com.nikels.lifeofminecraftmagic.utils.MagicLevels;
import net.minecraft.nbt.CompoundTag;

public class PlayerMagic implements IPlayerMagic {

    public boolean isNew;
    private int magicLevel;
    public boolean hasMagic;
    private int naturalMagicMax;
    private int hellMagicMax;
    private int heavenMagicMax;
    private int potionsMagicMax;
    private int animalMagicMax;
    private int darkMagicMax;

    public static final String NATURAL_MAGIC_MAX = "natural_magic_max";
    public static final String HELL_MAGIC_MAX = "hell_magic_max";
    public static final String HEAVEN_MAGIC_MAX = "heaven_magic_max";
    public static final String POTIONS_MAGIC_MAX = "potions_magic_max";
    public static final String ANIMAL_MAGIC_MAX = "animal_magic_max";
    public static final String DARK_MAGIC_MAX = "dark_magic_max";

    private int naturalMagic;
    private int hellMagic;
    private int heavenMagic;
    private int potionsMagic;
    private int animalMagic;
    private int darkMagic;

    public static final String NATURAL_MAGIC = "natural_magic";
    public static final String HELL_MAGIC = "hell_magic";
    public static final String HEAVEN_MAGIC = "heaven_magic";
    public static final String POTIONS_MAGIC = "potions_magic";
    public static final String ANIMAL_MAGIC = "animal_magic";
    public static final String DARK_MAGIC = "dark_magic";

    public void setLevel1() {
        MagicLevels.setLevel1(this);
    }

    public int getNaturalMagicMax() {
        return naturalMagicMax;
    }

    public void setNaturalMagicMax(int naturalMagicMax) {
        this.naturalMagicMax = naturalMagicMax;
    }

    public int getHellMagicMax() {
        return hellMagicMax;
    }

    public void setHellMagicMax(int hellMagicMax) {
        this.hellMagicMax = hellMagicMax;
    }

    public int getHeavenMagicMax() {
        return heavenMagicMax;
    }

    public void setHeavenMagicMax(int heavenMagicMax) {
        this.heavenMagicMax = heavenMagicMax;
    }

    public int getPotionsMagicMax() {
        return potionsMagicMax;
    }

    public void setPotionsMagicMax(int potionsMagicMax) {
        this.potionsMagicMax = potionsMagicMax;
    }

    public int getAnimalMagicMax() {
        return animalMagicMax;
    }

    public void setAnimalMagicMax(int animalMagicMax) {
        this.animalMagicMax = animalMagicMax;
    }

    public int getDarkMagicMax() {
        return darkMagicMax;
    }

    public void setDarkMagicMax(int darkMagicMax) {
        this.darkMagicMax = darkMagicMax;
    }

    public int getNaturalMagic() {
        return naturalMagic;
    }

    public void setNaturalMagic(int naturalMagic) {
        this.naturalMagic = naturalMagic;
    }

    public int getHellMagic() {
        return hellMagic;
    }

    public void setHellMagic(int hellMagic) {
        this.hellMagic = hellMagic;
    }

    public int getHeavenMagic() {
        return heavenMagic;
    }

    public void setHeavenMagic(int heavenMagic) {
        this.heavenMagic = heavenMagic;
    }

    public int getPotionsMagic() {
        return potionsMagic;
    }

    public void setPotionsMagic(int potionsMagic) {
        this.potionsMagic = potionsMagic;
    }

    public int getAnimalMagic() {
        return animalMagic;
    }

    public void setAnimalMagic(int animalMagic) {
        this.animalMagic = animalMagic;
    }

    public int getDarkMagic() {
        return darkMagic;
    }

    public void setDarkMagic(int darkMagic) {
        this.darkMagic = darkMagic;
    }

    public int getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(int magicLevel) {
        this.magicLevel = magicLevel;
    }

    public void copyFrom(PlayerMagic source) {
        this.animalMagic = source.getAnimalMagic();
        this.animalMagicMax = source.getAnimalMagicMax();
        this.darkMagic = source.getDarkMagic();
        this.darkMagicMax = source.getDarkMagicMax();
        this.hellMagic = source.getHellMagic();
        this.hellMagicMax = source.getHellMagicMax();
        this.heavenMagic = source.getHeavenMagic();
        this.heavenMagicMax = source.getHeavenMagicMax();
        this.potionsMagic = source.getPotionsMagic();
        this.potionsMagicMax = source.getPotionsMagicMax();
        this.naturalMagic = source.getNaturalMagic();
        this.naturalMagicMax = source.getNaturalMagicMax();
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putBoolean("new", this.isNew);
        nbt.putBoolean("magic", this.hasMagic);
        nbt.putInt("level", this.magicLevel);
        nbt.putInt(NATURAL_MAGIC, this.naturalMagic);
        nbt.putInt(NATURAL_MAGIC_MAX, this.naturalMagicMax);
        nbt.putInt(ANIMAL_MAGIC, this.animalMagic);
        nbt.putInt(ANIMAL_MAGIC_MAX, this.animalMagicMax);
        nbt.putInt(DARK_MAGIC, this.darkMagic);
        nbt.putInt(DARK_MAGIC_MAX, this.darkMagicMax);
        nbt.putInt(HELL_MAGIC, this.hellMagic);
        nbt.putInt(HELL_MAGIC_MAX, this.hellMagicMax);
        nbt.putInt(HEAVEN_MAGIC, this.heavenMagic);
        nbt.putInt(HEAVEN_MAGIC_MAX, this.heavenMagicMax);
        nbt.putInt(POTIONS_MAGIC, this.potionsMagic);
        nbt.putInt(POTIONS_MAGIC_MAX, this.potionsMagicMax);
    }

    public void loadNBTData(CompoundTag nbt) {
        this.hasMagic = nbt.getBoolean("magic");
        this.isNew = nbt.getBoolean("new");
        this.magicLevel = nbt.getInt("level");
        this.naturalMagic = nbt.getInt(NATURAL_MAGIC);
        this.naturalMagicMax = nbt.getInt(NATURAL_MAGIC_MAX);
        this.animalMagic = nbt.getInt(ANIMAL_MAGIC);
        this.animalMagicMax = nbt.getInt(ANIMAL_MAGIC_MAX);
        this.darkMagic = nbt.getInt(DARK_MAGIC);
        this.darkMagicMax = nbt.getInt(DARK_MAGIC_MAX);
        this.hellMagic = nbt.getInt(HELL_MAGIC);
        this.hellMagicMax = nbt.getInt(HELL_MAGIC_MAX);
        this.heavenMagic = nbt.getInt(HEAVEN_MAGIC);
        this.heavenMagicMax = nbt.getInt(HEAVEN_MAGIC_MAX);
        this.potionsMagic = nbt.getInt(POTIONS_MAGIC);
        this.potionsMagicMax = nbt.getInt(POTIONS_MAGIC_MAX);
    }
}
