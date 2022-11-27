package thaumcraft.common.config;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.ForgeRegistries;
import thaumcraft.Thaumcraft;
import thaumcraft.api.ThaumcraftApi;

public class ConfigBlocks {

    
    // public static Fluid FLUXGOO = (new Fluid("fluxGoo")).setGaseous(false).setLuminosity(7).setDensity(8).setViscosity(6000);
    // public static Fluid FLUXGAS = (new Fluid("fluxGas")).setGaseous(true).setLuminosity(7).setDensity(-4).setViscosity(2500);
    // public static Fluid FLUIDPURE = (new Fluid("fluidPure")).setGaseous(false).setLuminosity(10).setViscosity(1000).setRarity(EnumRarity.rare);
    // public static Fluid FLUIDDEATH = (new Fluid("fluidDeath")).setGaseous(false).setLuminosity(8).setViscosity(1500).setRarity(EnumRarity.rare); public static Block blockFluxGoo; public static Block blockFluxGas; public static Block blockFluidPure; public static Block blockFluidDeath; public static Block blockHole; public static Block blockArcaneFurnace; public static Block blockMetalDevice; public static Block blockMagicalLog; public static Block blockStoneDevice; public static Block blockWoodenDevice; public static Block blockMagicalLeaves; public static Block blockTable; public static Block blockChestHungry; public static Block blockCustomOre; public static Block blockCustomPlant; public static Block blockCandle; public static Block blockJar; public static Block blockArcaneDoor; public static Block blockWarded; public static Block blockLifter; public static Block blockAiry;
    // public static LiquidBlock FLUX_GOO = new LiquidBlock(null, null)
    // public static Block blockCrystal;

    // public static void init() {
    //     initializeBlocks();
    //     registerBlocks();
    //     registerTileEntities();

    //     blockCustomOre.setHarvestLevel("pickaxe", 2, 0);
    //     blockCustomOre.setHarvestLevel("pickaxe", 2, 7);

    //     ThaumcraftApi.portableHoleBlackList.add(blockFluxGoo);
    //     ThaumcraftApi.portableHoleBlackList.add(blockFluxGas);
    //     ThaumcraftApi.portableHoleBlackList.add(blockArcaneFurnace);
    //     ThaumcraftApi.portableHoleBlackList.add(blockEldritch);
    //     ThaumcraftApi.portableHoleBlackList.add(blockEldritchPortal);
    //     ThaumcraftApi.portableHoleBlackList.add(Blocks.PISTON);
    //     ThaumcraftApi.portableHoleBlackList.add(Blocks.PISTON_HEAD);
    //     ThaumcraftApi.portableHoleBlackList.add(Blocks.STICKY_PISTON);
        
    //     // Add all doors and beds in the registry
    //     ForgeRegistries.BLOCKS.forEach(x -> {
    //         if (x instanceof DoorBlock
    //             || x instanceof BedBlock) {
    //             ThaumcraftApi.portableHoleBlackList.add(x);
    //         }
    //     });
        
    // }

    // public static void initializeBlocks() {
        

    //     ForgeRegistries.FLUIDS.register("flux_goo", new Fluid());
    // }

    // private static Block registerBlock(Block block) {
    //     return registerBlock(block, new Item(block));
    // }

    // private static Block registerBlock(Block block, Item itemBlock) {
    //     ForgeRegistries.BLOCKS.register(block.toString(), block);
    //     ForgeRegistries.ITEMS.register(itemBlock.toString(), itemBlock);
    //     Thaumcraft.proxy.registerModel(itemBlock);
    //     return block;
    // }

    // private static Block registerBlock(Block block, Class clazz) {
    //     ForgeRegistries.BLOCKS.register((IForgeRegistryEntry) block);
    //     try {
    //         ItemBlock itemBlock = (ItemBlock) clazz.getConstructors()[0].newInstance(new Object[] { block });
    //         itemBlock.setRegistryName(block.getRegistryName());
    //         ForgeRegistries.ITEMS.register((IForgeRegistryEntry) itemBlock);
    //         Thaumcraft.proxy.registerModel(itemBlock);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     return block;
    // }
}
