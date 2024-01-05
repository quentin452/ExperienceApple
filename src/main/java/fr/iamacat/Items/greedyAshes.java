package fr.iamacat.Items;
import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class greedyAshes extends Item{

	public static int fCount=0;

	@Override
    public void onCreated(ItemStack item, World world, EntityPlayer player) {
		fCount=item.getItemDamage();
		System.out.println(item);
	}


    public greedyAshes(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("GreedyAshes");
        this.setTextureName("eamod:greedyAshes");
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
