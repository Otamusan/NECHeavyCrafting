package otamusan.nechc;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import otamusan.nechc.common.CommonProxy;

@Mod(modid = NECHeavyCrafting.MOD_ID, name = NECHeavyCrafting.MOD_NAME, version = NECHeavyCrafting.MOD_VERSION, acceptedMinecraftVersions = NECHeavyCrafting.MOD_ACCEPTED_MC_VERSIONS, useMetadata = true)

public class NECHeavyCrafting {
	public static final String MOD_ID = "necheavycrafting";
	public static final String MOD_NAME = "NECHeavyCrafting";
	public static final String MOD_VERSION = "0.0.1";
	public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.12.2]";
	@SidedProxy(serverSide = "otamusan.nechc.common.CommonProxy", clientSide = "otamusan.nechc.client.ClientProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.registerEventHandlers();
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}
}
