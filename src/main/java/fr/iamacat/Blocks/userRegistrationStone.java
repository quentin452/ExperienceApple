package Blocks;
import java.util.Random;
import java.util.UUID;

import ExperienceApple.eaMain;
import ExperienceApple.ritualGlass;
import TileEntitys.tileEntityUserRegistrationStone;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
public class userRegistrationStone extends BlockContainer implements ITileEntityProvider
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public userRegistrationStone() {
        super(Material.ground);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("UserRegistrationStone");
        //this.setBlockBounds(0.125F,0.125F,0.125F,0.875F,0.875F,0.875F);
        this.setBlockBounds(0,0,0,1,1,1);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeStone);
        this.setResistance(300F);
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
        this.TopIcon = par1IconRegister.registerIcon("eamod:userRegistrationStone");
        this.SideIcon = par1IconRegister.registerIcon("eamod:userRegistrationStone");
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
		tileEntityUserRegistrationStone entity=(tileEntityUserRegistrationStone)world.getTileEntity(x, y, z);
		UUID UUIDPlayer=player.getPersistentID();
    	if (!player.isSneaking()){
    		entity.setString(UUIDPlayer.toString());
    	}else{
    		if (!world.isRemote){
    			if (entity.getString()=="null"){
    				return true;
    			}
    			EntityPlayer playerE=ritualGlass.lookupPlayer(UUID.fromString(entity.getString()));
    			
    			if (!(playerE==null)){
    				player.addChatMessage(new ChatComponentTranslation(playerE.getDisplayName()));
    			}else{
    				player.addChatMessage(new ChatComponentTranslation("Not registered!"));
    			}
    		}
    	}
        return true;
    }

    @Override
    public int quantityDropped(Random p_149745_1_){
        return 1;
    }

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new tileEntityUserRegistrationStone();
	}
}
