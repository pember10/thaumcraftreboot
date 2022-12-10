package thaumcraft.common.blocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import thaumcraft.api.fluids.ThaumcraftFluids;

public class BlockPureFluid extends LiquidBlock {

    public BlockPureFluid() {
        super(ThaumcraftFluids.FLOWING_PURE_FLUID, BlockBehaviour.Properties.copy(Blocks.WATER));
        //TODO Auto-generated constructor stub
    }
    
}
