package Blocks;
import java.util.Random;

import ExperienceApple.eaMain;
import TileEntitys.tilegrowthStone;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
public class growthStone extends BlockGlass implements ITileEntityProvider
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public growthStone() {
        super(Material.ground,true);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("growthStone");
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
        this.TopIcon = par1IconRegister.registerIcon("eamod:glowthBlock");
        this.SideIcon = par1IconRegister.registerIcon("eamod:glowthBlock");
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
    	for (int i = 0; i < 1; i++){
    		double rx = (double)((float)x +rnd.nextFloat()*3-1);
    		double ry = (double)((float)y +rnd.nextFloat()*3-1);
    		double rz = (double)((float)z +rnd.nextFloat()*3-1);

    		world.spawnParticle("happyVillager",rx,ry,rz,0,0,0);
    	}
    }

    @Override
    public int quantityDropped(Random p_149745_1_){
        return 1;
    }

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new tilegrowthStone();
	}
}
