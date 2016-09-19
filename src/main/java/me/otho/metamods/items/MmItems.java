package me.otho.metamods.items;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import me.otho.metamods.core.registry.RegisterHandler;
import me.otho.metamods.items.meta.ItemRegister;
import me.otho.metamods.items.proxy.CommonProxy;

@Mod(modid = MmItems.MOD_ID, name = MmItems.MOD_NAME, version = MmItems.VERSION)
public class MmItems
{
    public static final String MOD_ID = "mm-items";
    public static final String MOD_NAME = "MM-Items";
    public static final String VERSION = "0.0.1";
    
    @Mod.Instance(MOD_ID)
	public static MmItems instance;    
    
    
    @SidedProxy(serverSide = "me.otho.metamods.items.proxy.CommonProxy", clientSide = "me.otho.metamods.items.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        // some example code
        RegisterHandler.addRegisterType(MOD_ID + "." + "item", new ItemRegister() );
    }
}