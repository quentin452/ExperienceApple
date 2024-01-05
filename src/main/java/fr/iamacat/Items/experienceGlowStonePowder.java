package fr.iamacat.Items;


import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class experienceGlowStonePowder extends Item{
    public experienceGlowStonePowder(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("experienceGlowStoneDust");
        this.setTextureName("eamod:experienceglowstonedust");
        this.setMaxStackSize(64);
    }
}
