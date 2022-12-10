package thaumcraft.common.fluids;

import com.mojang.math.Vector3f;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fluids.FluidType;
import thaumcraft.Thaumcraft;
import thaumcraft.api.fluids.BaseFluidType;

public class FluidTypeDeathFluid extends BaseFluidType {
    public static ResourceLocation STILL = new ResourceLocation(Thaumcraft.MODID, "blocks/fluid_death");
    public static ResourceLocation FLOWING = new ResourceLocation(Thaumcraft.MODID, "blocks/fluid_death");
    public static ResourceLocation OVERLAY = new ResourceLocation(Thaumcraft.MODID, "blocks/fluid_death");

    public FluidTypeDeathFluid() {
        super(STILL, FLOWING, OVERLAY,
            0xDE350066, new Vector3f(53f / 255f, 0f / 255f, 102f / 255f),
            FluidType.Properties.create().lightLevel(8).viscosity(1500).rarity(Rarity.RARE));
        //TODO Auto-generated constructor stub
    }
    
}
