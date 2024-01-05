package Items;

import ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class experienceCondenser extends Item{
    public experienceCondenser(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("experienceCondenser");
        this.setTextureName("eamod:experienceCondenser");
        this.setMaxStackSize(64);
    }
}
