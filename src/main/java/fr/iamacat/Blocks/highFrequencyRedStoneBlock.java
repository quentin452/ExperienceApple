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
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class highFrequencyRedStoneBlock extends Block
{
    public boolean powered=true;
    public boolean changing=false;
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public highFrequencyRedStoneBlock() {
        super(Material.rock);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("highFrequencyRedStoneBlock");
        this.setHardness(1.5F);
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
    public int isProvidingWeakPower(final IBlockAccess block,int x,int y,int z,int par1) {
        int Power=0;
        if (block.getBlockMetadata(x, y, z)==1){
        	Power=15;
        }else{
        	Power=0;
        }
    	return Power;
    }

    public boolean isSideSolid(IBlockAccess block,int x,int y,int z,ForgeDirection side) {
        return true;
    }

    public boolean canProvidePower() {
        return true;
    }

    public void onBlockAdded(World world,int x,int y,int z) {
        world.scheduleBlockUpdate(x,y,z,this,1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:highFrequencyRedStoneBlock");
        this.SideIcon = par1IconRegister.registerIcon("eamod:highFrequencyRedStoneBlock");
    }

    public void updateTick(World world,int x,int y,int z,Random rand) {
        int metadata=world.getBlockMetadata(x,y,z);
        if (metadata==0){
            world.setBlockMetadataWithNotify(x,y,z,1,1);
            changing=false;
            world.scheduleBlockUpdate(x,y,z,this,2);
        }
        else if (metadata==1){
            world.setBlockMetadataWithNotify(x,y,z,0,1);
            powered = true;
            if (world.getBlockPowerInput(x,y,z)>0) {
                world.setBlockMetadataWithNotify(x,y,z,2,0);
                changing=false;
            }else{
                world.scheduleBlockUpdate(x,y,z,this,1);
            }
        }
    }

    public void onNeighborBlockChange(World world,int x,int y,int z,Block block) {
        if (changing) return;
        int metadata=world.getBlockMetadata(x,y,z);
        powered=true;
        if (metadata==0 && world.getBlockPowerInput(x,y,z)>0){
            world.setBlockMetadataWithNotify(x,y,z,2,0);
        }else if (metadata==2 && !(world.getBlockPowerInput(x,y,z)>0)){
            world.setBlockMetadataWithNotify(x,y,z,0,0);
            world.scheduleBlockUpdate(x,y,z,this,1);
        }
    }
    @Override
    public int quantityDropped(Random p_149745_1_){
        return 1;
    }
}
