package fr.iamacat.Items;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class experienceBoneMeal extends Item{
    public experienceBoneMeal(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("experienceBoneMeal");
        this.setTextureName("eamod:experienceBoneMeal");
    }

    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ){
    	if (world.isRemote)return true;
    	if (item.getItemDamage()>=64)return true;
		for (int ix = 0; ix < 50; ix++){
			world.getBlock(x,y,z).updateTick(world,x,y,z,new Random());
		}
    	for (int i = 0; i < 50; i++){
			double rx=x+Math.random();
        	double ry=y+Math.random();
        	double rz=z+Math.random();
        	world.spawnParticle("happyVillager",rx,ry,rz,0.0D,0.0D,0.0D);
    	}
    	item.stackSize--;
		return true;
	}
}
