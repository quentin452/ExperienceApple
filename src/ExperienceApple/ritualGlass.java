package ExperienceApple;

import java.util.List;
import java.util.UUID;

import Items.experienceApple;
import TileEntitys.tileEntityUserRegistrationStone;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class ritualGlass {
	public static Boolean ritualF[]=new Boolean [ritualLocateData.ritualAmount];
    public static boolean ritualActive(EntityPlayer player,World world, int x, int y, int z){
    	int count[]=new int [100];
        
        if (player==null){
			if (world.getBlock(x,y-2,z)==eaMain.userRegistrationStone){
		    	tileEntityUserRegistrationStone entity=(tileEntityUserRegistrationStone)world.getTileEntity(x, y-2, z);
		    	String str=entity.getString();
		    	System.out.print(str);
		    	if (str=="null")return false;
		    	UUID uuid=UUID.fromString(str);
		    	if (uuid==null)return false;
		    	player=lookupPlayer(uuid);
			}
		}
        
        if (player==null)return false;
        
        for (int in = 0; in < ritualLocateData.ritualAmount; in++){
        	outside: for (int ix = 0; ix < 3; ix++){
        		for (int iy = 0; iy < 3; iy++){
        			for (int iz = 0; iz < 3; iz++){
        				if (world.getBlock(x+ix-1,y+iy-1,z+iz-1)==ritualLocateData.Data(in,ix,iy,iz) || (ritualLocateData.Data(in,ix,iy,iz)==Blocks.air
        						&& (world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualGlassTier1 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualStoneTier1 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualLauncherTier1)
        						&& (world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualGlassTier2 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualStoneTier2 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualLauncherTier2)
        						&& (world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualGlassTier3 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualStoneTier3 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualLauncherTier3)
        						&& (world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualGlassTier4 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualStoneTier4 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)!=eaMain.ritualLauncherTier4))
        						|| (ritualLocateData.Data(in,ix,iy,iz)==eaMain.ritualGlassTier1 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)==eaMain.ritualStoneTier1)
        						|| (ritualLocateData.Data(in,ix,iy,iz)==eaMain.ritualGlassTier2 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)==eaMain.ritualStoneTier2)
        						|| (ritualLocateData.Data(in,ix,iy,iz)==eaMain.ritualGlassTier3 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)==eaMain.ritualStoneTier3)
        						|| (ritualLocateData.Data(in,ix,iy,iz)==eaMain.ritualGlassTier4 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)==eaMain.ritualStoneTier4)
        						|| (ritualLocateData.Data(in,ix,iy,iz)==eaMain.ritualGlassTier1 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)==eaMain.ritualLauncherTier1)
        						|| (ritualLocateData.Data(in,ix,iy,iz)==eaMain.ritualGlassTier2 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)==eaMain.ritualLauncherTier2)
        						|| (ritualLocateData.Data(in,ix,iy,iz)==eaMain.ritualGlassTier3 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)==eaMain.ritualLauncherTier3)
        						|| (ritualLocateData.Data(in,ix,iy,iz)==eaMain.ritualGlassTier4 && world.getBlock(x+ix-1,y+iy-1,z+iz-1)==eaMain.ritualLauncherTier4)
        						){
        					count[in]++;
        				}else{
        					break outside;
        				}
        			}
        		}
        	}
        	
        }
       
        for (int in = 0; in < ritualLocateData.ritualAmount; in++){
        	if (count[in]==27){
        		if (!ritualRemove(x,y,z,in,world,player)){
        			return false;
        		}
        		switch (in){
        			case 0:
        				world.createExplosion((Entity)null,x,y,z,5.0F,true);
        			break;
        			case 1:
        				//world.setBlock(x,y,z,eaMain.experienceGlowStone);
        				ritualBlockPlace(x,y,z,eaMain.experienceGlowStone,world);
        			break;
        			case 2:
        				//world.setBlock(x,y,z,eaMain.experienceIngotBlock);:[
        				ritualBlockPlace(x,y,z,eaMain.experienceIngotBlock,world);
        			break;
        			case 3:
        				//world.setBlock(x,y,z,eaMain.ritualGlassTier2);
        				ritualBlockPlace(x,y,z,eaMain.ritualGlassTier2,world);
        			break;
           			case 4:
        				//world.setBlock(x,y,z,eaMain.ritualGlassTier3);
           				ritualBlockPlace(x,y,z,eaMain.ritualGlassTier3,world);
        			break;
        			case 5:
        				//world.setBlock(x,y,z,eaMain.ritualGlassTier4);
        				ritualBlockPlace(x,y,z,eaMain.ritualGlassTier4,world);
        			break;
        			case 6:
        				if (!world.isRemote && player!=null){
        					player.addExperienceLevel(1);
        				}
        			break;
        			case 7:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 20*60, 1));
        				}
        			break;
        			case 8:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 20*60, 3));
        				}
        			break;
        			case 9:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 20*60, 5));
        				}
        			break;
        			case 10:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 20*60, 7));
        				}
        			break;
        			case 11:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20*60, 1));
        				}
        			break;
        			case 12:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20*60, 3));
        				}
        			break;
        			case 13:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20*60, 5));
        				}
        			break;
        			case 14:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20*60, 7));
        				}
        			break;
        			case 15:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20*60, 1));
        				}
        			break;
        			case 16:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20*60, 3));
        				}
        			break;
        			case 17:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20*60, 5));
        				}
        			break;
        			case 18:
        				if (!world.isRemote && player!=null){
        					player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20*60, 7));
        				}
        			break;
        			case 19:
        				world.setBlock(x,y,z,eaMain.erfahrungIngotBlock);
        			break;
        			case 20:
        				if (!world.isRemote){
        					ItemStack itemstack=new ItemStack(Item.getItemFromBlock(world.getBlock(x,y-1,z)));
        					EntityItem itementity=new EntityItem(world,(double)x,(double)y+2,(double)z,itemstack);
        					world.spawnEntityInWorld((Entity)itementity);
        					world.setBlock(x,y-1,z,Blocks.air);
        				}
        			break;
        			case 21:
        				for (int ix = 0; ix < 27; ix++){
        					for (int iy = 0; iy < 27; iy++){
        						for (int iz = 0; iz < 27; iz++){
        							if (world.getBlock(x+ix-13,y+iy-13,z+iz-13)==Blocks.air){
        								world.setBlock(x+ix-13,y+iy-13,z+iz-13,eaMain.experienceGas);
        							}
        						}
        					}
        				}
        			break;
        			case 22:
        				ritualBlockPlace(x-1,y,z-1,Blocks.water,world);
        				ritualBlockPlace(x,y,z-1,Blocks.water,world);
        				ritualBlockPlace(x+1,y,z-1,Blocks.water,world);
        				ritualBlockPlace(x-1,y,z,Blocks.water,world);
        				ritualBlockPlace(x,y,z,Blocks.water,world);
        				ritualBlockPlace(x+1,y,z,Blocks.water,world);
        				ritualBlockPlace(x-1,y,z+1,Blocks.water,world);
        				ritualBlockPlace(x,y,z+1,Blocks.water,world);
        				ritualBlockPlace(x+1,y,z+1,Blocks.water,world);
        			break;
        			case 23:
        				ritualBlockPlace(x-1,y,z-1,Blocks.lava,world);
        				ritualBlockPlace(x,y,z-1,Blocks.lava,world);
        				ritualBlockPlace(x+1,y,z-1,Blocks.lava,world);
        				ritualBlockPlace(x-1,y,z,Blocks.lava,world);
        				ritualBlockPlace(x,y,z,Blocks.lava,world);
        				ritualBlockPlace(x+1,y,z,Blocks.lava,world);
        				ritualBlockPlace(x-1,y,z+1,Blocks.lava,world);
        				ritualBlockPlace(x,y,z+1,Blocks.lava,world);
        				ritualBlockPlace(x+1,y,z+1,Blocks.lava,world);
        				
        			break;
        			case 24:
        				if (!world.isRemote){
        					ItemStack itemstack=new ItemStack(Item.getItemFromBlock(eaMain.ritualGlassTier1),9);
    						EntityItem itementity=new EntityItem(world,(double)x,(double)y,(double)z,itemstack);
    						//for (int i = 0; i < 9; i++){
    							world.spawnEntityInWorld((Entity)itementity);
    						//}
        				}
        			break;
        			case 25:
        				if (!world.isRemote){
        					ItemStack itemstack2=new ItemStack(Item.getItemFromBlock(eaMain.ritualGlassTier2),9);
        					EntityItem itementity2=new EntityItem(world,(double)x,(double)y,(double)z,itemstack2);
        					//for (int i = 0; i < 9; i++){
        						world.spawnEntityInWorld((Entity)itementity2);
        					//}
        				}
        			break;
        			case 26:
        				if (!world.isRemote){
        					ItemStack itemstack3=new ItemStack(Item.getItemFromBlock(eaMain.ritualGlassTier3),9);
        					EntityItem itementity3=new EntityItem(world,(double)x,(double)y,(double)z,itemstack3);
        					//for (int i = 0; i < 9; i++){
        						world.spawnEntityInWorld((Entity)itementity3);
        					//}
        				}
        			break;
        		}
        	}
        }
        return true;
    }

    public static boolean ritualRemove(int x, int y, int z, int n, World world,EntityPlayer player){
    	for (int ix = 0; ix < 3; ix++){
    		for (int iy = 0; iy < 3; iy++){
    			for (int iz = 0; iz < 3; iz++){
    				Block getBlock=world.getBlock(x+ix-1,y+iy-1,z+iz-1);

    				//EntityPlayerMP playerMP=(EntityPlayerMP)player;

    				if (getBlock==eaMain.ritualStoneTier1 || getBlock==eaMain.ritualLauncherTier1){
    					if (!experienceApple.experiencePull(player,50,world))return false;
    				}

    				if (getBlock==eaMain.ritualStoneTier2 || getBlock==eaMain.ritualLauncherTier2){
    					if (!experienceApple.experiencePull(player,50*8,world))return false;
    				}

    				if (getBlock==eaMain.ritualStoneTier3 || getBlock==eaMain.ritualLauncherTier3){
    					if (!experienceApple.experiencePull(player,50*64,world))return false;
    				}

    				if (getBlock==eaMain.ritualStoneTier4 || getBlock==eaMain.ritualLauncherTier4){
    					if (!experienceApple.experiencePull(player,50*512,world))return false;
    				}

    				if (getBlock==ritualLocateData.Data(n,ix,iy,iz)){
    					if (eaMain.particle==false && ritualLocateData.Data(n,ix,iy,iz)!=Blocks.air) {
    						for (int i = 0; i < 10; i++){
    							world.spawnParticle("fireworksSpark",x+ix-Math.random(),y+iy-Math.random(),z+iz-Math.random(),0.0D,0.0D,0.0D);
    						}
    					}
    					
    					if (!((getBlock==eaMain.ritualStoneTier1) || (getBlock==eaMain.ritualStoneTier2) || (getBlock==eaMain.ritualStoneTier3) || ((getBlock==eaMain.ritualStoneTier4)))){
    						world.setBlock(x+ix-1,y+iy-1,z+iz-1,Blocks.air);
    					}
    				}
    			}
    		}
    	}
    	return true;
    }

    public static EntityPlayer lookupPlayer(UUID playerUUID) {
    	if (playerUUID==null){return null;}
    	List<EntityPlayerMP> allPlayers = MinecraftServer.getServer().getConfigurationManager().playerEntityList;
    	for (EntityPlayerMP player : allPlayers) {
    		if (player.getUniqueID().equals(playerUUID)) {
    			return player;
    		}
    	}
    	return null;
    }
    
    public static Boolean ritualBlockPlace(int x,int y, int z,Block block,World world){
    	if (world.getBlock(x,y,z)!=Blocks.air){
    		if (!world.isRemote){
				ItemStack itemstack3=new ItemStack(Item.getItemFromBlock(block));
				EntityItem itementity3=new EntityItem(world,(double)x,(double)y-1,(double)z,itemstack3);
				world.spawnEntityInWorld((Entity)itementity3);
			}
    	}else{
    		world.setBlock(x,y,z,block);
    	}
    	return null;
    }
}
