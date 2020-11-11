package com.gato.forgecraftcustomrecipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.gato.forgecraftcustomrecipes.proxy.CommonProxy;

@Mod(modid = ForgecraftCustomRecipes.MODID, name = ForgecraftCustomRecipes.NAME, version = ForgecraftCustomRecipes.VERSION)
public class ForgecraftCustomRecipes
{
    public static final String MODID = "forgecraftcustomrecipes";
    public static final String NAME = "ForgeCraft Custom Recipes";
    public static final String VERSION = "1.0";
	public static final String CLIENT_PROXY_CLASS = "com.gato.forgecraftcustomrecipes.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.gato.forgecraftcustomrecipes.proxy.CommonProxy";

    private static Logger logger;
    
	@Instance
	public static ForgecraftCustomRecipes instance;
	
	@SidedProxy(clientSide = ForgecraftCustomRecipes.CLIENT_PROXY_CLASS, serverSide = ForgecraftCustomRecipes.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
