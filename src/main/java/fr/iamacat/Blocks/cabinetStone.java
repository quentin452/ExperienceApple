package fr.iamacat.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;
public class cabinetStone extends BlockGlass
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public cabinetStone() {
        super(Material.ground,true);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("cabinetStone");
        this.setBlockBounds(0.125F,0.125F,0.125F,0.875F,0.875F,0.875F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeStone);
        this.setResistance(0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:cabinetStone");
        this.SideIcon = par1IconRegister.registerIcon("eamod:cabinetStone");
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


    public void randomDisplayTick(World world, int x, int y, int z, Random rnd)
    {
    	if (eaMain.particle==true) return;
    	for (int i = 0; i < 8; i++){
    		double rx = (float)x +rnd.nextFloat();
    		double ry = (float)y +rnd.nextFloat();
    		double rz = (float)z +rnd.nextFloat();
    		world.spawnParticle("enchantmenttable",rx,ry,rz,0.0D,0.0D,0.0D);
    	}
    }
    @Override
    public int quantityDropped(Random p_149745_1_){
        return 1;
    }
}
