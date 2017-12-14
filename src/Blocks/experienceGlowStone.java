package Blocks;

import java.util.Random;

import ExperienceApple.eaMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class experienceGlowStone extends Block{

	@SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public experienceGlowStone() {
        super(Material.glass);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("ExperienceGlowStone");
        this.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGlass);
        this.setLightLevel(1.0F);
        this.setHardness(1.5F);
        setResistance(1.5F);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if(par1 == 0 || par1 == 1)
        {
            return TopIcon;
        }
        else
        {
            return SideIcon;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:experienceglowstone");
        this.SideIcon = par1IconRegister.registerIcon("eamod:experienceglowstone");
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return eaMain.experienceGlowStonePowder;
    }

    public int quantityDropped(Random rnd)
    {
        return 2;
    }
}
