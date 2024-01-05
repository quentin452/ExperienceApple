package fr.iamacat.Items;
import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class mechanicalTimeOfSand extends Item{
    public mechanicalTimeOfSand(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("mechanicalTimeOfSand");
        this.setTextureName("eamod:mechanicalTimeOfSand");
        this.setMaxStackSize(1);
        this.setMaxDamage(64);
    }

    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ){
    	if (item.getItemDamage()>=64)return true;
    	if (world.isRemote)return true;
		if (world.getBlock(x,y,z)==eaMain.accelerateStone)return true;
		if (world.getBlock(x,y,z)==eaMain.advancedAccelerateStone)return true;
		TileEntity entity= world.getTileEntity(x, y, z);
		if (entity==null)return true;
		if (entity.isInvalid())return true;
		if (entity instanceof ITickable)return true;
		for (int ix = 0; ix < 1000; ix++){
			entity.updateEntity();
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
