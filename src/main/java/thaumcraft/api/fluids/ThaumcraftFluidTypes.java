package thaumcraft.api.fluids;

import com.mojang.math.Vector3f;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import thaumcraft.Thaumcraft;
import thaumcraft.common.fluids.FluidTypeDeathFluid;
import thaumcraft.common.fluids.FluidTypeFluxGas;
import thaumcraft.common.fluids.FluidTypeFluxGoo;
import thaumcraft.common.fluids.FluidTypePureFluid;

public class ThaumcraftFluidTypes {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Thaumcraft.MODID);

    // public static final ResourceLocation SOAP_OVERLAY_RL = new ResourceLocation(Thaumcraft.MODID, "misc/in_soap_water");
    // public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("blocks/water_still");
    // public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("blocks/water_flow");
    // private static final FluidType.Properties SOAP_WATER_FLUID_TYPE_PROPERTIES = FluidType.Properties.create().viscosity(0).sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
    // public static final RegistryObject<FluidType> SOAP_WATER_FLUID_TYPE = register("soap_water_fluid", WATER_STILL_RL, WATER_FLOWING_RL, SOAP_OVERLAY_RL, 0xA1E038D0, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), SOAP_WATER_FLUID_TYPE_PROPERTIES);

    public static final RegistryObject<FluidType> FLUX_GOO_FLUID_TYPE = register("flux_goo_fluid", new FluidTypeFluxGoo());
    public static final RegistryObject<FluidType> FLUX_GAS_TYPE = register("flux_gas_fluid", new FluidTypeFluxGas());
    public static final RegistryObject<FluidType> PURE_FLUID_TYPE = register("pure_fluid", new FluidTypePureFluid());
    public static final RegistryObject<FluidType> DEATH_FLUID_TYPE = register("death_fluid", new FluidTypeDeathFluid());
    
    private static RegistryObject<FluidType> register(String name, ResourceLocation still, ResourceLocation flowing, ResourceLocation overlay, int tint, Vector3f fogColor, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(still, flowing, overlay, tint, fogColor, properties));
    }

    private static RegistryObject<FluidType> register(String name, BaseFluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
