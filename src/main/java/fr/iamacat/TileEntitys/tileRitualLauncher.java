package TileEntitys;

import ExperienceApple.ritualGlass;
import net.minecraft.tileentity.TileEntity;

public class tileRitualLauncher extends TileEntity{
    /*@Override
	public Packet getDescriptionPacket() {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        this.writeToNBT(nbtTagCompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbtTagCompound);
	}

	@Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.func_148857_g());
    }*/
	public static boolean buffer=false;
	@Override
	public void updateEntity() {
		
		if (buffer==false && this.worldObj.isBlockIndirectlyGettingPowered(this.xCoord, this.yCoord, this.zCoord)==true){
			ritualGlass.ritualActive(null, worldObj, this.xCoord, this.yCoord, this.zCoord);
		}
		
		buffer=this.worldObj.isBlockIndirectlyGettingPowered(this.xCoord, this.yCoord, this.zCoord);
		
		//System.out.println(this.worldObj.isBlockIndirectlyGettingPowered(this.xCoord, this.yCoord, this.zCoord));
		
	}
}
