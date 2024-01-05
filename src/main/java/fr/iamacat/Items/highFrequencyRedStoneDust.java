package fr.iamacat.Items;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class highFrequencyRedStoneDust extends Item{
    public highFrequencyRedStoneDust(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("highFrequencyRedStoneDust");
        this.setTextureName("eamod:highFrequencyRedStoneDust");
        this.setMaxStackSize(64);
    }
}
