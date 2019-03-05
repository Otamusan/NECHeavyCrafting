package otamusan.nechc.common;

import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import otamusan.nechc.common.gamestart.giveItems;
import otamusan.nechc.common.heavycraft.RecipeReplacer;

public class CommonProxy {

	public void preInit() {
	}

	public void init() {
	}

	public void postInit() {
		RecipeReplacer.replaceNECRecipe();
		RecipeReplacer.replaceAll();
	}

	public World getClientWorld() {
		return null;
	}

	public void registerTileEntity() {
	}

	public void registerEventHandlers() {
		MinecraftForge.EVENT_BUS.register(new giveItems());
	}
}