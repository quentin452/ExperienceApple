package Items;

import java.util.Random;

import ExperienceApple.eaMain;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class timeOfSand extends Item{
    public timeOfSand(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("timeOfSand");
        this.setTextureName("eamod:timeOfSand");
    }

    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ){
    	if (world.isRemote)return true;
    	if (item.getItemDamage()>=64)return true;
    	
		for (int ix = 0; ix < 50; ix++){
			world.getBlock(x,y,z).updateTick(world,x,y,z,new Random());
		}
		if (world.isRemote)return true;
		if (world.getBlock(x,y,z)==eaMain.accelerateStone)return true;
		if (world.getBlock(x,y,z)==eaMain.advancedAccelerateStone)return true;
		TileEntity entity=(TileEntity)world.getTileEntity(x, y, z);
		if (entity==null)return true;
		if (entity.isInvalid())return true;
		if (entity instanceof ITickable)return true;
		for (int ix = 0; ix < 1000; ix++){
			entity.updateEntity();
		}
    	item.stackSize--;
		return true;
	}
}