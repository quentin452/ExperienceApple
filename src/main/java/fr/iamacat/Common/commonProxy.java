package Common;
 
import ExperienceApple.PlayerTick;
import TileEntitys.tileAccelerateBlock;
import TileEntitys.tileAdvancedAccelerateBlock;
import TileEntitys.tileAdvancedgrowthStone;
import TileEntitys.tileEntityUserRegistrationStone;
import TileEntitys.tileRitualLauncher;
import TileEntitys.tileSuperHopper;
import TileEntitys.tilegrowthStone;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
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