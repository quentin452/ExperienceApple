package fr.iamacat.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.iamacat.ExperienceApple.eaMain;
import fr.iamacat.TileEntitys.tileAdvancedAccelerateBlock;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;
public class advancedAccelerateStone extends BlockGlass implements ITileEntityProvider
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public advancedAccelerateStone() {
        super(Material.ground,true);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("advancedAccelerateStone");
        this.setLightOpacity(1);
        this.setStepSound(soundTypeStone);
        this.setResistance(300F);
        this.setBlockBounds(0.125F,0.125F,0.125F,0.875F,0.875F,0.875F);
        isBlockContainer = true;
    }

    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:advancedAccelerateBlock");
        this.SideIcon = par1IconRegister.registerIcon("eamod:advancedAccelerateBlock");
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
    	for (int i = 0; i < 64; i++){
    		double rx = (float)x +rnd.nextFloat();
    		double ry = (float)y +rnd.nextFloat();
    		double rz = (float)z +rnd.nextFloat();
    		double sx = rnd.nextFloat()*3-1.5;
    		double sy = rnd.nextFloat()*2-1.5;
    		double sz = rnd.nextFloat()*3-1.5;

    		world.spawnParticle("portal",rx,ry,rz,sx,sy,sz);
    	}
    }

    @Override
    public int quantityDropped(Random p_149745_1_){
        return 1;
    }

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new tileAdvancedAccelerateBlock();
	}
}
