package com.nikels.lifeofminecraftmagic.capabilities.magic;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;

public class PlayerMagicProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {

    public static Capability<PlayerMagic> PLAYER_MAGIC = CapabilityManager.get(new CapabilityToken<PlayerMagic>() {});

    private PlayerMagic playerMagic = null;
    private LazyOptional<PlayerMagic> lazyOptional = LazyOptional.of(this::createPlayerMagic);

    private PlayerMagic createPlayerMagic() {
        if (this.playerMagic == null) {
            this.playerMagic = new PlayerMagic();
        }
        return this.playerMagic;
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @org.jetbrains.annotations.Nullable Direction side) {
        if (cap == PLAYER_MAGIC) {
            return this.lazyOptional.cast();
        }
        return LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        createPlayerMagic().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createPlayerMagic().loadNBTData(nbt);
    }
}
