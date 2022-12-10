package thaumcraft.common.fluids;

import com.mojang.math.Vector3f;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fluids.FluidType;
import thaumcraft.Thaumcraft;
import thaumcraft.api.fluids.BaseFluidType;

public class FluidTypePureFluid extends BaseFluidType {
    public static ResourceLocation STILL = new ResourceLocation(Thaumcraft.MODID, "blocks/fluid_pure");
    public static ResourceLocation FLOWING = new ResourceLocation(Thaumcraft.MODID, "blocks/fluid_pure");
    public static ResourceLocation OVERLAY = new ResourceLocation(Thaumcraft.MODID, "blocks/fluid_pure");

    public FluidTypePureFluid() {
        super(STILL, FLOWING, OVERLAY,
            0x996F8BA5, new Vector3f(111f / 255f, 139f / 255f, 165f / 255f),
            FluidType.Properties.create().lightLevel(10).viscosity(1000).rarity(Rarity.RARE));
        //TODO Auto-generated constructor stub
    }
    
}
