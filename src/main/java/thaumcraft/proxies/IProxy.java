package thaumcraft.proxies;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.InterModComms;
import net.minecraft.world.item.BlockItem;

public interface IProxy {
    void preInit(FMLCommonSetupEvent commonSetupEvent);

    void initClient(FMLClientSetupEvent clientSetupEvent);

    void initServer(FMLDedicatedServerSetupEvent serverSetupEvent);

    void postInit(FMLLoadCompleteEvent modLoadCompleteEvent);

    Level getClientLevel(); //formerly getClientWorld()

    boolean getIsSinglePlayer();

    boolean isShiftKeyDown();

    void registerModel(BlockItem itemBlock);

    void checkInterModComs(InterModComms.IMCMessage imcMessage);
}
