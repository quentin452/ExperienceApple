package ExperienceApple;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tabExperienceApple extends CreativeTabs {

	public tabExperienceApple(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return eaMain.experienceApple;
	}
}
