package Blocks;

import ExperienceApple.eaMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class erfahrungIngotBlock extends Block{

	@SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public erfahrungIngotBlock() {
        super(Material.iron);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("ErfahrungIngotBlock");
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

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:erfahrungIngot_block");
        this.SideIcon = par1IconRegister.registerIcon("eamod:erfahrungIngot_block");
    }
}
