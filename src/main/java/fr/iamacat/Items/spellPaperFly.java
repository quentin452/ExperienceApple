package Items;

import ExperienceApple.eaMain;

public class spellPaperFly extends spellPaper{
	public static boolean canFly=false;
    public spellPaperFly(){
    	super("fly");
        this.setCreativeTab(eaMain.tabAdd);
        this.setUnlocalizedName("spellPaperF");
        this.setTextureName("eamod:spellPaperF");
        this.setMaxStackSize(64);
    }
}
