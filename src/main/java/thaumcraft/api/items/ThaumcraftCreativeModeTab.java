package thaumcraft.api.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ThaumcraftCreativeModeTab {
    public static final CreativeModeTab THAUMCRAFT_TAB = new CreativeModeTab("thaumcrafttab") {
        @Override
        public ItemStack makeIcon() {
            // TODO: When the proper item is created to be used as the icon, use it here
            return new ItemStack(Items.ANVIL);
        }
    };
}
