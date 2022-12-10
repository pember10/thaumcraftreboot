package thaumcraft.common.blocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import thaumcraft.api.fluids.ThaumcraftFluids;

public class BlockFluxGoo extends LiquidBlock {

    public BlockFluxGoo() {
        super(ThaumcraftFluids.SOURCE_FLUX_GOO, BlockBehaviour.Properties.copy(Blocks.LAVA));
        //TODO Auto-generated constructor stub
    }
}
