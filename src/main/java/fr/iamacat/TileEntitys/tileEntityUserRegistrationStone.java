package TileEntitys;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class tileEntityUserRegistrationStone extends TileEntity{
	private String Eplayer="null";

    public void setString(String par1){
    	this.Eplayer = par1;
    }

    public String getString(){
        return this.Eplayer;
    }

    @Override
	public Packet getDescriptionPacket() {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        this.writeToNBT(nbtTagCompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbtTagCompound);
	}

	@Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.func_148857_g());
    }

	public void writeToNBT(NBTTagCompound par1NBTTagCompound){
	    super.writeToNBT(par1NBTTagCompound);
	    par1NBTTagCompound.setString("String", this.Eplayer);
	}

	public void readFromNBT(NBTTagCompound par1NBTTagCompound){
        super.readFromNBT(par1NBTTagCompound);
        this.Eplayer = par1NBTTagCompound.getString("String");
    }
}
