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

//     public static final ForgeFlowingFluid.Properties SOAP_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(ThaumcraftFluidTypes.SOAP_WATER_FLUID_TYPE, ThaumcraftFluids.SOURCE_SOAP_WATER, ThaumcraftFluids.FLOWING_SOAP_WATER)
//             .slopeFindDistance(2).levelDecreasePerBlock(2)
//             .block(ThaumcraftBlocks.SOAP_WATER_BLOCK).bucket(ThaumcraftItems.SOAP_WATER_BUCKET);
//     public static final RegistryObject<FlowingFluid> SOURCE_SOAP_WATER = FLUIDS.register("soap_water_fluid", () -> new ForgeFlowingFluid.Source(SOAP_WATER_FLUID_PROPERTIES));
//     public static final RegistryObject<FlowingFluid> FLOWING_SOAP_WATER = FLUIDS.register("flowing_soap_water", () -> new ForgeFlowingFluid.Flowing(SOAP_WATER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties FLUX_GOO_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(ThaumcraftFluidTypes.FLUX_GOO_FLUID_TYPE, ThaumcraftFluids.SOURCE_FLUX_GOO, ThaumcraftFluids.FLOWING_FLUX_GOO)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ThaumcraftBlocks.FLUX_GOO_BLOCK).bucket(ThaumcraftItems.FLUX_GOO_BUCKET);
    public static final RegistryObject<FlowingFluid> SOURCE_FLUX_GOO = FLUIDS.register("flux_goo_fluid", () -> new ForgeFlowingFluid.Source(FLUX_GOO_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FLUX_GOO = FLUIDS.register("flowing_flux_goo", () -> new ForgeFlowingFluid.Source(FLUX_GOO_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties FLUX_GAS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(ThaumcraftFluidTypes.FLUX_GAS_TYPE, ThaumcraftFluids.SOURCE_FLUX_GAS, ThaumcraftFluids.FLOWING_FLUX_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ThaumcraftBlocks.FLUX_GAS_BLOCK).bucket(ThaumcraftItems.FLUX_GAS_BUCKET);
    public static final RegistryObject<FlowingFluid> SOURCE_FLUX_GAS = FLUIDS.register("flux_gas_fluid", () -> new ForgeFlowingFluid.Source(FLUX_GAS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FLUX_GAS = FLUIDS.register("flowing_flux_gas", () -> new ForgeFlowingFluid.Source(FLUX_GAS_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties PURE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(ThaumcraftFluidTypes.PURE_FLUID_TYPE, ThaumcraftFluids.SOURCE_PURE_FLUID, ThaumcraftFluids.FLOWING_PURE_FLUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ThaumcraftBlocks.PURE_FLUID_BLOCK).bucket(ThaumcraftItems.PURE_FLUID_BUCKET);
    public static final RegistryObject<FlowingFluid> SOURCE_PURE_FLUID = FLUIDS.register("pure_fluid", () -> new ForgeFlowingFluid.Source(PURE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PURE_FLUID = FLUIDS.register("flowing_pure_fluid", () -> new ForgeFlowingFluid.Source(PURE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties DEATH_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(ThaumcraftFluidTypes.DEATH_FLUID_TYPE, ThaumcraftFluids.SOURCE_DEATH_FLUID, ThaumcraftFluids.FLOWING_DEATH_FLUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ThaumcraftBlocks.DEATH_FLUID_BLOCK).bucket(ThaumcraftItems.DEATH_FLUID_BUCKET);
    public static final RegistryObject<FlowingFluid> SOURCE_DEATH_FLUID = FLUIDS.register("death_fluid", () -> new ForgeFlowingFluid.Source(DEATH_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DEATH_FLUID = FLUIDS.register("flowing_death_fluid", () -> new ForgeFlowingFluid.Source(DEATH_FLUID_PROPERTIES));

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
