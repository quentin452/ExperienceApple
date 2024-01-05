package ExperienceApple;
import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class experienceOreGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider instanceof WorldProviderSurface) {
			generateOre(world, random, chunkX << 4, chunkZ << 4);
		}
	}

	private void generateOre(World world, Random random, int x, int z) {
		if (random.nextInt(8)<2){
			for(int i = 0; i < 1; i++) {
				int genX = x + random.nextInt(16);
				int genY = 1 + random.nextInt(254);
				int genZ = z + random.nextInt(16);
				new WorldGenMinable(eaMain.experienceOre, 0, 40, Blocks.stone).generate(world, random, genX, genY, genZ);
			}
		}
	}


}
