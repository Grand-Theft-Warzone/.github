package com.alpha;


import com.alpha.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = "cashitem", name = "Cash Item Mod", version = "1.0")
public class CashItem {

    @Mod.Instance
    public static CashItem instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static com.alpha.proxy.CommonProxy proxy;

    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

        LOGGER.info("Hello, world!");

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){



    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){



    }
}
