package thaumcraft.api.items;

import java.util.function.Supplier;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thaumcraft.Thaumcraft;
import thaumcraft.api.fluids.ThaumcraftFluids;

public class ThaumcraftItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Thaumcraft.MODID);

    // Example item that spawns soap water -- see /resources/assets/thaumcraft/lang/en_us.json as well
    // public static final RegistryObject<Item> SOAP_WATER_BUCKET = ITEMS.register("soap_water_bucket", () -> getBucketItem(ThaumcraftFluids.SOURCE_SOAP_WATER, 1));
    public static final RegistryObject<Item> FLUX_GOO_BUCKET = ITEMS.register("flux_goo_bucket", () -> getBucketItem(ThaumcraftFluids.SOURCE_FLUX_GOO, 1));
    public static final RegistryObject<Item> FLUX_GAS_BUCKET = ITEMS.register("flux_gas_bucket", () -> getBucketItem(ThaumcraftFluids.SOURCE_FLUX_GAS, 1));
    public static final RegistryObject<Item> PURE_FLUID_BUCKET = ITEMS.register("pure_fluid_bucket", () -> getBucketItem(ThaumcraftFluids.SOURCE_PURE_FLUID, 1));
    public static final RegistryObject<Item> DEATH_FLUID_BUCKET = ITEMS.register("death_fluid_bucket", () -> getBucketItem(ThaumcraftFluids.SOURCE_DEATH_FLUID, 1));

    private static BucketItem getBucketItem(Supplier<? extends Fluid> source, int stackCount) {
        return new BucketItem(source, new Item.Properties().tab(ThaumcraftCreativeModeTab.THAUMCRAFT_TAB).craftRemainder(Items.BUCKET).stacksTo(stackCount));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
