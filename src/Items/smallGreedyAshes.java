package Items;

import ExperienceApple.eaMain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class smallGreedyAshes extends Item{

	public static int fCount=0;

	@Override
    public void onCreated(ItemStack item, World world, EntityPlayer player) {
		fCount=item.getItemDamage();
		System.out.println(item);
	}


    public smallGreedyAshes(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("SmallGreedyAshes");
        this.setTextureName("eamod:smallGreedyAshes");
        this.setMaxStackSize(64);
        this.setMaxDamage(10);
    }

    @Override
	public int getMetadata(int meta) {
		return meta;
	}

    @Override
    public Item setNoRepair(){
        canRepair = false;
        return this;
    }
}
