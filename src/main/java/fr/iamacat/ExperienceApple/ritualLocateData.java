package fr.iamacat.ExperienceApple;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class ritualLocateData {
    public static final int ritualAmount=30;
    public static final int ritualsize=4;
    public static final Block[][][][] ritualLocate =new Block[ritualAmount][ritualsize-1][ritualsize-1][ritualsize-1];
    public static Block Data(int n,int x,int y,int z){
    	ritualLocate[0][0][0][0]=Blocks.air;
    	ritualLocate[0][0][0][1]=Blocks.air;
    	ritualLocate[0][0][0][2]=Blocks.air;
    	ritualLocate[0][1][0][0]=Blocks.air;
    	ritualLocate[0][1][0][1]=Blocks.air;
    	ritualLocate[0][1][0][2]=Blocks.air;
    	ritualLocate[0][2][0][0]=Blocks.air;
    	ritualLocate[0][2][0][1]=Blocks.air;
    	ritualLocate[0][2][0][2]=Blocks.air;
    	ritualLocate[0][0][1][0]=Blocks.air;
    	ritualLocate[0][0][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[0][0][1][2]=Blocks.air;
    	ritualLocate[0][1][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[0][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[0][1][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[0][2][1][0]=Blocks.air;
    	ritualLocate[0][2][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[0][2][1][2]=Blocks.air;
    	ritualLocate[0][0][2][0]=Blocks.air;
    	ritualLocate[0][0][2][1]=Blocks.air;
    	ritualLocate[0][0][2][2]=Blocks.air;
    	ritualLocate[0][1][2][0]=Blocks.air;
    	ritualLocate[0][1][2][1]=Blocks.air;
    	ritualLocate[0][1][2][2]=Blocks.air;
    	ritualLocate[0][2][2][0]=Blocks.air;
    	ritualLocate[0][2][2][1]=Blocks.air;
    	ritualLocate[0][2][2][2]=Blocks.air;

    	ritualLocate[1][0][0][0]=Blocks.glowstone;
    	ritualLocate[1][0][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[1][0][0][2]=Blocks.glowstone;
    	ritualLocate[1][1][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[1][1][0][1]=Blocks.glowstone;
    	ritualLocate[1][1][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[1][2][0][0]=Blocks.glowstone;
    	ritualLocate[1][2][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[1][2][0][2]=Blocks.glowstone;
    	ritualLocate[1][0][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[1][0][1][1]=Blocks.glowstone;
    	ritualLocate[1][0][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[1][1][1][0]=Blocks.glowstone;
    	ritualLocate[1][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[1][1][1][2]=Blocks.glowstone;
    	ritualLocate[1][2][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[1][2][1][1]=Blocks.glowstone;
    	ritualLocate[1][2][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[1][0][2][0]=Blocks.glowstone;
    	ritualLocate[1][0][2][1]=eaMain.ritualGlassTier1;
    	ritualLocate[1][0][2][2]=Blocks.glowstone;
    	ritualLocate[1][1][2][0]=eaMain.ritualGlassTier1;
    	ritualLocate[1][1][2][1]=Blocks.air;
    	ritualLocate[1][1][2][2]=eaMain.ritualGlassTier1;
    	ritualLocate[1][2][2][0]=Blocks.glowstone;
    	ritualLocate[1][2][2][1]=eaMain.ritualGlassTier1;
    	ritualLocate[1][2][2][2]=Blocks.glowstone;

    	ritualLocate[2][0][0][0]=Blocks.iron_block;
    	ritualLocate[2][0][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[2][0][0][2]=Blocks.iron_block;
    	ritualLocate[2][1][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[2][1][0][1]=Blocks.iron_block;
    	ritualLocate[2][1][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[2][2][0][0]=Blocks.iron_block;
    	ritualLocate[2][2][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[2][2][0][2]=Blocks.iron_block;
    	ritualLocate[2][0][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[2][0][1][1]=Blocks.iron_block;
    	ritualLocate[2][0][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[2][1][1][0]=Blocks.iron_block;
    	ritualLocate[2][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[2][1][1][2]=Blocks.iron_block;
    	ritualLocate[2][2][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[2][2][1][1]=Blocks.iron_block;
    	ritualLocate[2][2][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[2][0][2][0]=Blocks.iron_block;
    	ritualLocate[2][0][2][1]=eaMain.ritualGlassTier1;
    	ritualLocate[2][0][2][2]=Blocks.iron_block;
    	ritualLocate[2][1][2][0]=eaMain.ritualGlassTier1;
    	ritualLocate[2][1][2][1]=Blocks.air;
    	ritualLocate[2][1][2][2]=eaMain.ritualGlassTier1;
    	ritualLocate[2][2][2][0]=Blocks.iron_block;
    	ritualLocate[2][2][2][1]=eaMain.ritualGlassTier1;
    	ritualLocate[2][2][2][2]=Blocks.iron_block;

    	ritualLocate[3][0][0][0]=Blocks.air;
    	ritualLocate[3][0][0][1]=Blocks.air;
    	ritualLocate[3][0][0][2]=Blocks.air;
    	ritualLocate[3][1][0][0]=Blocks.air;
    	ritualLocate[3][1][0][1]=Blocks.air;
    	ritualLocate[3][1][0][2]=Blocks.air;
    	ritualLocate[3][2][0][0]=Blocks.air;
    	ritualLocate[3][2][0][1]=Blocks.air;
    	ritualLocate[3][2][0][2]=Blocks.air;
    	ritualLocate[3][0][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[3][0][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[3][0][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[3][1][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[3][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[3][1][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[3][2][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[3][2][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[3][2][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[3][0][2][0]=Blocks.air;
    	ritualLocate[3][0][2][1]=Blocks.air;
    	ritualLocate[3][0][2][2]=Blocks.air;
    	ritualLocate[3][1][2][0]=Blocks.air;
    	ritualLocate[3][1][2][1]=Blocks.air;
    	ritualLocate[3][1][2][2]=Blocks.air;
    	ritualLocate[3][2][2][0]=Blocks.air;
    	ritualLocate[3][2][2][1]=Blocks.air;
    	ritualLocate[3][2][2][2]=Blocks.air;

    	ritualLocate[4][0][0][0]=Blocks.air;
    	ritualLocate[4][0][0][1]=Blocks.air;
    	ritualLocate[4][0][0][2]=Blocks.air;
    	ritualLocate[4][1][0][0]=Blocks.air;
    	ritualLocate[4][1][0][1]=Blocks.air;
    	ritualLocate[4][1][0][2]=Blocks.air;
    	ritualLocate[4][2][0][0]=Blocks.air;
    	ritualLocate[4][2][0][1]=Blocks.air;
    	ritualLocate[4][2][0][2]=Blocks.air;
    	ritualLocate[4][0][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[4][0][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[4][0][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[4][1][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[4][1][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[4][1][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[4][2][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[4][2][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[4][2][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[4][0][2][0]=Blocks.air;
    	ritualLocate[4][0][2][1]=Blocks.air;
    	ritualLocate[4][0][2][2]=Blocks.air;
    	ritualLocate[4][1][2][0]=Blocks.air;
    	ritualLocate[4][1][2][1]=Blocks.air;
    	ritualLocate[4][1][2][2]=Blocks.air;
    	ritualLocate[4][2][2][0]=Blocks.air;
    	ritualLocate[4][2][2][1]=Blocks.air;
    	ritualLocate[4][2][2][2]=Blocks.air;

    	ritualLocate[5][0][0][0]=Blocks.air;
    	ritualLocate[5][0][0][1]=Blocks.air;
    	ritualLocate[5][0][0][2]=Blocks.air;
    	ritualLocate[5][1][0][0]=Blocks.air;
    	ritualLocate[5][1][0][1]=Blocks.air;
    	ritualLocate[5][1][0][2]=Blocks.air;
    	ritualLocate[5][2][0][0]=Blocks.air;
    	ritualLocate[5][2][0][1]=Blocks.air;
    	ritualLocate[5][2][0][2]=Blocks.air;
    	ritualLocate[5][0][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[5][0][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[5][0][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[5][1][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[5][1][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[5][1][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[5][2][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[5][2][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[5][2][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[5][0][2][0]=Blocks.air;
    	ritualLocate[5][0][2][1]=Blocks.air;
    	ritualLocate[5][0][2][2]=Blocks.air;
    	ritualLocate[5][1][2][0]=Blocks.air;
    	ritualLocate[5][1][2][1]=Blocks.air;
    	ritualLocate[5][1][2][2]=Blocks.air;
    	ritualLocate[5][2][2][0]=Blocks.air;
    	ritualLocate[5][2][2][1]=Blocks.air;
    	ritualLocate[5][2][2][2]=Blocks.air;

    	ritualLocate[6][0][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[6][0][0][1]=eaMain.ritualGlassTier4;
    	ritualLocate[6][0][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[6][1][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[6][1][0][1]=eaMain.ritualGlassTier4;
    	ritualLocate[6][1][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[6][2][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[6][2][0][1]=eaMain.ritualGlassTier4;
    	ritualLocate[6][2][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[6][0][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[6][0][1][1]=Blocks.air;
    	ritualLocate[6][0][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[6][1][1][0]=Blocks.air;
    	ritualLocate[6][1][1][1]=eaMain.ritualGlassTier4;
    	ritualLocate[6][1][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[6][2][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[6][2][1][1]=Blocks.air;
    	ritualLocate[6][2][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[6][0][2][0]=Blocks.air;
    	ritualLocate[6][0][2][1]=Blocks.air;
    	ritualLocate[6][0][2][2]=Blocks.air;
    	ritualLocate[6][1][2][0]=Blocks.air;
    	ritualLocate[6][1][2][1]=Blocks.air;
    	ritualLocate[6][1][2][2]=Blocks.air;
    	ritualLocate[6][2][2][0]=Blocks.air;
    	ritualLocate[6][2][2][1]=Blocks.air;
    	ritualLocate[6][2][2][2]=Blocks.air;

    	ritualLocate[7][0][0][0]=Blocks.air;
    	ritualLocate[7][0][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[7][0][0][2]=Blocks.air;
    	ritualLocate[7][1][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[7][1][0][1]=Blocks.air;
    	ritualLocate[7][1][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[7][2][0][0]=Blocks.air;
    	ritualLocate[7][2][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[7][2][0][2]=Blocks.air;
    	ritualLocate[7][0][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[7][0][1][1]=Blocks.air;
    	ritualLocate[7][0][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[7][1][1][0]=Blocks.air;
    	ritualLocate[7][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[7][1][1][2]=Blocks.air;
    	ritualLocate[7][2][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[7][2][1][1]=Blocks.air;
    	ritualLocate[7][2][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[7][0][2][0]=Blocks.air;
    	ritualLocate[7][0][2][1]=eaMain.ritualGlassTier1;
    	ritualLocate[7][0][2][2]=Blocks.air;
    	ritualLocate[7][1][2][0]=eaMain.ritualGlassTier1;
    	ritualLocate[7][1][2][1]=eaMain.ritualGlassTier1;
    	ritualLocate[7][1][2][2]=eaMain.ritualGlassTier1;
    	ritualLocate[7][2][2][0]=Blocks.air;
    	ritualLocate[7][2][2][1]=eaMain.ritualGlassTier1;
    	ritualLocate[7][2][2][2]=Blocks.air;

    	ritualLocate[8][0][0][0]=Blocks.air;
    	ritualLocate[8][0][0][1]=eaMain.ritualGlassTier2;
    	ritualLocate[8][0][0][2]=Blocks.air;
    	ritualLocate[8][1][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[8][1][0][1]=Blocks.air;
    	ritualLocate[8][1][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[8][2][0][0]=Blocks.air;
    	ritualLocate[8][2][0][1]=eaMain.ritualGlassTier2;
    	ritualLocate[8][2][0][2]=Blocks.air;
    	ritualLocate[8][0][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[8][0][1][1]=Blocks.air;
    	ritualLocate[8][0][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[8][1][1][0]=Blocks.air;
    	ritualLocate[8][1][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[8][1][1][2]=Blocks.air;
    	ritualLocate[8][2][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[8][2][1][1]=Blocks.air;
    	ritualLocate[8][2][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[8][0][2][0]=Blocks.air;
    	ritualLocate[8][0][2][1]=eaMain.ritualGlassTier2;
    	ritualLocate[8][0][2][2]=Blocks.air;
    	ritualLocate[8][1][2][0]=eaMain.ritualGlassTier2;
    	ritualLocate[8][1][2][1]=eaMain.ritualGlassTier2;
    	ritualLocate[8][1][2][2]=eaMain.ritualGlassTier2;
    	ritualLocate[8][2][2][0]=Blocks.air;
    	ritualLocate[8][2][2][1]=eaMain.ritualGlassTier2;
    	ritualLocate[8][2][2][2]=Blocks.air;

    	ritualLocate[9][0][0][0]=Blocks.air;
    	ritualLocate[9][0][0][1]=eaMain.ritualGlassTier3;
    	ritualLocate[9][0][0][2]=Blocks.air;
    	ritualLocate[9][1][0][0]=eaMain.ritualGlassTier3;
    	ritualLocate[9][1][0][1]=Blocks.air;
    	ritualLocate[9][1][0][2]=eaMain.ritualGlassTier3;
    	ritualLocate[9][2][0][0]=Blocks.air;
    	ritualLocate[9][2][0][1]=eaMain.ritualGlassTier3;
    	ritualLocate[9][2][0][2]=Blocks.air;
    	ritualLocate[9][0][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[9][0][1][1]=Blocks.air;
    	ritualLocate[9][0][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[9][1][1][0]=Blocks.air;
    	ritualLocate[9][1][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[9][1][1][2]=Blocks.air;
    	ritualLocate[9][2][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[9][2][1][1]=Blocks.air;
    	ritualLocate[9][2][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[9][0][2][0]=Blocks.air;
    	ritualLocate[9][0][2][1]=eaMain.ritualGlassTier3;
    	ritualLocate[9][0][2][2]=Blocks.air;
    	ritualLocate[9][1][2][0]=eaMain.ritualGlassTier3;
    	ritualLocate[9][1][2][1]=eaMain.ritualGlassTier3;
    	ritualLocate[9][1][2][2]=eaMain.ritualGlassTier3;
    	ritualLocate[9][2][2][0]=Blocks.air;
    	ritualLocate[9][2][2][1]=eaMain.ritualGlassTier3;
    	ritualLocate[9][2][2][2]=Blocks.air;

    	ritualLocate[10][0][0][0]=Blocks.air;
    	ritualLocate[10][0][0][1]=eaMain.ritualGlassTier4;
    	ritualLocate[10][0][0][2]=Blocks.air;
    	ritualLocate[10][1][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[10][1][0][1]=Blocks.air;
    	ritualLocate[10][1][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[10][2][0][0]=Blocks.air;
    	ritualLocate[10][2][0][1]=eaMain.ritualGlassTier4;
    	ritualLocate[10][2][0][2]=Blocks.air;
    	ritualLocate[10][0][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[10][0][1][1]=Blocks.air;
    	ritualLocate[10][0][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[10][1][1][0]=Blocks.air;
    	ritualLocate[10][1][1][1]=eaMain.ritualGlassTier4;
    	ritualLocate[10][1][1][2]=Blocks.air;
    	ritualLocate[10][2][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[10][2][1][1]=Blocks.air;
    	ritualLocate[10][2][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[10][0][2][0]=Blocks.air;
    	ritualLocate[10][0][2][1]=eaMain.ritualGlassTier4;
    	ritualLocate[10][0][2][2]=Blocks.air;
    	ritualLocate[10][1][2][0]=eaMain.ritualGlassTier4;
    	ritualLocate[10][1][2][1]=eaMain.ritualGlassTier4;
    	ritualLocate[10][1][2][2]=eaMain.ritualGlassTier4;
    	ritualLocate[10][2][2][0]=Blocks.air;
    	ritualLocate[10][2][2][1]=eaMain.ritualGlassTier4;
    	ritualLocate[10][2][2][2]=Blocks.air;

    	ritualLocate[11][0][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[11][0][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[11][0][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[11][1][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[11][1][0][1]=Blocks.air;
    	ritualLocate[11][1][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[11][2][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[11][2][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[11][2][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[11][0][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[11][0][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[11][0][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[11][1][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[11][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[11][1][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[11][2][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[11][2][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[11][2][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[11][0][2][0]=Blocks.air;
    	ritualLocate[11][0][2][1]=Blocks.air;
    	ritualLocate[11][0][2][2]=Blocks.air;
    	ritualLocate[11][1][2][0]=Blocks.air;
    	ritualLocate[11][1][2][1]=Blocks.air;
    	ritualLocate[11][1][2][2]=Blocks.air;
    	ritualLocate[11][2][2][0]=Blocks.air;
    	ritualLocate[11][2][2][1]=Blocks.air;
    	ritualLocate[11][2][2][2]=Blocks.air;

    	ritualLocate[12][0][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[12][0][0][1]=eaMain.ritualGlassTier2;
    	ritualLocate[12][0][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[12][1][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[12][1][0][1]=Blocks.air;
    	ritualLocate[12][1][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[12][2][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[12][2][0][1]=eaMain.ritualGlassTier2;
    	ritualLocate[12][2][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[12][0][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[12][0][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[12][0][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[12][1][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[12][1][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[12][1][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[12][2][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[12][2][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[12][2][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[12][0][2][0]=Blocks.air;
    	ritualLocate[12][0][2][1]=Blocks.air;
    	ritualLocate[12][0][2][2]=Blocks.air;
    	ritualLocate[12][1][2][0]=Blocks.air;
    	ritualLocate[12][1][2][1]=Blocks.air;
    	ritualLocate[12][1][2][2]=Blocks.air;
    	ritualLocate[12][2][2][0]=Blocks.air;
    	ritualLocate[12][2][2][1]=Blocks.air;
    	ritualLocate[12][2][2][2]=Blocks.air;

    	ritualLocate[13][0][0][0]=eaMain.ritualGlassTier3;
    	ritualLocate[13][0][0][1]=eaMain.ritualGlassTier3;
    	ritualLocate[13][0][0][2]=eaMain.ritualGlassTier3;
    	ritualLocate[13][1][0][0]=eaMain.ritualGlassTier3;
    	ritualLocate[13][1][0][1]=Blocks.air;
    	ritualLocate[13][1][0][2]=eaMain.ritualGlassTier3;
    	ritualLocate[13][2][0][0]=eaMain.ritualGlassTier3;
    	ritualLocate[13][2][0][1]=eaMain.ritualGlassTier3;
    	ritualLocate[13][2][0][2]=eaMain.ritualGlassTier3;
    	ritualLocate[13][0][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[13][0][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[13][0][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[13][1][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[13][1][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[13][1][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[13][2][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[13][2][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[13][2][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[13][0][2][0]=Blocks.air;
    	ritualLocate[13][0][2][1]=Blocks.air;
    	ritualLocate[13][0][2][2]=Blocks.air;
    	ritualLocate[13][1][2][0]=Blocks.air;
    	ritualLocate[13][1][2][1]=Blocks.air;
    	ritualLocate[13][1][2][2]=Blocks.air;
    	ritualLocate[13][2][2][0]=Blocks.air;
    	ritualLocate[13][2][2][1]=Blocks.air;
    	ritualLocate[13][2][2][2]=Blocks.air;

    	ritualLocate[14][0][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[14][0][0][1]=eaMain.ritualGlassTier4;
    	ritualLocate[14][0][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[14][1][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[14][1][0][1]=Blocks.air;
    	ritualLocate[14][1][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[14][2][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[14][2][0][1]=eaMain.ritualGlassTier4;
    	ritualLocate[14][2][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[14][0][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[14][0][1][1]=eaMain.ritualGlassTier4;
    	ritualLocate[14][0][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[14][1][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[14][1][1][1]=eaMain.ritualGlassTier4;
    	ritualLocate[14][1][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[14][2][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[14][2][1][1]=eaMain.ritualGlassTier4;
    	ritualLocate[14][2][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[14][0][2][0]=Blocks.air;
    	ritualLocate[14][0][2][1]=Blocks.air;
    	ritualLocate[14][0][2][2]=Blocks.air;
    	ritualLocate[14][1][2][0]=Blocks.air;
    	ritualLocate[14][1][2][1]=Blocks.air;
    	ritualLocate[14][1][2][2]=Blocks.air;
    	ritualLocate[14][2][2][0]=Blocks.air;
    	ritualLocate[14][2][2][1]=Blocks.air;
    	ritualLocate[14][2][2][2]=Blocks.air;

    	ritualLocate[15][0][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[15][0][0][1]=Blocks.air;
    	ritualLocate[15][0][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[15][1][0][0]=Blocks.air;
    	ritualLocate[15][1][0][1]=Blocks.air;
    	ritualLocate[15][1][0][2]=Blocks.air;
    	ritualLocate[15][2][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[15][2][0][1]=Blocks.air;
    	ritualLocate[15][2][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[15][0][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[15][0][1][1]=Blocks.air;
    	ritualLocate[15][0][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[15][1][1][0]=Blocks.air;
    	ritualLocate[15][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[15][1][1][2]=Blocks.air;
    	ritualLocate[15][2][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[15][2][1][1]=Blocks.air;
    	ritualLocate[15][2][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[15][0][2][0]=Blocks.air;
    	ritualLocate[15][0][2][1]=Blocks.air;
    	ritualLocate[15][0][2][2]=Blocks.air;
    	ritualLocate[15][1][2][0]=Blocks.air;
    	ritualLocate[15][1][2][1]=eaMain.ritualGlassTier1;
    	ritualLocate[15][1][2][2]=Blocks.air;
    	ritualLocate[15][2][2][0]=Blocks.air;
    	ritualLocate[15][2][2][1]=Blocks.air;
    	ritualLocate[15][2][2][2]=Blocks.air;

    	ritualLocate[16][0][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[16][0][0][1]=Blocks.air;
    	ritualLocate[16][0][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[16][1][0][0]=Blocks.air;
    	ritualLocate[16][1][0][1]=Blocks.air;
    	ritualLocate[16][1][0][2]=Blocks.air;
    	ritualLocate[16][2][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[16][2][0][1]=Blocks.air;
    	ritualLocate[16][2][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[16][0][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[16][0][1][1]=Blocks.air;
    	ritualLocate[16][0][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[16][1][1][0]=Blocks.air;
    	ritualLocate[16][1][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[16][1][1][2]=Blocks.air;
    	ritualLocate[16][2][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[16][2][1][1]=Blocks.air;
    	ritualLocate[16][2][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[16][0][2][0]=Blocks.air;
    	ritualLocate[16][0][2][1]=Blocks.air;
    	ritualLocate[16][0][2][2]=Blocks.air;
    	ritualLocate[16][1][2][0]=Blocks.air;
    	ritualLocate[16][1][2][1]=eaMain.ritualGlassTier2;
    	ritualLocate[16][1][2][2]=Blocks.air;
    	ritualLocate[16][2][2][0]=Blocks.air;
    	ritualLocate[16][2][2][1]=Blocks.air;
    	ritualLocate[16][2][2][2]=Blocks.air;

    	ritualLocate[17][0][0][0]=eaMain.ritualGlassTier3;
    	ritualLocate[17][0][0][1]=Blocks.air;
    	ritualLocate[17][0][0][2]=eaMain.ritualGlassTier3;
    	ritualLocate[17][1][0][0]=Blocks.air;
    	ritualLocate[17][1][0][1]=Blocks.air;
    	ritualLocate[17][1][0][2]=Blocks.air;
    	ritualLocate[17][2][0][0]=eaMain.ritualGlassTier3;
    	ritualLocate[17][2][0][1]=Blocks.air;
    	ritualLocate[17][2][0][2]=eaMain.ritualGlassTier3;
    	ritualLocate[17][0][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[17][0][1][1]=Blocks.air;
    	ritualLocate[17][0][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[17][1][1][0]=Blocks.air;
    	ritualLocate[17][1][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[17][1][1][2]=Blocks.air;
    	ritualLocate[17][2][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[17][2][1][1]=Blocks.air;
    	ritualLocate[17][2][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[17][0][2][0]=Blocks.air;
    	ritualLocate[17][0][2][1]=Blocks.air;
    	ritualLocate[17][0][2][2]=Blocks.air;
    	ritualLocate[17][1][2][0]=Blocks.air;
    	ritualLocate[17][1][2][1]=eaMain.ritualGlassTier3;
    	ritualLocate[17][1][2][2]=Blocks.air;
    	ritualLocate[17][2][2][0]=Blocks.air;
    	ritualLocate[17][2][2][1]=Blocks.air;
    	ritualLocate[17][2][2][2]=Blocks.air;

    	ritualLocate[18][0][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[18][0][0][1]=Blocks.air;
    	ritualLocate[18][0][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[18][1][0][0]=Blocks.air;
    	ritualLocate[18][1][0][1]=Blocks.air;
    	ritualLocate[18][1][0][2]=Blocks.air;
    	ritualLocate[18][2][0][0]=eaMain.ritualGlassTier4;
    	ritualLocate[18][2][0][1]=Blocks.air;
    	ritualLocate[18][2][0][2]=eaMain.ritualGlassTier4;
    	ritualLocate[18][0][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[18][0][1][1]=Blocks.air;
    	ritualLocate[18][0][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[18][1][1][0]=Blocks.air;
    	ritualLocate[18][1][1][1]=eaMain.ritualGlassTier4;
    	ritualLocate[18][1][1][2]=Blocks.air;
    	ritualLocate[18][2][1][0]=eaMain.ritualGlassTier4;
    	ritualLocate[18][2][1][1]=Blocks.air;
    	ritualLocate[18][2][1][2]=eaMain.ritualGlassTier4;
    	ritualLocate[18][0][2][0]=Blocks.air;
    	ritualLocate[18][0][2][1]=Blocks.air;
    	ritualLocate[18][0][2][2]=Blocks.air;
    	ritualLocate[18][1][2][0]=Blocks.air;
    	ritualLocate[18][1][2][1]=eaMain.ritualGlassTier4;
    	ritualLocate[18][1][2][2]=Blocks.air;
    	ritualLocate[18][2][2][0]=Blocks.air;
    	ritualLocate[18][2][2][1]=Blocks.air;
    	ritualLocate[18][2][2][2]=Blocks.air;

    	ritualLocate[19][0][0][0]=eaMain.experienceIngotBlock;
    	ritualLocate[19][0][0][1]=eaMain.ritualGlassTier3;
    	ritualLocate[19][0][0][2]=eaMain.experienceIngotBlock;
    	ritualLocate[19][1][0][0]=eaMain.ritualGlassTier3;
    	ritualLocate[19][1][0][1]=eaMain.experienceGlowStone;
    	ritualLocate[19][1][0][2]=eaMain.ritualGlassTier3;
    	ritualLocate[19][2][0][0]=eaMain.experienceIngotBlock;
    	ritualLocate[19][2][0][1]=eaMain.ritualGlassTier3;
    	ritualLocate[19][2][0][2]=eaMain.experienceIngotBlock;
    	ritualLocate[19][0][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[19][0][1][1]=eaMain.experienceGlowStone;
    	ritualLocate[19][0][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[19][1][1][0]=eaMain.experienceGlowStone;
    	ritualLocate[19][1][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[19][1][1][2]=eaMain.experienceGlowStone;
    	ritualLocate[19][2][1][0]=eaMain.ritualGlassTier3;
    	ritualLocate[19][2][1][1]=eaMain.experienceGlowStone;
    	ritualLocate[19][2][1][2]=eaMain.ritualGlassTier3;
    	ritualLocate[19][0][2][0]=eaMain.experienceIngotBlock;
    	ritualLocate[19][0][2][1]=eaMain.ritualGlassTier3;
    	ritualLocate[19][0][2][2]=eaMain.experienceIngotBlock;
    	ritualLocate[19][1][2][0]=eaMain.ritualGlassTier3;
    	ritualLocate[19][1][2][1]=Blocks.air;
    	ritualLocate[19][1][2][2]=eaMain.ritualGlassTier3;
    	ritualLocate[19][2][2][0]=eaMain.experienceIngotBlock;
    	ritualLocate[19][2][2][1]=eaMain.ritualGlassTier3;
    	ritualLocate[19][2][2][2]=eaMain.experienceIngotBlock;

    	ritualLocate[20][0][0][0]=Blocks.air;
    	ritualLocate[20][0][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[20][0][0][2]=Blocks.air;
    	ritualLocate[20][1][0][0]=eaMain.ritualGlassTier1;
    	ritualLocate[20][1][0][1]=Blocks.air;
    	ritualLocate[20][1][0][2]=eaMain.ritualGlassTier1;
    	ritualLocate[20][2][0][0]=Blocks.air;
    	ritualLocate[20][2][0][1]=eaMain.ritualGlassTier1;
    	ritualLocate[20][2][0][2]=Blocks.air;
    	ritualLocate[20][0][1][0]=Blocks.air;
    	ritualLocate[20][0][1][1]=Blocks.air;
    	ritualLocate[20][0][1][2]=Blocks.air;
    	ritualLocate[20][1][1][0]=Blocks.air;
    	ritualLocate[20][1][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[20][1][1][2]=Blocks.air;
    	ritualLocate[20][2][1][0]=Blocks.air;
    	ritualLocate[20][2][1][1]=Blocks.air;
    	ritualLocate[20][2][1][2]=Blocks.air;
    	ritualLocate[20][0][2][0]=Blocks.air;
    	ritualLocate[20][0][2][1]=Blocks.air;
    	ritualLocate[20][0][2][2]=Blocks.air;
    	ritualLocate[20][1][2][0]=Blocks.air;
    	ritualLocate[20][1][2][1]=Blocks.air;
    	ritualLocate[20][1][2][2]=Blocks.air;
    	ritualLocate[20][2][2][0]=Blocks.air;
    	ritualLocate[20][2][2][1]=Blocks.air;
    	ritualLocate[20][2][2][2]=Blocks.air;

    	ritualLocate[21][0][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[21][0][0][1]=eaMain.ritualGlassTier2;
    	ritualLocate[21][0][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[21][1][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[21][1][0][1]=Blocks.air;
    	ritualLocate[21][1][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[21][2][0][0]=eaMain.ritualGlassTier2;
    	ritualLocate[21][2][0][1]=eaMain.ritualGlassTier2;
    	ritualLocate[21][2][0][2]=eaMain.ritualGlassTier2;
    	ritualLocate[21][0][1][0]=Blocks.air;
    	ritualLocate[21][0][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[21][0][1][2]=Blocks.air;
    	ritualLocate[21][1][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[21][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[21][1][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[21][2][1][0]=Blocks.air;
    	ritualLocate[21][2][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[21][2][1][2]=Blocks.air;
    	ritualLocate[21][0][2][0]=Blocks.air;
    	ritualLocate[21][0][2][1]=Blocks.air;
    	ritualLocate[21][0][2][2]=Blocks.air;
    	ritualLocate[21][1][2][0]=Blocks.air;
    	ritualLocate[21][1][2][1]=Blocks.air;
    	ritualLocate[21][1][2][2]=Blocks.air;
    	ritualLocate[21][2][2][0]=Blocks.air;
    	ritualLocate[21][2][2][1]=Blocks.air;
    	ritualLocate[21][2][2][2]=Blocks.air;

    	ritualLocate[22][0][0][0]=Blocks.air;
    	ritualLocate[22][0][0][1]=Blocks.air;
    	ritualLocate[22][0][0][2]=Blocks.air;
    	ritualLocate[22][1][0][0]=Blocks.air;
    	ritualLocate[22][1][0][1]=Blocks.air;
    	ritualLocate[22][1][0][2]=Blocks.air;
    	ritualLocate[22][2][0][0]=Blocks.air;
    	ritualLocate[22][2][0][1]=Blocks.air;
    	ritualLocate[22][2][0][2]=Blocks.air;
    	ritualLocate[22][0][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[22][0][1][1]=Blocks.air;
    	ritualLocate[22][0][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[22][1][1][0]=Blocks.air;
    	ritualLocate[22][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[22][1][1][2]=Blocks.air;
    	ritualLocate[22][2][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[22][2][1][1]=Blocks.air;
    	ritualLocate[22][2][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[22][0][2][0]=Blocks.air;
    	ritualLocate[22][0][2][1]=Blocks.air;
    	ritualLocate[22][0][2][2]=Blocks.air;
    	ritualLocate[22][1][2][0]=Blocks.air;
    	ritualLocate[22][1][2][1]=Blocks.air;
    	ritualLocate[22][1][2][2]=Blocks.air;
    	ritualLocate[22][2][2][0]=Blocks.air;
    	ritualLocate[22][2][2][1]=Blocks.air;
    	ritualLocate[22][2][2][2]=Blocks.air;

    	ritualLocate[23][0][0][0]=Blocks.air;
    	ritualLocate[23][0][0][1]=Blocks.air;
    	ritualLocate[23][0][0][2]=Blocks.air;
    	ritualLocate[23][1][0][0]=Blocks.air;
    	ritualLocate[23][1][0][1]=Blocks.air;
    	ritualLocate[23][1][0][2]=Blocks.air;
    	ritualLocate[23][2][0][0]=Blocks.air;
    	ritualLocate[23][2][0][1]=Blocks.air;
    	ritualLocate[23][2][0][2]=Blocks.air;
    	ritualLocate[23][0][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[23][0][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[23][0][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[23][1][1][0]=eaMain.ritualGlassTier2;
    	ritualLocate[23][1][1][1]=eaMain.ritualGlassTier1;
    	ritualLocate[23][1][1][2]=eaMain.ritualGlassTier2;
    	ritualLocate[23][2][1][0]=eaMain.ritualGlassTier1;
    	ritualLocate[23][2][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[23][2][1][2]=eaMain.ritualGlassTier1;
    	ritualLocate[23][0][2][0]=Blocks.air;
    	ritualLocate[23][0][2][1]=Blocks.air;
    	ritualLocate[23][0][2][2]=Blocks.air;
    	ritualLocate[23][1][2][0]=Blocks.air;
    	ritualLocate[23][1][2][1]=Blocks.air;
    	ritualLocate[23][1][2][2]=Blocks.air;
    	ritualLocate[23][2][2][0]=Blocks.air;
    	ritualLocate[23][2][2][1]=Blocks.air;
    	ritualLocate[23][2][2][2]=Blocks.air;

    	ritualLocate[24][0][0][0]=Blocks.air;
    	ritualLocate[24][0][0][1]=Blocks.air;
    	ritualLocate[24][0][0][2]=Blocks.air;
    	ritualLocate[24][1][0][0]=Blocks.air;
    	ritualLocate[24][1][0][1]=Blocks.air;
    	ritualLocate[24][1][0][2]=Blocks.air;
    	ritualLocate[24][2][0][0]=Blocks.air;
    	ritualLocate[24][2][0][1]=Blocks.air;
    	ritualLocate[24][2][0][2]=Blocks.air;
    	ritualLocate[24][0][1][0]=Blocks.air;
    	ritualLocate[24][0][1][1]=Blocks.air;
    	ritualLocate[24][0][1][2]=Blocks.air;
    	ritualLocate[24][1][1][0]=Blocks.air;
    	ritualLocate[24][1][1][1]=eaMain.ritualGlassTier2;
    	ritualLocate[24][1][1][2]=Blocks.air;
    	ritualLocate[24][2][1][0]=Blocks.air;
    	ritualLocate[24][2][1][1]=Blocks.air;
    	ritualLocate[24][2][1][2]=Blocks.air;
    	ritualLocate[24][0][2][0]=Blocks.air;
    	ritualLocate[24][0][2][1]=Blocks.air;
    	ritualLocate[24][0][2][2]=Blocks.air;
    	ritualLocate[24][1][2][0]=Blocks.air;
    	ritualLocate[24][1][2][1]=Blocks.air;
    	ritualLocate[24][1][2][2]=Blocks.air;
    	ritualLocate[24][2][2][0]=Blocks.air;
    	ritualLocate[24][2][2][1]=Blocks.air;
    	ritualLocate[24][2][2][2]=Blocks.air;

    	ritualLocate[25][0][0][0]=Blocks.air;
    	ritualLocate[25][0][0][1]=Blocks.air;
    	ritualLocate[25][0][0][2]=Blocks.air;
    	ritualLocate[25][1][0][0]=Blocks.air;
    	ritualLocate[25][1][0][1]=Blocks.air;
    	ritualLocate[25][1][0][2]=Blocks.air;
    	ritualLocate[25][2][0][0]=Blocks.air;
    	ritualLocate[25][2][0][1]=Blocks.air;
    	ritualLocate[25][2][0][2]=Blocks.air;
    	ritualLocate[25][0][1][0]=Blocks.air;
    	ritualLocate[25][0][1][1]=Blocks.air;
    	ritualLocate[25][0][1][2]=Blocks.air;
    	ritualLocate[25][1][1][0]=Blocks.air;
    	ritualLocate[25][1][1][1]=eaMain.ritualGlassTier3;
    	ritualLocate[25][1][1][2]=Blocks.air;
    	ritualLocate[25][2][1][0]=Blocks.air;
    	ritualLocate[25][2][1][1]=Blocks.air;
    	ritualLocate[25][2][1][2]=Blocks.air;
    	ritualLocate[25][0][2][0]=Blocks.air;
    	ritualLocate[25][0][2][1]=Blocks.air;
    	ritualLocate[25][0][2][2]=Blocks.air;
    	ritualLocate[25][1][2][0]=Blocks.air;
    	ritualLocate[25][1][2][1]=Blocks.air;
    	ritualLocate[25][1][2][2]=Blocks.air;
    	ritualLocate[25][2][2][0]=Blocks.air;
    	ritualLocate[25][2][2][1]=Blocks.air;
    	ritualLocate[25][2][2][2]=Blocks.air;

    	ritualLocate[26][0][0][0]=Blocks.air;
    	ritualLocate[26][0][0][1]=Blocks.air;
    	ritualLocate[26][0][0][2]=Blocks.air;
    	ritualLocate[26][1][0][0]=Blocks.air;
    	ritualLocate[26][1][0][1]=Blocks.air;
    	ritualLocate[26][1][0][2]=Blocks.air;
    	ritualLocate[26][2][0][0]=Blocks.air;
    	ritualLocate[26][2][0][1]=Blocks.air;
    	ritualLocate[26][2][0][2]=Blocks.air;
    	ritualLocate[26][0][1][0]=Blocks.air;
    	ritualLocate[26][0][1][1]=Blocks.air;
    	ritualLocate[26][0][1][2]=Blocks.air;
    	ritualLocate[26][1][1][0]=Blocks.air;
    	ritualLocate[26][1][1][1]=eaMain.ritualGlassTier4;
    	ritualLocate[26][1][1][2]=Blocks.air;
    	ritualLocate[26][2][1][0]=Blocks.air;
    	ritualLocate[26][2][1][1]=Blocks.air;
    	ritualLocate[26][2][1][2]=Blocks.air;
    	ritualLocate[26][0][2][0]=Blocks.air;
    	ritualLocate[26][0][2][1]=Blocks.air;
    	ritualLocate[26][0][2][2]=Blocks.air;
    	ritualLocate[26][1][2][0]=Blocks.air;
    	ritualLocate[26][1][2][1]=Blocks.air;
    	ritualLocate[26][1][2][2]=Blocks.air;
    	ritualLocate[26][2][2][0]=Blocks.air;
    	ritualLocate[26][2][2][1]=Blocks.air;
    	ritualLocate[26][2][2][2]=Blocks.air;

    	return ritualLocate[n][x][y][z];
    }
}
/*
ritualLocate[0][-1][-1][-1]=0;
ritualLocate[0][-1][-1][0]=0;
ritualLocate[0][-1][-1][1]=0;
ritualLocate[0][0][-1][-1]=0;
ritualLocate[0][0][-1][0]=0;
ritualLocate[0][0][-1][1]=0;
ritualLocate[0][1][-1][-1]=0;
ritualLocate[0][-1][0]=0;
ritualLocate[0][1][-1][1]=0;
ritualLocate[0][-1][0][-1]=0;
ritualLocate[0][-1][0][0]=0;
ritualLocate[0][-1][0][1]=0;
ritualLocate[0][0][0][-1]=0;
ritualLocate[0][0][0][0]=0;
ritualLocate[0][0][0][1]=0;
ritualLocate[0][1][0][-1]=0;
ritualLocate[0][1][0][0]=0;
ritualLocate[0][1][0][1]=0;
ritualLocate[0][-1][1][-1]=0;
ritualLocate[0][-1][1][0]=0;
ritualLocate[0][-1][1][1]=0;
ritualLocate[0][0][1][-1]=0;
ritualLocate[0][0][1][0]=0;
ritualLocate[0][0][1][1]=0;
ritualLocate[0][1][1][-1]=0;
ritualLocate[0][1][1][0]=0;
ritualLocate[0][1][1][1]=0;
*/
