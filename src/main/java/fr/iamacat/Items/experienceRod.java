package fr.iamacat.Items;
import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class experienceRod extends Item{
    public experienceRod(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("ExperienceRod");
        this.setTextureName("eamod:experienceRod");
        this.setMaxStackSize(64);
    }
}
