package fr.iamacat.Items;
import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class healQuartz extends Item{
    public healQuartz(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("healQuartz");
        this.setTextureName("eamod:healQuartz");
        this.setMaxStackSize(1);
    }
}
