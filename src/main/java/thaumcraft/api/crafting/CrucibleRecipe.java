package thaumcraft.api.crafting;

import java.util.ArrayList;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import thaumcraft.api.ThaumcraftApiHelper;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class CrucibleRecipe implements Recipe<Container> {

    @Override
    public boolean matches(Container p_44002_, Level p_44003_) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ItemStack assemble(Container p_44001_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean canCraftInDimensions(int p_43999_, int p_44000_) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ItemStack getResultItem() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResourceLocation getId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        // TODO Auto-generated method stub
        return null;
    }

    




    
    // private ItemStack recipeOutput;
    // public ArrayList<Ingredient> catalyst;
    // public AspectList aspects;
    // public String key;
    // public int hash;

    // /**
    //  * @param researchKey
    //  * @param result
    //  * @param cat
    //  * @param tags
    //  */
    // public CrucibleRecipe(String researchKey, ItemStack result, ItemStack cat, AspectList tags) {
    //     this.recipeOutput = result;
    //     this.aspects = tags;
    //     this.key = researchKey;
    //     this.catalyst = new ArrayList<Ingredient>();
        
    //     catalyst.add(ThaumcraftApiHelper.getIngredient(cat));

    //     var hc = researchKey + result.toString();

    //     for (Aspect tag : tags.getAspects()) {
    //         hc += tag.getTag() + tags.getAmount(tag);
    //     }

    //     hc += ((ItemStack) cat).toString();

    //     this.hash = hc.hashCode();
    // }

    // public CrucibleRecipe(String researchKey, ItemStack result, ArrayList<ItemStack> catalysts, AspectList tags) {
    //     this.recipeOutput = result;
    //     this.aspects = tags;
    //     this.key = researchKey;
        
    //     for (int i = 0; i < catalysts.size(); i++) {
    //         this.catalyst.add(ThaumcraftApiHelper.getIngredient(catalysts.get(i)));
    //     }

    //     var hc = researchKey + result.toString();

    //     for (var is : ((ArrayList<ItemStack>) this.catalyst)) {
    //         hc += is.toString();
    //     }
    // }

    // public boolean matches(AspectList itags, ItemStack cat) {
    //     if (this.catalyst instanceof ItemStack
    //             && !ThaumcraftApiHelper.itemMatches((ItemStack) this.catalyst, cat, false)) {
    //         return false;
    //     }

    //     ItemStack[] ores = (ItemStack[]) ((ArrayList) this.catalyst).toArray((Object[]) new ItemStack[0]);
    //     if (this.catalyst instanceof ArrayList && ((ArrayList) this.catalyst).size() > 0
    //             && !ThaumcraftApiHelper.containsMatch(false, new ItemStack[] { cat }, ores))
    //         return false;

    //     if (itags == null)
    //         return false;
    //     for (Aspect tag : this.aspects.getAspects()) {
    //         if (itags.getAmount(tag) < this.aspects.getAmount(tag))
    //             return false;
    //     }
    //     return true;
    // }
}
