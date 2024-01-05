package fr.iamacat.Items;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class mechanicalExperienceBoneMeal extends Item{
    public mechanicalExperienceBoneMeal(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("mechanicalExperienceBoneMeal");
        this.setTextureName("eamod:mechanicalExperienceBoneMeal");
        this.setMaxStackSize(1);
        this.setMaxDamage(64);
    }

    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ){
    	if (world.isRemote)return true;
    	if (item.getItemDamage()>=64)return true;
		for (int ix = 0; ix < 50; ix++){
			world.getBlock(x,y,z).updateTick(world,x,y,z,new Random());
		}
		if (world.isRemote){
    		for (int i = 0; i < 50; i++){

    			world.spawnParticle("happyVillager",0,0,0,0.0D,0.0D,0.0D);
    		}
    	}
		this.setDamage(item,item.getItemDamage()+1);
		return true;
	}
    public boolean showDurabilityBar(){
		return true;
    }
    public boolean isItemTool(ItemStack p_77616_1_)
    {
        return super.isItemTool(p_77616_1_);
    }
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		if (0<item.getItemDamage()){
			if (experienceApple.experiencePull(player,50,world)){
				item.setItemDamage(item.getItemDamage() - 1);
			}
		}
		return item;
    }
}
