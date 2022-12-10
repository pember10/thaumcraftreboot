package thaumcraft.common.blocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import thaumcraft.api.fluids.ThaumcraftFluids;

public class BlockDeathFluid extends LiquidBlock {

    public BlockDeathFluid() {
        super(ThaumcraftFluids.SOURCE_DEATH_FLUID, BlockBehaviour.Properties.copy(Blocks.LAVA));
        //TODO Auto-generated constructor stub
    }
    
}
