package fr.iamacat.Blocks;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.block.BlockAir;

public class experienceGas extends BlockAir{
    public experienceGas() {
        super();
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("ExperienceGas");
        this.setLightLevel(1.0F);
    }
}
