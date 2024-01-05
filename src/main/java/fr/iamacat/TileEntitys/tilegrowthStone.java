package fr.iamacat.TileEntitys;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class tilegrowthStone extends TileEntity{
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
	@Override
	public void updateEntity() {
		World world=this.worldObj;
		int x=this.xCoord;
		int y=this.yCoord;
		int z=this.zCoord;
		growth(world.getTileEntity(x+1, y, z),world,x+1,y,z);
		growth(world.getTileEntity(x-1, y, z),world,x-1,y,z);
		growth(world.getTileEntity(x, y+1, z),world,x,y+1,z);
		growth(world.getTileEntity(x, y-1, z),world,x,y-1,z);
		growth(world.getTileEntity(x, y, z+1),world,x,y,z+1);
		growth(world.getTileEntity(x, y, z-1),world,x,y,z-1);

	}
	public void growth(TileEntity entity,World world,int x,int y,int z){
		if (world.isRemote)return;
		if (world.getBlock(x,y,z)== eaMain.growthStone)return;
		for (int ix = 0; ix < 1; ix++){
			world.getBlock(x,y,z).updateTick(this.worldObj,x,y,z,new Random());
		}
	}

}
