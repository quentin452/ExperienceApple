package ExperienceApple;


import java.io.File;

import Blocks.accelerateStone;
import Blocks.advancedAccelerateStone;
import Blocks.advancedGrowthStone;
import Blocks.cabinetStone;
import Blocks.condensedExperienceOre;
import Blocks.erfahrungIngotBlock;
import Blocks.experienceGas;
import Blocks.experienceGlowStone;
import Blocks.experienceIngotBlock;
import Blocks.experienceOre;
import Blocks.growthStone;
import Blocks.highFrequencyRedStoneBlock;
import Blocks.netherStarBlock;
import Blocks.netherStarBlock2;
import Blocks.netherStarBlock3;
import Blocks.netherStarBlock4;
import Blocks.netherStarBlock5;
import Blocks.ritualGlassTier1;
import Blocks.ritualGlassTier2;
import Blocks.ritualGlassTier3;
import Blocks.ritualGlassTier4;
import Blocks.ritualLauncherTier1;
import Blocks.ritualLauncherTier2;
import Blocks.ritualLauncherTier3;
import Blocks.ritualLauncherTier4;
import Blocks.ritualStoneTier1;
import Blocks.ritualStoneTier2;
import Blocks.ritualStoneTier3;
import Blocks.ritualStoneTier4;
import Blocks.superHopper;
import Blocks.userRegistrationStone;
import Common.commonProxy;
import Items.advancedExperienceCondenser;
import Items.enchantmentPearl;
import Items.erfahrungIngot;
import Items.erfahrungMultiTool;
import Items.erfahrungRod;
import Items.experienceApple;
import Items.experienceAppleShard;
import Items.experienceAxeTier1;
import Items.experienceBoneMeal;
import Items.experienceCondenser;
import Items.experienceGlowStonePowder;
import Items.experienceIngot;
import Items.experienceJewel;
import Items.experienceMultiTool;
import Items.experiencePickaxeTier1;
import Items.experienceRod;
import Items.experienceShovelTier1;
import Items.experienceSwordTier1;
import Items.greedyAshes;
import Items.healQuartz;
import Items.highFrequencyRedStoneDust;
import Items.holyAsh;
import Items.lightDirtyAsh;
import Items.mechanicalExperienceBoneMeal;
import Items.mechanicalTimeOfSand;
import Items.smallGreedyAshes;
import Items.smallHolyAsh;
import Items.smallLightDirtyAsh;
import Items.smallSmallGreedyAshes;
import Items.smallSmallHolyAsh;
import Items.smallSmallLightDirtyAsh;
import Items.smallSmallSmallHolyAsh;
import Items.smallSmallSmallLightDirtyAsh;
import Items.smallSmallSmallSmallHolyAsh;
import Items.spellPaperFly;
import Items.superDye;
import Items.timeOfSand;
import Items.weakExperienceAxe;
import Items.weakExperienceIngot;
import Items.weakExperiencePickaxe;
import Items.weakExperienceShovel;
import Items.weakExperienceSword;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

@Mod(
	modid="ExperienceApple"
)

public class eaMain {
    public static final String MOD_ID = "ExperienceApple";
    
    @SidedProxy(clientSide = "Client.clientProxy", serverSide = "Common.commonProxy")
	public static commonProxy proxy;
    
    public static Block experienceManaPool;
    
    
    
    
    public static Item experienceApple;
    public static Item experienceGlowStonePowder;
    public static Item experienceIngot;
    public static Item erfahrungIngot;
    public static Item spellPaperF;
    public static Item spellPaperA;
    public static Item enchantmentPearl;
    public static Item experienceJewel;
    public static Item experienceAppleShard;
    public static Item greedyAshes;
    public static Item smallGreedyAshes;
    public static Item smallSmallGreedyAshes;
    public static Item lightDirtyAsh;
    public static Item smallLightDirtyAsh;
    public static Item smallSmallLightDirtyAsh;
    public static Item smallSmallSmallLightDirtyAsh;
    public static Item holyAsh;
    public static Item smallHolyAsh;
    public static Item smallSmallHolyAsh;
    public static Item smallSmallSmallHolyAsh;
    public static Item smallSmallSmallSmallHolyAsh;
    public static Item experienceRod;
    public static Item erfahrungRod;
    public static Item experienceCondenser;
    public static Item advancedExperienceCondenser;
    public static Item weakExperienceIngot;
    public static Item weakExperienceSword;
    public static Item weakExperiencePickaxe;
    public static Item weakExperienceShovel;
    public static Item weakExperienceAxe;
    public static Item experienceSwordTier1;
    public static Item experiencePickaxeTier1;
    public static Item experienceShovelTier1;
    public static Item experienceAxeTier1;
    public static Item experienceMultiTool;
    public static Item erfahrungMultiTool;
    public static Item mechanicalExperienceBoneMeal;
    public static Item experienceBoneMeal;
    public static Item timeOfSand;
    public static Item mechanicalTimeOfSand;
    public static Item highFrequencyRedStoneDust;
    public static Item superDye;
    public static Item healQuartz;

    public static Block superHopper;
    public static Block experienceOre;
    public static Block condensedExperienceOre;
    public static Block experienceGas;
    public static Block userRegistrationStone;
    public static Block accelerateStone;
    public static Block growthStone;
    public static Block advancedAccelerateStone;
    public static Block advancedGrowthStone;
    public static Block cabinetStone;
    public static Block ritualGlassTier1;
    public static Block ritualGlassTier2;
    public static Block ritualGlassTier3;
    public static Block ritualGlassTier4;
    public static Block ritualStoneTier1;
    public static Block ritualStoneTier2;
    public static Block ritualStoneTier3;
    public static Block ritualStoneTier4;
    public static Block ritualLauncherTier1;
    public static Block ritualLauncherTier2;
    public static Block ritualLauncherTier3;
    public static Block ritualLauncherTier4;
    public static Block experienceGlowStone;
    public static Block experienceIngotBlock;
    public static Block erfahrungIngotBlock;
    public static Block netherStarBlock;
    public static Block netherStarBlock2;
    public static Block netherStarBlock3;
    public static Block netherStarBlock4;
    public static Block netherStarBlock5;
    public static Block highFrequencyRedStoneBlock;

	public static ToolMaterial TmweakExperienceIngot = EnumHelper.addToolMaterial("TmweakExperienceIngot",1,5,100,10,1);
	public static ToolMaterial TmexperienceIngot = EnumHelper.addToolMaterial("TmexperienceIngot",9,15,100,10,3);
	public static ToolMaterial TmexperiencePearl = EnumHelper.addToolMaterial("TmexperiencePearl",0,30,0,0,100);
	public static ToolMaterial TmerfahrungIngot = EnumHelper.addToolMaterial("TmerfahrungIngot",9,0,100,19,100);


    public static final CreativeTabs tabAdd = (CreativeTabs) new tabExperienceApple("experienceApple");

	public static boolean particle;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	//experienceManaPool = new experienceManaPool();
    	
    	
    	
    	
    	
    	
    	
    	
        experienceApple = new experienceApple();
        experienceGlowStonePowder = new experienceGlowStonePowder();
        experienceIngot = new experienceIngot();
        erfahrungIngot = new erfahrungIngot();
        spellPaperF = new spellPaperFly();
        enchantmentPearl = new enchantmentPearl();
        experienceJewel = new experienceJewel();
        experienceAppleShard = new experienceAppleShard();
        greedyAshes = new greedyAshes();
        smallGreedyAshes = new smallGreedyAshes();
        smallSmallGreedyAshes = new smallSmallGreedyAshes();
        lightDirtyAsh = new lightDirtyAsh();
        smallLightDirtyAsh = new smallLightDirtyAsh();
        smallSmallLightDirtyAsh = new smallSmallLightDirtyAsh();
        smallSmallSmallLightDirtyAsh = new smallSmallSmallLightDirtyAsh();
        holyAsh = new holyAsh();
        smallHolyAsh = new smallHolyAsh();
        smallSmallHolyAsh = new smallSmallHolyAsh();
        smallSmallSmallHolyAsh = new smallSmallSmallHolyAsh();
        smallSmallSmallSmallHolyAsh = new smallSmallSmallSmallHolyAsh();
        experienceRod = new experienceRod();
        erfahrungRod = new erfahrungRod();
        experienceCondenser = new experienceCondenser();
        advancedExperienceCondenser = new advancedExperienceCondenser();
        weakExperienceIngot = new weakExperienceIngot();
        weakExperienceSword = new weakExperienceSword();
        weakExperiencePickaxe = new weakExperiencePickaxe();
        weakExperienceShovel = new weakExperienceShovel();
        weakExperienceAxe = new weakExperienceAxe();
        experienceSwordTier1 = new experienceSwordTier1();
        experiencePickaxeTier1 = new experiencePickaxeTier1();
        experienceShovelTier1 = new experienceShovelTier1();
        experienceAxeTier1 = new experienceAxeTier1();
        experienceMultiTool = new experienceMultiTool();
        erfahrungMultiTool = new erfahrungMultiTool();
        mechanicalExperienceBoneMeal = new mechanicalExperienceBoneMeal();
        experienceBoneMeal = new experienceBoneMeal();
        timeOfSand = new timeOfSand();
        mechanicalTimeOfSand = new mechanicalTimeOfSand();
        highFrequencyRedStoneDust = new highFrequencyRedStoneDust();
        superDye = new superDye();
        healQuartz = new healQuartz();
        
        superHopper = new superHopper();
        experienceOre = new experienceOre();
        condensedExperienceOre = new condensedExperienceOre();
        experienceGas = new experienceGas();
        userRegistrationStone = new userRegistrationStone();
        accelerateStone = new accelerateStone();
        growthStone = new growthStone();
        advancedAccelerateStone = new advancedAccelerateStone();
        advancedGrowthStone = new advancedGrowthStone();
        cabinetStone = new cabinetStone();
        ritualGlassTier1 = new ritualGlassTier1();
        ritualGlassTier2 = new ritualGlassTier2();
        ritualGlassTier3 = new ritualGlassTier3();
        ritualGlassTier4 = new ritualGlassTier4();
        ritualStoneTier1 = new ritualStoneTier1();
        ritualStoneTier2 = new ritualStoneTier2();
        ritualStoneTier3 = new ritualStoneTier3();
        ritualStoneTier4 = new ritualStoneTier4();
        ritualLauncherTier1 = new ritualLauncherTier1();
        ritualLauncherTier2 = new ritualLauncherTier2();
        ritualLauncherTier3 = new ritualLauncherTier3();
        ritualLauncherTier4 = new ritualLauncherTier4();

        experienceGlowStone = new experienceGlowStone();
        experienceIngotBlock = new experienceIngotBlock();
        erfahrungIngotBlock = new erfahrungIngotBlock();
        netherStarBlock = new netherStarBlock();
        netherStarBlock2 = new netherStarBlock2();
        netherStarBlock3 = new netherStarBlock3();
        netherStarBlock4 = new netherStarBlock4();
        netherStarBlock5 = new netherStarBlock5();
        highFrequencyRedStoneBlock = new highFrequencyRedStoneBlock();

		Configuration cfg = new Configuration(new File("config/ExperienceApple.cfg"));
        try{
            cfg.load();
            particle = cfg.getBoolean("particle", "client", false, "disableParticles?");
        }finally{
            cfg.save();
        }
    }
    @EventHandler
	public void init(FMLInitializationEvent event)
	{
    	GameRegistry.registerWorldGenerator(new experienceOreGenerator(), 0);
		proxy.registerTileEntity();
		proxy.registerEventHandlers();
        
        //GameRegistry.registerBlock(experienceManaPool, "EApple:experienceManaPool");

		
		
		
		
		
        GameRegistry.registerItem(experienceApple,"EApple:ExperienceApple");
        GameRegistry.registerItem(experienceGlowStonePowder, "EApple:ExperienceGlowStonePowder");
        GameRegistry.registerItem(experienceIngot, "EApple:ExperienceIngot");
        GameRegistry.registerItem(erfahrungIngot, "EApple:ErfahrungIngot");
        GameRegistry.registerItem(spellPaperF, "EApple:spellPaperF");
        GameRegistry.registerItem(enchantmentPearl, "EApple:enchantmentPearl");
        GameRegistry.registerItem(experienceJewel, "EApple:experienceJewel");
        GameRegistry.registerItem(experienceAppleShard, "EApple:experienceAppleShard");
        GameRegistry.registerItem(greedyAshes, "EApple:greedyAshes");
        GameRegistry.registerItem(smallGreedyAshes, "EApple:smallGreedyAshes");
        GameRegistry.registerItem(smallSmallGreedyAshes, "EApple:smallSmallGreedyAshes");
        GameRegistry.registerItem(lightDirtyAsh, "EApple:lightDirtyAsh");
        GameRegistry.registerItem(smallLightDirtyAsh, "EApple:smallLightDirtyAsh");
        GameRegistry.registerItem(smallSmallLightDirtyAsh, "EApple:smallSmallLightDirtyAsh");
        GameRegistry.registerItem(smallSmallSmallLightDirtyAsh, "EApple:smallSmallSmallLightDirtyAsh");
        GameRegistry.registerItem(holyAsh, "EApple:holyAsh");
        GameRegistry.registerItem(smallHolyAsh, "EApple:smallHolyAsh");
        GameRegistry.registerItem(smallSmallHolyAsh, "EApple:smallSmallHolyAsh");
        GameRegistry.registerItem(smallSmallSmallHolyAsh, "EApple:smallSmallSmallHolyAsh");
        GameRegistry.registerItem(smallSmallSmallSmallHolyAsh, "EApple:smallSmallSmallSmallHolyAsh");
        GameRegistry.registerItem(experienceRod, "EApple:experienceRod");
        GameRegistry.registerItem(erfahrungRod, "EApple:erfahrungRod");
        GameRegistry.registerItem(experienceCondenser, "EApple:experienceCondenser");
        GameRegistry.registerItem(advancedExperienceCondenser, "EApple:advancedExperienceCondenser");
        GameRegistry.registerItem(experienceSwordTier1, "EApple:ExperienceSwordTier1");
        GameRegistry.registerItem(experiencePickaxeTier1, "EApple:ExperiencePickaxeTier1");
        GameRegistry.registerItem(experienceShovelTier1, "EApple:ExperienceShovelTier1");
        GameRegistry.registerItem(experienceAxeTier1, "EApple:ExperienceAxeTier1");
        GameRegistry.registerItem(weakExperienceIngot, "EApple:weakExperienceIngot");
        GameRegistry.registerItem(weakExperienceSword, "EApple:weakExperienceSword");
        GameRegistry.registerItem(weakExperiencePickaxe, "EApple:weakExperiencePickaxe");
        GameRegistry.registerItem(weakExperienceShovel, "EApple:weakExperienceShovel");
        GameRegistry.registerItem(weakExperienceAxe, "EApple:weakExperienceAxe");
        GameRegistry.registerItem(experienceMultiTool, "EApple:experienceMultiTool");
        GameRegistry.registerItem(erfahrungMultiTool, "EApple:erfahrungMultiTool");
        GameRegistry.registerItem(experienceBoneMeal, "EApple:experienceBoneMeal");
        GameRegistry.registerItem(mechanicalExperienceBoneMeal, "EApple:mechanicalExperienceBoneMeal");
        GameRegistry.registerItem(timeOfSand, "EApple:timeOfSand");
        GameRegistry.registerItem(mechanicalTimeOfSand, "EApple:mechanicalTimeOfSand");
        GameRegistry.registerItem(highFrequencyRedStoneDust, "EApple:highFrequencyRedStoneDust");
        GameRegistry.registerItem(superDye, "EApple:superDye");
        GameRegistry.registerItem(healQuartz, "EApple:healQuartz");

        GameRegistry.registerBlock(superHopper, "EApple:superHopper");
        GameRegistry.registerBlock(experienceOre, "EApple:experienceOre");
        GameRegistry.registerBlock(condensedExperienceOre, "EApple:condensedExperienceOre");
        GameRegistry.registerBlock(experienceGas, "EApple:experienceGas");
        GameRegistry.registerBlock(ritualGlassTier1, "EApple:RitualGlassTier1");
        GameRegistry.registerBlock(ritualGlassTier2, "EApple:RitualGlassTier2");
        GameRegistry.registerBlock(ritualGlassTier3, "EApple:RitualGlassTier3");
        GameRegistry.registerBlock(ritualGlassTier4, "EApple:RitualGlassTier4");
        GameRegistry.registerBlock(userRegistrationStone, "EApple:UserRegistrationStone");
        GameRegistry.registerBlock(accelerateStone, "EApple:accelerateStone");
        GameRegistry.registerBlock(growthStone, "EApple:growthStone");
        GameRegistry.registerBlock(advancedAccelerateStone, "EApple:advancedAccelerateStone");
        GameRegistry.registerBlock(advancedGrowthStone, "EApple:advancedGrowthStone");
        GameRegistry.registerBlock(cabinetStone, "EApple:cabinetStone");
        GameRegistry.registerBlock(ritualStoneTier1, "EApple:RitualStoneTier1");
        GameRegistry.registerBlock(ritualStoneTier2, "EApple:RitualStoneTier2");
        GameRegistry.registerBlock(ritualStoneTier3, "EApple:RitualStoneTier3");
        GameRegistry.registerBlock(ritualStoneTier4, "EApple:RitualStoneTier4");
        GameRegistry.registerBlock(ritualLauncherTier1, "EApple:ritualLauncherTier1");
        GameRegistry.registerBlock(ritualLauncherTier2, "EApple:ritualLauncherTier2");
        GameRegistry.registerBlock(ritualLauncherTier3, "EApple:ritualLauncherTier3");
        GameRegistry.registerBlock(ritualLauncherTier4, "EApple:ritualLauncherTier4");

        GameRegistry.registerBlock(experienceGlowStone, "EApple:ExperienceGlowStone");
        GameRegistry.registerBlock(experienceIngotBlock, "EApple:ExperienceIngotBlock");
        GameRegistry.registerBlock(erfahrungIngotBlock, "EApple:erfahrungIngotBlock");
        GameRegistry.registerBlock(netherStarBlock, "EApple:netherStarBlock");
        GameRegistry.registerBlock(netherStarBlock2, "EApple:netherStarBlock2");
        GameRegistry.registerBlock(netherStarBlock3, "EApple:netherStarBlock3");
        GameRegistry.registerBlock(netherStarBlock4, "EApple:netherStarBlock4");
        GameRegistry.registerBlock(netherStarBlock5, "EApple:netherStarBlock5");
        GameRegistry.registerBlock(highFrequencyRedStoneBlock, "EApple:highFrequencyRedStoneBlock");
        
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.superDye,1),highFrequencyRedStoneDust,holyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.experienceApple,1),Items.apple, Items.emerald);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.experienceIngot,9),eaMain.experienceIngotBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.highFrequencyRedStoneDust,9),eaMain.highFrequencyRedStoneBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.erfahrungIngot,9),eaMain.erfahrungIngotBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.userRegistrationStone,1),Blocks.brick_block,experienceApple);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.nether_star,8),eaMain.netherStarBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.netherStarBlock,8),eaMain.netherStarBlock2);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.netherStarBlock2,8),eaMain.netherStarBlock3);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.netherStarBlock3,8),eaMain.netherStarBlock4);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.netherStarBlock4,8),eaMain.netherStarBlock5);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.experienceMultiTool,1),experienceSwordTier1,experiencePickaxeTier1,experienceShovelTier1,experienceAxeTier1);
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.experienceCondenser,1),experienceRod,new ItemStack(greedyAshes,1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(eaMain.advancedExperienceCondenser,1),erfahrungRod,new ItemStack(lightDirtyAsh,1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(experienceAppleShard,9),experienceApple);
        GameRegistry.addShapelessRecipe(new ItemStack(smallGreedyAshes,9),greedyAshes);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallGreedyAshes,9),smallGreedyAshes);
        GameRegistry.addShapelessRecipe(new ItemStack(smallLightDirtyAsh,9),lightDirtyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallLightDirtyAsh,9),smallLightDirtyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallSmallLightDirtyAsh,9),smallSmallLightDirtyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallHolyAsh,9),holyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallHolyAsh,9),smallHolyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallSmallHolyAsh,9),smallSmallHolyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallSmallSmallHolyAsh,9),smallSmallSmallHolyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallHolyAsh,9),holyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallHolyAsh,9),smallHolyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallSmallHolyAsh,9),smallSmallHolyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(smallSmallSmallSmallHolyAsh,9),smallSmallSmallHolyAsh);
        GameRegistry.addShapelessRecipe(new ItemStack(weakExperienceIngot),experienceApple,Items.iron_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(superHopper),Blocks.hopper,highFrequencyRedStoneDust);
        
        GameRegistry.addRecipe(new ItemStack(eaMain.spellPaperF,1),"#F#","FPF","#F#",'F',Items.feather,'#',holyAsh,'P',Items.paper);
        GameRegistry.addRecipe(new ItemStack(eaMain.growthStone,1),"NBN","ECE","HGH",'N',netherStarBlock3,'B',Items.bone,'C',cabinetStone,'H',holyAsh,'E',experienceIngot,'G',experienceBoneMeal);
        GameRegistry.addRecipe(new ItemStack(eaMain.advancedGrowthStone,1),"NBN","ECE","HGH",'N',netherStarBlock4,'B',Items.bone,'C',growthStone,'H',holyAsh,'E',erfahrungIngot,'G',mechanicalExperienceBoneMeal);
        GameRegistry.addRecipe(new ItemStack(eaMain.accelerateStone,1),"NBN","ECE","HGH",'N',netherStarBlock3,'B',Items.clock,'C',cabinetStone,'H',holyAsh,'E',experienceIngot,'G',timeOfSand);
        GameRegistry.addRecipe(new ItemStack(eaMain.advancedAccelerateStone,1),"NBN","ECE","HGH",'N',netherStarBlock4,'B',Items.clock,'C',accelerateStone,'H',holyAsh,'E',erfahrungIngot,'G',mechanicalTimeOfSand);
        GameRegistry.addRecipe(new ItemStack(eaMain.experienceSwordTier1,1),"GBG","PTP","GEG",'G',Items.golden_apple,'B',experienceIngotBlock,'P',enchantmentPearl,'T',Items.diamond_sword,'E',experienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.experiencePickaxeTier1,1),"GBG","PTP","GEG",'G',Items.golden_apple,'B',experienceIngotBlock,'P',enchantmentPearl,'T',Items.diamond_pickaxe,'E',experienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.experienceAxeTier1,1),"GBG","PTP","GEG",'G',Items.golden_apple,'B',experienceIngotBlock,'P',enchantmentPearl,'T',Items.diamond_axe,'E',experienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.experienceShovelTier1,1),"GBG","PTP","GEG",'G',Items.golden_apple,'B',experienceIngotBlock,'P',enchantmentPearl,'T',Items.diamond_shovel,'E',experienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.weakExperienceSword,1),"I  ","I  ","S  ",'I',weakExperienceIngot,'S',Items.stick);
        GameRegistry.addRecipe(new ItemStack(eaMain.weakExperienceShovel,1),"I  ","S  ","S  ",'I',weakExperienceIngot,'S',Items.stick);
        GameRegistry.addRecipe(new ItemStack(eaMain.weakExperienceAxe,1),"II ","IS "," S ",'I',weakExperienceIngot,'S',Items.stick);
        GameRegistry.addRecipe(new ItemStack(eaMain.weakExperiencePickaxe,1),"III"," S "," S ",'I',weakExperienceIngot,'S',Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(eaMain.erfahrungMultiTool,1),"GBG","PTP","GEG",'G',new ItemStack(Items.golden_apple,0,1),'B',erfahrungIngotBlock,'P',enchantmentPearl,'T',experienceMultiTool,'E',advancedExperienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.experienceJewel),"GEG","E#E","GEG",'E',Items.emerald,'G',experienceGlowStonePowder,'#',enchantmentPearl);
        GameRegistry.addRecipe(new ItemStack(eaMain.enchantmentPearl),"###","#E#","###",'E',Items.ender_pearl,'#',Items.enchanted_book);
        GameRegistry.addRecipe(new ItemStack(eaMain.cabinetStone,8),"EPE","PNP","EPE",'E',experienceOre,'P',Blocks.emerald_ore,'N',netherStarBlock);
        GameRegistry.addRecipe(new ItemStack(eaMain.erfahrungIngotBlock),"###","###","###",'#',eaMain.erfahrungIngot);
        GameRegistry.addRecipe(new ItemStack(eaMain.experienceIngotBlock),"###","###","###",'#',eaMain.experienceIngot);
        GameRegistry.addRecipe(new ItemStack(eaMain.highFrequencyRedStoneBlock),"###","###","###",'#',eaMain.highFrequencyRedStoneDust);

        GameRegistry.addRecipe(new ItemStack(eaMain.netherStarBlock),"###","#J#","###",'#',Items.nether_star,'J',experienceApple);
        GameRegistry.addRecipe(new ItemStack(eaMain.netherStarBlock2),"###","#J#","###",'#',eaMain.netherStarBlock,'J',experienceApple);
        GameRegistry.addRecipe(new ItemStack(eaMain.netherStarBlock3),"###","#J#","###",'#',eaMain.netherStarBlock2,'J',experienceApple);
        GameRegistry.addRecipe(new ItemStack(eaMain.netherStarBlock4),"###","#J#","###",'#',eaMain.netherStarBlock3,'J',experienceApple);
        GameRegistry.addRecipe(new ItemStack(eaMain.netherStarBlock5),"###","#J#","###",'#',eaMain.netherStarBlock4,'J',experienceApple);
        GameRegistry.addRecipe(new ItemStack(eaMain.ritualStoneTier1,8),"###","#O#","#C#",'#',ritualGlassTier1,'O',cabinetStone,'C',experienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.ritualStoneTier2,8),"###","#O#","#C#",'#',ritualGlassTier2,'O',cabinetStone,'C',experienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.ritualStoneTier3,8),"###","#O#","#C#",'#',ritualGlassTier3,'O',cabinetStone,'C',advancedExperienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.ritualStoneTier4,8),"###","#O#","#C#",'#',ritualGlassTier4,'O',cabinetStone,'C',advancedExperienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.ritualLauncherTier1,1),"###","#O#","###",'#',ritualStoneTier1,'O',highFrequencyRedStoneBlock);
        GameRegistry.addRecipe(new ItemStack(eaMain.ritualLauncherTier2,1),"###","#O#","###",'#',ritualStoneTier2,'O',highFrequencyRedStoneBlock);
        GameRegistry.addRecipe(new ItemStack(eaMain.ritualLauncherTier3,1),"###","#O#","###",'#',ritualStoneTier3,'O',highFrequencyRedStoneBlock);
        GameRegistry.addRecipe(new ItemStack(eaMain.ritualLauncherTier4,1),"###","#O#","###",'#',ritualStoneTier4,'O',highFrequencyRedStoneBlock);

        GameRegistry.addRecipe(new ItemStack(eaMain.experienceRod)," #","# ",'#',eaMain.experienceIngot);
        GameRegistry.addRecipe(new ItemStack(eaMain.erfahrungRod)," #","# ",'#',eaMain.erfahrungIngot);
        GameRegistry.addRecipe(new ItemStack(eaMain.experienceCondenser),"###","#R#","###",'#',greedyAshes,'R',experienceRod);
        GameRegistry.addRecipe(new ItemStack(eaMain.advancedExperienceCondenser),"###","#R#","###",'#',lightDirtyAsh,'R',erfahrungRod);
        GameRegistry.addRecipe(new ItemStack(eaMain.experienceBoneMeal,4),"#R#",'#',Items.bone,'R',ritualGlassTier2);
        GameRegistry.addRecipe(new ItemStack(eaMain.mechanicalExperienceBoneMeal),"###","#R#","#C#",'#',Items.bone,'R',ritualGlassTier4,'C',advancedExperienceCondenser);
        GameRegistry.addRecipe(new ItemStack(eaMain.timeOfSand,4),"#R#",'#',Items.clock,'R',ritualGlassTier2);
        GameRegistry.addRecipe(new ItemStack(eaMain.mechanicalTimeOfSand),"###","#R#","#C#",'#',Items.clock,'R',ritualGlassTier4,'C',advancedExperienceCondenser);
        GameRegistry.addRecipe(new ItemStack(condensedExperienceOre),"#R#","ROR","#R#",'#',Items.experience_bottle,'R',enchantmentPearl,'O',experienceOre);
        GameRegistry.addRecipe(new ItemStack(experienceApple),"###","###","###",'#',experienceAppleShard);
        GameRegistry.addRecipe(new ItemStack(greedyAshes),"###","###","###",'#',smallGreedyAshes);
        GameRegistry.addRecipe(new ItemStack(smallGreedyAshes),"###","###","###",'#',smallSmallGreedyAshes);
        GameRegistry.addRecipe(new ItemStack(lightDirtyAsh),"###","###","###",'#',smallLightDirtyAsh);
        GameRegistry.addRecipe(new ItemStack(smallLightDirtyAsh),"###","###","###",'#',smallSmallLightDirtyAsh);
        GameRegistry.addRecipe(new ItemStack(smallSmallLightDirtyAsh),"###","###","###",'#',smallSmallSmallLightDirtyAsh);
        GameRegistry.addRecipe(new ItemStack(holyAsh),"###","###","###",'#',smallHolyAsh);
        GameRegistry.addRecipe(new ItemStack(smallHolyAsh),"###","###","###",'#',smallSmallHolyAsh);
        GameRegistry.addRecipe(new ItemStack(smallSmallHolyAsh),"###","###","###",'#',smallSmallSmallHolyAsh);
        GameRegistry.addRecipe(new ItemStack(smallSmallSmallHolyAsh),"###","###","###",'#',smallSmallSmallSmallHolyAsh);
        
    	GameRegistry.addSmelting(experienceAppleShard,new ItemStack(smallGreedyAshes),0);
    	GameRegistry.addSmelting(smallSmallGreedyAshes,new ItemStack(smallSmallLightDirtyAsh),0);
    	GameRegistry.addSmelting(smallSmallSmallLightDirtyAsh,new ItemStack(smallSmallSmallHolyAsh),0);
    	
    	OreDictionary.registerOre("dyeBlack",superDye);
    	OreDictionary.registerOre("dyeRed",superDye);
        OreDictionary.registerOre("dyeGreen",superDye);
    	OreDictionary.registerOre("dyeBrown",superDye);
    	OreDictionary.registerOre("dyeBlue",superDye);
    	OreDictionary.registerOre("dyePurple",superDye);
    	OreDictionary.registerOre("dyeCyan",superDye);
    	OreDictionary.registerOre("dyeLightGray",superDye);
    	OreDictionary.registerOre("dyeGray",superDye);
    	OreDictionary.registerOre("dyePink",superDye);
    	OreDictionary.registerOre("dyeLime",superDye);
    	OreDictionary.registerOre("dyeYellow",superDye);
    	OreDictionary.registerOre("dyeLightBlue",superDye);
    	OreDictionary.registerOre("dyeMagenta",superDye);
    	OreDictionary.registerOre("dyeOrange",superDye);
    	OreDictionary.registerOre("dyeWhite",superDye);
		
	}
}