package Blocks;

import java.util.Random;

import ExperienceApple.eaMain;
import TileEntitys.tileSuperHopper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockHopper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class superHopper extends BlockHopper{
	public IIcon top;
	public IIcon inside;
	public IIcon outside;


	public superHopper() {
		this.setCreativeTab(eaMain.tabAdd);
		this.setBlockName("superHopper");
		this.setBlockBounds(0.125F,0.125F,0.125F,0.875F,0.875F,0.875F);
		this.setLightOpacity(1);
		this.setStepSound(soundTypeStone);
		this.setResistance(0F);
	}
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_){
		return new tileSuperHopper();
	}
	public void randomDisplayTick(World world, int x, int y, int z, Random rnd)
    {
    	if (eaMain.particle==true) return;
    	for (int i = 0; i < 8; i++){
    		double sx = rnd.nextFloat()-0.5;
    		double sy = rnd.nextFloat()+0.5;
    		double sz = rnd.nextFloat()-0.5;
    		world.spawnParticle("portal",x+0.5,y+0.3,z+0.5,sx,sy,sz);
    	}
    }
	@SideOnly(Side.CLIENT)
    public String getItemIconName()
    {
        return "eamod:superHopper";
    }
}
