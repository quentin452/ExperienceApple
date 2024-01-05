package fr.iamacat.Items;
import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class weakExperienceIngot extends Item{
    public weakExperienceIngot(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("weakExperienceIngot");
        this.setTextureName("eamod:weakExperienceIngot");
        this.setMaxStackSize(64);
    }
}
