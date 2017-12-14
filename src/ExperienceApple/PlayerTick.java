package ExperienceApple;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.nbt.NBTTagCompound;

public class PlayerTick {
	public static boolean updateF=false;
	@SubscribeEvent
	public void PlayerTickEventSubscriber(TickEvent.PlayerTickEvent event) {
		EntityPlayer player=event.player;
 		Entity entity=(Entity)player;
 		PlayerCapabilities capabilities=((EntityPlayer)entity).capabilities;
		NBTTagCompound nbt=player.getEntityData();
		
		Boolean fly=nbt.getBoolean("fly");
 		if (fly==true) {
 			capabilities.allowFlying=true;
 			if (!eaMain.particle){
 				player.worldObj.spawnParticle("fireworksSpark",player.posX+Math.random()-0.5,player.posY-1.5,player.posZ+Math.random()-0.5,0.0D,0.0D,0.0D);
 			}
 		}else{
 		}
 		
 		if (nbt.getBoolean("playeraAcceleration")==true) {	
 			System.out.println(nbt.getBoolean("updateF"));
 			if (nbt.getBoolean("updateF")==false){
 				nbt.setBoolean("updateF",true);
 				player.onUpdate();
 			}
 			nbt.setBoolean("updateF",false);
 		}else{
 		}
	}
}