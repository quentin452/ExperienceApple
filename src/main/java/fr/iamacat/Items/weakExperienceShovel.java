package Items;

import ExperienceApple.eaMain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class weakExperienceShovel extends ItemSpade{
	public static int count=0;
	public static boolean countF=false;

    public weakExperienceShovel(){
    	super(Item.ToolMaterial.IRON);
        setCreativeTab(eaMain.tabAdd)
        .setUnlocalizedName("weakExperienceShovel")
        .setTextureName("eamod:weakExperienceShovel")
        .setMaxStackSize(1);
    }


    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ){
    		if (0<itemstack.getItemDamage() && player.experienceLevel>1){
    			experienceApple.experiencePull(player,5,world);
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
    			experienceApple.experiencePull(player,5,world);
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
