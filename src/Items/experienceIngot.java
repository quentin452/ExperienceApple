package Items;

import ExperienceApple.eaMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class experienceIngot extends Item{
    public experienceIngot(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("ExperienceIngot");
        this.setTextureName("eamod:experience_ingot");
        this.setMaxStackSize(64);
    }


}
