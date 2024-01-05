package fr.iamacat.Items;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class experienceJewel extends Item{
    public experienceJewel(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("experienceJewel");
        this.setTextureName("eamod:experienceJewel");
        this.setMaxStackSize(1);
    }
}
