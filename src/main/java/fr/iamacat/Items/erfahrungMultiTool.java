package fr.iamacat.Items;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class erfahrungMultiTool extends ItemTool{
    public erfahrungMultiTool(){
    	super(1, eaMain.TmerfahrungIngot, null);
        setCreativeTab(eaMain.tabAdd)
        .setUnlocalizedName("erfahrungMultiTool")
        .setTextureName("eamod:erfahrungMultiTool")
        .setMaxStackSize(1)
        .setMaxDamage(0);
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
    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ){
    	if (!world.isRemote){
			ItemStack itemstack=new ItemStack(Item.getItemFromBlock(world.getBlock(x,y,z)));
			world.setBlock(x,y,z,Blocks.air);
			EntityItem itementity=new EntityItem(world,(double)x+0.5,(double)y+0.5,(double)z+0.5,itemstack);
			world.spawnEntityInWorld(itementity);

		}
    	if (!eaMain.particle){
        	for (int i = 0; i < 20; i++){
				world.spawnParticle("fireworksSpark",x+Math.random(),y+Math.random(),z+Math.random(),0.0D,0.0D,0.0D);
			}
    		}
    	return false;
    }
}
