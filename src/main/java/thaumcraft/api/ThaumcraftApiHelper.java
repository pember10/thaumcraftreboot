package thaumcraft.api;

import java.util.Iterator;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.CraftingHelper;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class ThaumcraftApiHelper {
    public static AspectList cullTags(AspectList list) {
        var results = new AspectList();
        for (var tag : list.getAspects()) {
            if (tag != null)
                results.add(tag, list.getAmount(tag));
        }

        var primalCount = results.getPrimalAspects().length;

        while (results != null && results.size() > primalCount) {
            var lowest = (Aspect)null;
            float low = 32767.0F;

            for (var tag : results.getAspects()) {
                if (tag != null) {
                    var ta = results.getAmount(tag);
                    if (tag.isPrimal()) {
                        ta *= 0.9F;
                    }
                    else {
                        if (!tag.getComponents()[0].isPrimal()) {
                            ta *= 1.1F;
                            if (!tag.getComponents()[0].getComponents()[0].isPrimal()) {
                                ta *= 1.05F;
                            }
                            if (!tag.getComponents()[0].getComponents()[1].isPrimal()) {
                                ta *= 1.05F;
                            }
                        }
                        if (!tag.getComponents()[1].isPrimal()) {
                            ta *= 1.1F;
                            if (!tag.getComponents()[1].getComponents()[0].isPrimal()) {
                                ta *= 1.05F;
                            }
                            if (!tag.getComponents()[1].getComponents()[1].isPrimal()) {
                                ta *= 1.05F;
                            }
                        }
                    }

                    if (ta < low) {
                        low = ta;
                        lowest = tag;
                    }
                }
            }

            results.aspects.remove(lowest);
        }

        return results;
    }

    public static boolean areItemsEqual(ItemStack sourceStack, ItemStack compareStack) {
        if (sourceStack.isDamageableItem() && compareStack.isDamageableItem()) {
            return (sourceStack.getItem() == compareStack.getItem());
        }
        return (sourceStack.getItem() == compareStack.getItem() && sourceStack.getDamageValue() == compareStack.getDamageValue());
    }

    public static boolean isResearchComplete(String username, String researchKey) {
        return ThaumcraftApi.internalMethods.isResearchComplete(username, researchKey);
    }

    public static boolean hasDiscoveredAspect(String username, Aspect aspect) {
        return ThaumcraftApi.internalMethods.hasDiscoveredAspect(username, aspect);
    }

    public static AspectList getDiscoveredAspects(String username) {
        return ThaumcraftApi.internalMethods.getDiscoveredAspects(username);
    }

    public static ItemStack getStackInRowAndColumn(Object instance, int row, int column) {
        return ThaumcraftApi.internalMethods.getStackInRowAndColumn(instance, row, column);
    }

    public static AspectList getObjectAspects(ItemStack is) {
        return ThaumcraftApi.internalMethods.getObjectAspects(is);
    }

    public static AspectList getBonusObjectTags(ItemStack is, AspectList ot) {
        return ThaumcraftApi.internalMethods.getBonusObjectTags(is, ot);
    }

    public static AspectList generateTags(Item item, int meta) {
        return ThaumcraftApi.internalMethods.generateTags(item, meta);
    }

    public static boolean containsMatch(boolean strict, ItemStack[] inputs, ItemStack... targets) {
        for (ItemStack input : inputs) {

            for (ItemStack target : targets) {

                if (itemMatches(target, input, strict)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean itemMatches(ItemStack target, ItemStack input, boolean strict) {
        if ((input == null && target != null) || (input != null && target == null)) {
            return false;
        }
        return (target != null && input != null && target.getItem() == input.getItem()
                && ((target.getDamageValue() == 32767 && !strict) || target.getDamageValue() == input.getDamageValue()));
    }

    public static boolean areItemStackTagsEqualForCrafting(ItemStack slotItem, ItemStack recipeItem) {
        if (recipeItem == null || slotItem == null)
            return false;
        if (recipeItem.getTag() != null && slotItem.getTag() == null)
            return false;
        if (recipeItem.getTag() == null)
            return true;

        var recipeTag = recipeItem.getTag();
        var iterator = recipeTag != null ? recipeTag.getAllKeys().iterator() : (Iterator<String>)null;
        while (iterator != null && iterator.hasNext()) {
            String s = iterator.next();
            var tagElement = slotItem.getTagElement(s);
            if (tagElement != null) {
                var recipeTagElement = recipeItem.getTagElement(s);
                if (recipeTagElement != null && !tagElement.toString().equals(recipeTagElement.toString()))
                    return false;
                continue;
            }
            return false;
        }

        return true;
    }

    public static Ingredient getIngredient(Ingredient obj) {
        return (Ingredient)obj;
    }

    public static Ingredient getIngredient(ItemStack obj) {
        return Ingredient.of((ItemStack) obj);
    }

    // public static ArrayList<Ingredient> getIngredients(ItemStack obj) {
    //     for (int i = 0; i < catalysts.size(); i++) {
    //         this.catalyst.add(ThaumcraftApiHelper.getIngredient(catalysts.get(i)));
    //     }
    // }
}
