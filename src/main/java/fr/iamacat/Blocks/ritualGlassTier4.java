package fr.iamacat.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.iamacat.ExperienceApple.eaMain;
import fr.iamacat.ExperienceApple.ritualGlass;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;
public class ritualGlassTier4 extends BlockGlass
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public ritualGlassTier4() {
        super(Material.glass,true);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("RitualGlassTier4");
        this.setBlockBounds(0.125F,0.125F,0.125F,0.875F,0.875F,0.875F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGlass);
        this.setResistance(0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:RitualGlass_Tier4");
        this.SideIcon = par1IconRegister.registerIcon("eamod:RitualGlass_Tier4");
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
			double rx = (float)x +Math.random();
        	double ry = (float)y +Math.random();
        	double rz = (float)z +Math.random();
        	world.spawnParticle("happyVillager",rx,ry,rz,0.0D,0.0D,0.0D);
    	}
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
    	ritualGlass.ritualActive(player, world,x,y,z);
    	return true;
    }

    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }

    public boolean canSilkHarvest()
    {
        return true;
    }
}
