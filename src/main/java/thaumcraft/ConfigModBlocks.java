package thaumcraft;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import thaumcraft.api.blocks.ThaumcraftBlocks;
import thaumcraft.api.wands.StaffRod;
import thaumcraft.api.wands.WandCap;
import thaumcraft.api.wands.WandRod;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ConfigModBlocks {

    public static WandCap WAND_CAP_IRON;
    public static WandCap WAND_CAP_COPPER;
    public static WandCap WAND_CAP_GOLD;
    public static WandCap WAND_CAP_SILVER;
    public static WandCap WAND_CAP_THAUMIUM;
    public static WandCap WAND_CAP_VOID;
    public static WandRod WAND_ROD_WOOD;
    public static WandRod WAND_ROD_GREATWOOD;
    public static WandRod WAND_ROD_OBSIDIAN;
    public static WandRod WAND_ROD_BLAZE;
    public static WandRod WAND_ROD_ICE;
    public static WandRod WAND_ROD_QUARTZ;
    public static WandRod WAND_ROD_BONE;
    public static WandRod WAND_ROD_REED;
    public static WandRod WAND_ROD_SILVERWOOD;
    public static StaffRod STAFF_ROD_GREATWOOD;
    public static StaffRod STAFF_ROD_OBSIDIAN;
    public static StaffRod STAFF_ROD_BLAZE;
    public static StaffRod STAFF_ROD_ICE;
    public static StaffRod STAFF_ROD_QUARTZ;
    public static StaffRod STAFF_ROD_BONE;
    public static StaffRod STAFF_ROD_REED;
    public static StaffRod STAFF_ROD_SILVERWOOD;
    public static StaffRod STAFF_ROD_PRIMAL;

    public static Item ITEM_WAND_CASTING;
    public static Item ITEM_WAND_CAP;
    public static Item ITEM_WAND_ROD;
    public static Item ITEM_FOCUS_POUCH;
    public static Item ITEM_FOCUS_FIRE;
    public static Item ITEM_FOCUS_FROST;
    public static Item ITEM_FOCUS_SHOCK;
    public static Item ITEM_FOCUS_TRADE;
    public static Item ITEM_FOCUS_EXCAVATION;
    public static Item ITEM_FOCUS_HELLBAT;
    public static Item ITEM_FOCUS_WARDING;
    public static Item ITEM_FOCUS_PRIMAL;
    public static Item ITEM_ESSENCE;
    public static Item ITEM_WISP_ESSENCE;
    public static Item ITEM_CRYSTAL_ESSENCE;
    public static Item ITEM_RESOURCE;
    public static Item ITEM_SHARD;
    public static Item ITEM_NUGGET;
    public static Item ITEM_NUGGET_CHICKEN;
    public static Item ITEM_NUGGET_BEEF;
    public static Item ITEM_NUGGET_PORK;
    public static Item ITEM_NUGGET_FISH;
    public static Item ITEM_TRIPLE_MEAT_TREAT;
    public static Item ITEM_PHOTO_PLATE;
    public static Item ITEM_MANA_BEAN;
    public static Item ITEM_ZOMBIE_BRAIN;
    public static Item ITEM_RESEARCH_NOTES;
    public static Item ITEM_INKWELL;
    public static Item ITEM_THAUMONOMICON;
    public static Item ITEM_SPAWNER_EGG;
    public static Item ITEM_FOCUS_PORTABLE_HOLE;
    public static Item ITEM_FOCUS_PECH;
    public static Item ITEM_THAUMOMETER;
    public static Item ITEM_FLYING_CARPET;
    public static Item ITEM_GOLEM_PLACER;
    public static Item ITEM_GOLEM_BELL;
    public static Item ITEM_GOLEM_DECORATION;
    public static Item ITEM_GOLEM_CORE;
    public static Item ITEM_GOLEM_UPGRADE;
    public static Item ITEM_ARCANE_DOOR;
    public static Item ITEM_JAR_FILLED;
    public static Item ITEM_JAR_NODE;
    public static Item ITEM_KEY;

    public static void initBlocks(DeferredRegister<Block> blockRegistry) {
        //ThaumcraftBlocks.oreAmber = 
    }
}
