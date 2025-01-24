package io.fom.util;

import io.fom.util.proxy.CommonProxy;
import io.fom.util.util.IconItem;
import io.fom.util.util.Var;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Var.MOD_ID,
        name = Var.MOD_NAME,
        version = Var.VERSION,
        dependencies = "required-after:forge@[14.23.1.2577,);"
)
@Mod.EventBusSubscriber
public class FomLib {
    public static final Item ICON_ITEM = new IconItem();
    public static final Logger logger = LogManager.getLogger();
    public static final SimpleNetworkWrapper network = NetworkRegistry.INSTANCE.newSimpleChannel(Var.MOD_ID);
    @Mod.Instance
    public static FomLib instance;
    @SidedProxy(clientSide = "io.fom.util.proxy.ClientProxy",
            serverSide = "io.fom.util.proxy.ServerProxy",
            modId = Var.MOD_ID)
    public static CommonProxy proxy;
    @SubscribeEvent
    public void onItemRegistryDaemon(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ICON_ITEM);
    }
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) { logger.info("Running ${Var.MOD_ID} Init"); }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Running ${Var.MOD_ID} Init");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("Running ${Var.MOD_ID} Init");
    }
}
