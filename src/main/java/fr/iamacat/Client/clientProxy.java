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
		GameRegistry.registerTileEntity(tileEntityUserRegistrationStone.class, "tileEntityUserRegistrationStone");
        GameRegistry.registerTileEntity(tileAccelerateBlock.class, "tileAccelerateBlock");
        GameRegistry.registerTileEntity(tilegrowthStone.class, "tilegrowthStone");
        GameRegistry.registerTileEntity(tileAdvancedAccelerateBlock.class, "tileAdvancedAccelerateBlock");
        GameRegistry.registerTileEntity(tileAdvancedgrowthStone.class, "tileAdvancedgrowthStone");
        GameRegistry.registerTileEntity(tileSuperHopper.class, "tileSuperHopper");
        GameRegistry.registerTileEntity(tileRitualLauncher.class, "tileRitualLauncher");
	}
	public void registerEventHandlers() {
		 super.registerEventHandlers();

	}
}
