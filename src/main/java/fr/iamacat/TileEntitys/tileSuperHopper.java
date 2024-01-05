package fr.iamacat.TileEntitys;

import net.minecraft.tileentity.TileEntityHopper;

public class tileSuperHopper extends TileEntityHopper{
	public void updateEntity(){
		for (int i = 0; i < 64; ++i){
			if (this.worldObj != null && !this.worldObj.isRemote){
            	if (!this.func_145888_j()){
            		this.func_145896_c(0);
                	this.func_145887_i();
            	}
        	}
		}
    }

	public boolean func_145888_j()
    {
        return false;
    }

	public String getInventoryName()
    {
        return "eaMain:superHopper";
    }
}
