package thaumcraft.api.items;

import java.util.function.Supplier;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thaumcraft.Thaumcraft;

public class ThaumcraftItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Thaumcraft.MOD_ID);

    // [Paul] Tutorial uses Zircon, I decided to use Brain
    public static final RegistryObject<Item> BRAIN = ITEMS.register("brain",
            () -> new Item(new Item.Properties().tab(ThaumcraftCreativeModeTab.THAUMCRAFT_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
