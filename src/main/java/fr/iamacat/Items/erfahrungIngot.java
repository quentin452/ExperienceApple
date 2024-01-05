package fr.iamacat.Items;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class erfahrungIngot extends Item{
    public erfahrungIngot(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("ErfahrungIngot");
        this.setTextureName("eamod:erfahrung_ingot");
        this.setMaxStackSize(64);
    }
}
