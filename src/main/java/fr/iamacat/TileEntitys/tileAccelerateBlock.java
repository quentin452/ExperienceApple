package fr.iamacat.TileEntitys;

import fr.iamacat.ExperienceApple.eaMain;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class tileAccelerateBlock extends TileEntity{
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
		accelerate(world.getTileEntity(x+1, y, z),world,x+1,y,z);
		accelerate(world.getTileEntity(x-1, y, z),world,x-1,y,z);
		accelerate(world.getTileEntity(x, y+1, z),world,x,y+1,z);
		accelerate(world.getTileEntity(x, y-1, z),world,x,y-1,z);
		accelerate(world.getTileEntity(x, y, z+1),world,x,y,z+1);
		accelerate(world.getTileEntity(x, y, z-1),world,x,y,z-1);
	}
	public void accelerate(TileEntity entity,World world,int x,int y,int z){
		if (world.isRemote)return;
		if (world.getBlock(x,y,z)== eaMain.accelerateStone)return;
		if (world.getBlock(x,y,z)==eaMain.advancedAccelerateStone)return;
		if (entity==null)return;
		if (entity.isInvalid())return;
		if (entity instanceof ITickable)return;
		for (int ix = 0; ix < 300; ix++){
			entity.updateEntity();
		}
	}
}
