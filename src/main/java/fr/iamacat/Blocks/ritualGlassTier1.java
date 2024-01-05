package Blocks;
import java.util.Random;

import ExperienceApple.eaMain;
import ExperienceApple.ritualGlass;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
public class ritualGlassTier1 extends BlockGlass
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public ritualGlassTier1() {
        super(Material.glass,true);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("RitualGlassTier1");
        this.setBlockBounds(0.125F,0.125F,0.125F,0.875F,0.875F,0.875F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGlass);
        this.setResistance(0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:RitualGlass_Tier1");
        this.SideIcon = par1IconRegister.registerIcon("eamod:RitualGlass_Tier1");
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
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
    	ritualGlass.ritualActive(player, world,x,y,z);
    	return true;
    }

    public void randomDisplayTick(World world, int x, int y, int z, Random rnd)
    {
    	if (eaMain.particle==true) return;
        double rx = (double)((float)x +rnd.nextFloat());
        double ry = (double)((float)y +rnd.nextFloat());
        double rz = (double)((float)z +rnd.nextFloat());
        world.spawnParticle("happyVillager",rx,ry,rz,0.0D,0.0D,0.0D);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(eaMain.ritualGlassTier1);
    }

    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
}
