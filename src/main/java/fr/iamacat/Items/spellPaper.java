package Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class spellPaper extends Item{
	public static boolean ability=false;
	public static String abilityName;
    public spellPaper(String Name){
    	abilityName=Name;
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
    	if (world.isRemote){
    		Entity entity=(Entity)player;
    		PlayerCapabilities capabilities=((EntityPlayer)entity).capabilities;
    		if (ability==true) {
    			ability=false;
    			capabilities.allowFlying=false;
    			player.addChatMessage(new ChatComponentTranslation("off"));
    		}else{
    			ability=true;
    			player.addChatMessage(new ChatComponentTranslation("on"));
    		}
    		//System.out.println(canFly);
    		NBTTagCompound nbt=player.getEntityData();
    		nbt.setBoolean(abilityName,ability);
    	}
    	return item;
    }
}
