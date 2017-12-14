package Items;

import ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class erfahrungRod extends Item{
    public erfahrungRod(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("erfahrungRod");
        this.setTextureName("eamod:erfahrungRod");
        this.setMaxStackSize(64);
    }
}
