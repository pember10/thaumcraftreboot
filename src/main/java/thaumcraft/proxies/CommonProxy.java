package thaumcraft.proxies;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.InterModComms.IMCMessage;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

public class CommonProxy implements IProxy {

    @Override
    public void preInit(FMLCommonSetupEvent commonSetupEvent) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void initClient(FMLClientSetupEvent clientSetupEvent) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void initServer(FMLDedicatedServerSetupEvent serverSetupEvent) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void postInit(FMLLoadCompleteEvent modLoadCompleteEvent) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Level getClientLevel() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean getIsSinglePlayer() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isShiftKeyDown() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void registerModel(BlockItem itemBlock) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void checkInterModComs(IMCMessage imcMessage) {
        // TODO Auto-generated method stub
        
    }
     
}
