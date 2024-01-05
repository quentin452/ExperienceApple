package Items;

import ExperienceApple.eaMain;
import net.minecraft.item.Item;

public class superDye extends Item{
    public superDye(){
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("superDye");
        this.setTextureName("eamod:superDye");
        this.setMaxStackSize(64);
        this.setContainerItem(this);
    }
}
