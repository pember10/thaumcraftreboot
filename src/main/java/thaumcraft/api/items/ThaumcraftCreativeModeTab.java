package thaumcraft.api.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class ThaumcraftCreativeModeTab {
    public static final CreativeModeTab THAUMCRAFT_TAB = new CreativeModeTab("thaumcrafttab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            // TBD: When the proper item is created to be used as the icon, use it here. For now, use an Anvil
            return new ItemStack(Items.ANVIL);
        }
    };
}
