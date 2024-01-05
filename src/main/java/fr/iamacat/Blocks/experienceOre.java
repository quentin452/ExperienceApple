package fr.iamacat.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;
public class experienceOre extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public experienceOre() {
        super(Material.ground);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("ExperienceOre");
        this.setLightOpacity(1);
        this.setStepSound(soundTypeStone);
        this.setResistance(300F);
        this.setHardness(10F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:experienceOre");
        this.SideIcon = par1IconRegister.registerIcon("eamod:experienceOre");
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
    	/*for (int i = 0; i < 1; i++){
    		double rx = (double)((float)x +rnd.nextFloat());
    		double ry = (double)((float)y +rnd.nextFloat());
    		double rz = (double)((float)z +rnd.nextFloat());

    		world.spawnParticle("happyVillager",rx,ry,rz,0,0,0);
    	}*/
    }

    @Override
    public int quantityDropped(Random p_149745_1_){
        return 0;
    }

    public int getExpDrop(IBlockAccess world, int metadata, int fortune){
		return (fortune+1)*50;
    }

}
