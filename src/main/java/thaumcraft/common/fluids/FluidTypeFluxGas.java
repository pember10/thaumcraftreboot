package thaumcraft.common.fluids;

import com.mojang.math.Vector3f;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fluids.FluidType;
import thaumcraft.Thaumcraft;
import thaumcraft.api.fluids.BaseFluidType;

public class FluidTypeFluxGas extends BaseFluidType {
    public static ResourceLocation STILL = new ResourceLocation(Thaumcraft.MODID, "blocks/flux_gas");
    public static ResourceLocation FLOWING = new ResourceLocation(Thaumcraft.MODID, "blocks/flux_gas");
    public static ResourceLocation OVERLAY = new ResourceLocation(Thaumcraft.MODID, "blocks/flux_gas");

    public FluidTypeFluxGas() {
        super(STILL, FLOWING, OVERLAY,
            0xBA8A14BD, new Vector3f(138f / 255f, 20f / 255f, 189f / 255f),
            FluidType.Properties.create().lightLevel(7).density(-4).viscosity(2500));
        //TODO Auto-generated constructor stub
    }
    
}
