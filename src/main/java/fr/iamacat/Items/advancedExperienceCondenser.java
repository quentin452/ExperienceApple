package fr.iamacat.Items;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class advancedExperienceCondenser extends Item{
    public advancedExperienceCondenser(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("advancedExperienceCondenser");
        this.setTextureName("eamod:advancedExperienceCondenser");
        this.setMaxStackSize(64);
    }
}
