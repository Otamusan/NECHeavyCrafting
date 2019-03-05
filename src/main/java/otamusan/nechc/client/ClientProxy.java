package otamusan.nechc.client;

import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;

public class ClientProxy extends otamusan.nechc.common.CommonProxy {

	@Override
	public void preInit() {
		super.preInit();
	}

	@Override
	public void init() {
		super.init();
	}

	public void postInit() {
		super.postInit();
	}

	@Override
	public World getClientWorld() {
		return FMLClientHandler.instance().getClient().world;
	}

	@Override
	public void registerTileEntity() {
		super.registerTileEntity();
	}

	@Override
	public void registerEventHandlers() {
		super.registerEventHandlers();
	}
}