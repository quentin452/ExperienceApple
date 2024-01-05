package Items;

import ExperienceApple.eaMain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class holyAsh extends Item{

	public static int fCount=0;

	@Override
    public void onCreated(ItemStack item, World world, EntityPlayer player) {
		fCount=item.getItemDamage();
	}


    public holyAsh(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("holyAsh");
        this.setTextureName("eamod:holyAsh");
        this.setMaxStackSize(64);
        this.setMaxDamage(1000000);
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
