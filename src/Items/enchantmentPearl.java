package Items;

import com.google.common.collect.Sets;

import ExperienceApple.eaMain;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class enchantmentPearl extends ItemTool{
	public enchantmentPearl(){
		super(0, eaMain.TmexperiencePearl, Sets.newHashSet(new Block[] {Blocks.air}));
		setCreativeTab(eaMain.tabAdd)
        .setUnlocalizedName("enchantmentPearl")
        .setTextureName("eamod:enchantmentPearl")
		.setMaxStackSize(1);
    }
}
