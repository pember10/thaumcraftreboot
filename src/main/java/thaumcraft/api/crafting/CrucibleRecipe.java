package thaumcraft.api.crafting;

import java.util.ArrayList;

import net.minecraft.world.item.ItemStack;
import thaumcraft.api.ThaumcraftApiHelper;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class CrucibleRecipe {
    private ItemStack recipeOutput;
    public Object catalyst;
    public AspectList aspects;
    public String key;
    public int hash;

    public CrucibleRecipe(String researchKey, ItemStack result, Object cat, AspectList tags) {
        this.recipeOutput = result;
        this.aspects = tags;
        this.key = researchKey;
        this.catalyst = cat;

        var hc = researchKey + result.toString();

        if (cat instanceof String) {
            //this.catalyst = OreDictionary.getOres((String)cat);
        }
        
        for (Aspect tag : tags.getAspects()) {
            hc += tag.getTag() + tags.getAmount(tag);
        }

        if (cat instanceof ItemStack) {
            hc += ((ItemStack) cat).toString();
        }
        else if (cat instanceof ArrayList && ((ArrayList)this.catalyst).size() > 0) {
            for (ItemStack is : ((ArrayList<ItemStack>)this.catalyst)) {
                hc += is.toString();
            }
        }

        this.hash = hc.hashCode();
    }

    public boolean matches(AspectList itags, ItemStack cat) {
        if (this.catalyst instanceof ItemStack
                && !ThaumcraftApiHelper.itemMatches((ItemStack) this.catalyst, cat, false)) {
            return false;
        }

        ItemStack[] ores = (ItemStack[]) ((ArrayList) this.catalyst).toArray((Object[]) new ItemStack[0]);
        if (this.catalyst instanceof ArrayList && ((ArrayList) this.catalyst).size() > 0
                && !ThaumcraftApiHelper.containsMatch(false, new ItemStack[] { cat }, ores))
            return false;

        if (itags == null)
            return false;
        for (Aspect tag : this.aspects.getAspects()) {
            if (itags.getAmount(tag) < this.aspects.getAmount(tag))
                return false;
        }
        return true;
    }
}
