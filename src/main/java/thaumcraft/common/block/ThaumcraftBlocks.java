package thaumcraft.common.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thaumcraft.Thaumcraft;
import thaumcraft.api.items.ThaumcraftCreativeModeTab;
import thaumcraft.api.items.ThaumcraftItems;

import java.util.function.Supplier;

public class ThaumcraftBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Thaumcraft.MOD_ID);

    public static final RegistryObject<Block> TABLE_WOOD = registerBlock("table_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).requiresCorrectToolForDrops()),
            ThaumcraftCreativeModeTab.THAUMCRAFT_TAB);  // Add chained properties after "of()", e.g. .lightLevel().explosionResistance().etc.

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> result = BLOCKS.register(name, block);
        registerBlockItem(name, result, tab);
        return result;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ThaumcraftItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
