package fr.iamacat.Items;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class experienceApple extends Item{
    public experienceApple(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("ExperienceApple");
        this.setTextureName("eamod:experienceapple");
        this.setMaxStackSize(1);
        this.setContainerItem(this);
    }

    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ){
    	/*if (world.getBlock(x,y,z)==Blocks.glass) {
    		if (!experiencePull(player, 50,world)){return false;}
    		if (eaMain.particle==false && world.isRemote){
    			for (int i = 0; i < 20; i++){
				world.spawnParticle("fireworksSpark",x+Math.random(),y+Math.random(),z+Math.random(),0.0D,0.0D,0.0D);
			}
    		}
    		world.setBlock(x,y,z,eaMain.ritualGlassTier1);
    	}else if(world.getBlock(x,y,z)==Blocks.redstone_block){
    		if (!experiencePull(player, 50,world)){return false;}
    		if (eaMain.particle==false && world.isRemote){
    			for (int i = 0; i < 20; i++){
				world.spawnParticle("fireworksSpark",x+Math.random(),y+Math.random(),z+Math.random(),0.0D,0.0D,0.0D);
			}
    		}
    		world.setBlock(x,y,z,eaMain.highFrequencyRedStoneBlock);
    	}*/

    	if (world.getBlock(x,y,z)==Blocks.glass) {
    			experiencePull(player,50,world);
    		if (!eaMain.particle){
        	for (int i = 0; i < 20; i++){
				world.spawnParticle("fireworksSpark",x+Math.random(),y+Math.random(),z+Math.random(),0.0D,0.0D,0.0D);
			}
    		}
    		world.setBlock(x,y,z,eaMain.ritualGlassTier1);
    	}else if(world.getBlock(x,y,z)==Blocks.redstone_block){
    		experiencePull(player,50,world);
    		if (!eaMain.particle){
        	for (int i = 0; i < 20; i++){
				world.spawnParticle("fireworksSpark",x+Math.random(),y+Math.random(),z+Math.random(),0.0D,0.0D,0.0D);
			}
    		}
    		world.setBlock(x,y,z,eaMain.highFrequencyRedStoneBlock);
    	}
		return false;
	}

    public static boolean experiencePull(EntityPlayer player,int n,World world){
    	if (player!=null && !world.isRemote){
    		for (int i = 0; i <= n; i++){
    			if (!(player.experienceLevel>0)){
    				player.experience=0;
    				player.experienceLevel=0;
    				return false;
    			}

    			if (player.experience>0){
    				player.experience-=1F/player.xpBarCap();
    			}else{
    				player.experienceLevel--;
    				player.experience=1;
    			}

    			player.experienceLevel--;
    			player.addExperienceLevel(1);
    		}
    	}else{
    		return false;
    	}
    	return true;
    }
}
