package otamusan.nechc.common.gamestart;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import otamusan.nechc.NECHeavyCrafting;

public class giveItems {
	@SubscribeEvent
	public void giveItem(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		NBTTagCompound nbt = player.getEntityData();
		if (!nbt.hasKey(NECHeavyCrafting.MOD_ID + "_first")) {
			give(player);
		}
	}

	public void give(EntityPlayer player) {
		player.addItemStackToInventory(new ItemStack(Blocks.PISTON));
		player.addItemStackToInventory(new ItemStack(Blocks.CRAFTING_TABLE));

		player.getEntityData().setBoolean(NECHeavyCrafting.MOD_ID + "_first", false);
	}
}
