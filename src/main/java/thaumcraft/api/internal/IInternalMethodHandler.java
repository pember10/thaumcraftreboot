package thaumcraft.api.internal;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public interface IInternalMethodHandler {
    void generateVisEffect(int dim, int x, int y, int z, int x2, int y2, int z2, int color);

    boolean isResearchComplete(String username, String researchKey);

    ItemStack getStackInRowAndColumn(Object instance, int row, int column);

    AspectList getObjectAspects(ItemStack itemStack);

    AspectList getBonusObjectTags(ItemStack itemStack, AspectList aspects);

    AspectList generateTags(Item item, int meta);

    boolean consumeVisFromWand(ItemStack wand, Player player, AspectList cost, boolean doConsume, boolean isCrafting);

    boolean consumeVisFromWandCrafting(ItemStack wand, Player player, AspectList cost, boolean doConsume);

    boolean consumeVisFromInventory(Player player, AspectList cost);

    void addWarpToPlayer(Player player, int amount, boolean temporary);

    void addStickyWarpToPlayer(Player player, int amount);

    boolean hasDiscoveredAspect(String username, Aspect aspect);

    AspectList getDiscoveredAspects(String username);
}
