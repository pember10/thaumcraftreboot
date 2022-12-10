package thaumcraft.api.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thaumcraft.Thaumcraft;
import thaumcraft.api.fluids.ThaumcraftFluids;
import thaumcraft.api.items.ThaumcraftCreativeModeTab;
import thaumcraft.api.items.ThaumcraftItems;
import thaumcraft.common.blocks.BlockDeathFluid;
import thaumcraft.common.blocks.BlockFluxGas;
import thaumcraft.common.blocks.BlockFluxGoo;
import thaumcraft.common.blocks.BlockPureFluid;

import java.util.function.Supplier;

public class ThaumcraftBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Thaumcraft.MODID);

    // public static final RegistryObject<LiquidBlock> SOAP_WATER_BLOCK = BLOCKS.register("soap_water_block", () -> new LiquidBlock(ThaumcraftFluids.SOURCE_SOAP_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> FLUX_GOO_BLOCK = registerBlock("flux_goo_block", BlockFluxGoo::new, ThaumcraftCreativeModeTab.THAUMCRAFT_TAB);
    public static final RegistryObject<LiquidBlock> FLUX_GAS_BLOCK = registerBlock("flux_gas_block", BlockFluxGas::new, ThaumcraftCreativeModeTab.THAUMCRAFT_TAB);
    public static final RegistryObject<LiquidBlock> PURE_FLUID_BLOCK = registerBlock("pure_fluid_block", BlockPureFluid::new, ThaumcraftCreativeModeTab.THAUMCRAFT_TAB);
    public static final RegistryObject<LiquidBlock> DEATH_FLUID_BLOCK = registerBlock("death_fluid_block", BlockDeathFluid::new, ThaumcraftCreativeModeTab.THAUMCRAFT_TAB);
    
    
    //public static final RegistryObject<Block> OREAMBER = BLOCKS.register("oreamber", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,3.0F).sound(SoundType.STONE).harvestTool(???).harvestLevel(???)));
    public static Block ORE_CINNABAR;
    public static Block ORE_INFUSED_AIR;
    public static Block ORE_INFUSED_FIRE;
    public static Block ORE_INFUSED_WATER;
    public static Block ORE_INFUSED_EARTH;
    public static Block ORE_INFUSED_ORDER;
    public static Block ORE_INFUSED_ENTROPY;
    public static Block SHARD_AIR;
    public static Block SHARD_FIRE;
    public static Block SHARD_WATER;
    public static Block SHARD_EARTH;
    public static Block SHARD_ORDER;
    public static Block SHARD_ENTROPY;
    public static Block ORE_AMBER;
    public static Block QUICKSILVER;
    public static Block GEM_AMBER;
    public static Block NUGGET_IRON;
    public static Block NUGGET_COPPER;
    public static Block NUGGET_TIN;
    public static Block NUGGET_SILVER;
    public static Block NUGGET_LEAD;
    public static Block NUGGET_THAUMIUM;
    public static Block NUGGET_VOID;
    public static Block NUGGET_QUICKSILVER;
    public static Block NUGGET_GOLD;
    public static Block INGOT_THAUMIUM;
    public static Block INGOT_VOID;
    public static Block CLUSTER_IRON;
    public static Block CLUSTER_COPPER;
    public static Block CLUSTER_TIN;
    public static Block CLUSTER_SILVER;
    public static Block CLUSTER_LEAD;
    public static Block CLUSTER_CINNABAR;
    public static Block CLUSTER_GOLD;
    public static Block LOG_WOOD;
    public static Block PLANK_WOOD;
    public static Block SLAB_WOOD;
    public static Block TREE_SAPLING;

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block,
                                                                            CreativeModeTab tab) {
        return ThaumcraftItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
