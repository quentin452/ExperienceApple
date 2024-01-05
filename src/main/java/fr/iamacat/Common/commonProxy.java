package fr.iamacat.Common;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.iamacat.ExperienceApple.PlayerTick;
import fr.iamacat.TileEntitys.*;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class commonProxy {
	public World getClientWorld() {
		return null;
	}
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
        MinecraftForge.EVENT_BUS.register(new PlayerTick());
        FMLCommonHandler.instance().bus().register(new PlayerTick());
	}
}
