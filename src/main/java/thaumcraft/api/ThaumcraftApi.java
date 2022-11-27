package thaumcraft.api;

import java.util.ArrayList;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import thaumcraft.api.internal.DummyInternalMethodHandler;
import thaumcraft.api.internal.IInternalMethodHandler;

public class ThaumcraftApi {
    //public static Item.Material toolMatThaumium = EnumHelp
    //addToolMaterial(java.lang.String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) 
    
    public static ArrayList<Block> portableHoleBlackList = new ArrayList<Block>();
    public static IInternalMethodHandler internalMethods = (IInternalMethodHandler)new DummyInternalMethodHandler();
}
