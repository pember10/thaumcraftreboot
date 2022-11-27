package thaumcraft.api.fluids;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thaumcraft.Thaumcraft;
import thaumcraft.api.blocks.ThaumcraftBlocks;
import thaumcraft.api.items.ThaumcraftItems;

public class ThaumcraftFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Thaumcraft.MODID);

    public static final ForgeFlowingFluid.Properties SOAP_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(ThaumcraftFluidTypes.SOAP_WATER_FLUID_TYPE, ThaumcraftFluids.SOURCE_SOAP_WATER, ThaumcraftFluids.FLOWING_SOAP_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ThaumcraftBlocks.SOAP_WATER_BLOCK).bucket(ThaumcraftItems.SOAP_WATER_BUCKET);
    public static final RegistryObject<FlowingFluid> SOURCE_SOAP_WATER = FLUIDS.register("soap_water_fluid", () -> new ForgeFlowingFluid.Source(ThaumcraftFluids.SOAP_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SOAP_WATER = FLUIDS.register("flowing_soap_water", () -> new ForgeFlowingFluid.Flowing(ThaumcraftFluids.SOAP_WATER_FLUID_PROPERTIES));

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
