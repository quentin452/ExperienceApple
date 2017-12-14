package Blocks;
import java.util.Random;

import ExperienceApple.eaMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
public class condensedExperienceOre extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public condensedExperienceOre() {
        super(Material.ground);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("condensedExperienceOre");
        this.setLightOpacity(1);
        this.setStepSound(soundTypeStone);
        this.setResistance(300F);
        this.setHardness(1.5F);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:condensedExperienceOre");
        this.SideIcon = par1IconRegister.registerIcon("eamod:condensedExperienceOre");
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

    public void randomDisplayTick(World world, int x, int y, int z, Random rnd){
    }

    @Override
    public int quantityDropped(Random p_149745_1_){
        return 0;
    }

    public int getExpDrop(IBlockAccess world, int metadata, int fortune){
		return (fortune+1)*1000;
    }

}
