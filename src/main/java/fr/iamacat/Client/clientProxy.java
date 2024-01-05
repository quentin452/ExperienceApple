package fr.iamacat.Client;


import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.iamacat.Common.commonProxy;
import fr.iamacat.TileEntitys.*;
import net.minecraft.world.World;

public class clientProxy extends commonProxy {
	@Override
	public World getClientWorld() {
		return FMLClientHandler.instance().getClient().theWorld;
	}
	@Override
	public void registerTileEntity() {
	}
	public void registerEventHandlers() {
		 super.registerEventHandlers();

	}
}
