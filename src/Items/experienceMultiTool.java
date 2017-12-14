package Items;

import ExperienceApple.eaMain;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class experienceMultiTool extends ItemTool{
    public experienceMultiTool(){
    	super(1, eaMain.TmexperienceIngot, null);
        setCreativeTab(eaMain.tabAdd)
        .setUnlocalizedName("experienceMultiTool")
        .setTextureName("eamod:experienceMultiTool")
        .setMaxStackSize(1)
        .setMaxDamage(45);
    }

    @Override
	public float func_150893_a(ItemStack itemStack, Block block) {
		return this.efficiencyOnProperMaterial;
	}

    @Override
	public boolean func_150897_b(Block block) {
		return true;
	 }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ){
    		if (0<itemstack.getItemDamage() && player.experienceLevel>1){
    			experienceApple.experiencePull(player,1,world);
    			if (!eaMain.particle){
    	        	for (int i = 0; i < 20; i++){
    					world.spawnParticle("happyVillager",player.posX+Math.random(),player.posY+Math.random()*2-1,player.posZ+Math.random(),0.0D,0.0D,0.0D);
    				}
    	    		}
    			itemstack.setItemDamage(itemstack.getItemDamage() - 1);
    		}
    	return false;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
    		if (0<item.getItemDamage() && player.experienceLevel>1){
    			experienceApple.experiencePull(player,1,world);
    			if (!eaMain.particle){
    	        	for (int i = 0; i < 20; i++){
    					world.spawnParticle("happyVillager",player.posX+Math.random(),player.posY+Math.random()*2-1,player.posZ+Math.random(),0.0D,0.0D,0.0D);
    				}
    	    		}
    			item.setItemDamage(item.getItemDamage() - 1);
    		}
        return item;
    }
}
