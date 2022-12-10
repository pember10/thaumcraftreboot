package thaumcraft.common.blocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import thaumcraft.api.fluids.ThaumcraftFluids;

public class BlockFluxGas extends LiquidBlock {

    public BlockFluxGas() {
        super(ThaumcraftFluids.FLOWING_FLUX_GAS, BlockBehaviour.Properties.copy(Blocks.WATER));
        //TODO Auto-generated constructor stub
    }
    
}
