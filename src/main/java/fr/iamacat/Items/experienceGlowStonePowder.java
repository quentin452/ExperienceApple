package Items;

import ExperienceApple.eaMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class experienceGlowStonePowder extends Item{
    public experienceGlowStonePowder(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("experienceGlowStoneDust");
        this.setTextureName("eamod:experienceglowstonedust");
        this.setMaxStackSize(64);
    }
}
