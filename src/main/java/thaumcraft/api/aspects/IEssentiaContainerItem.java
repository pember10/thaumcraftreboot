package thaumcraft.api.aspects;

import net.minecraft.world.item.ItemStack;

public interface IEssentiaContainerItem {
    AspectList getAspects(ItemStack paramItemStack);

    void setAspects(ItemStack paramItemStack, AspectList paramAspectList);
}
