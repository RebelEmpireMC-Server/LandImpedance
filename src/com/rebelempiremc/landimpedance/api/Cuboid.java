package com.rebelempiremc.landimpedance.api;

public class Cuboid {

    private BlockLocation min;
    private BlockLocation max;

    public Cuboid(BlockLocation pos1, BlockLocation pos2){
        min = new BlockLocation(Math.min(pos1.getX(), pos2.getX()), Math.min(pos1.getY(), pos2.getY()), Math.min(pos1.getZ(), pos2.getZ()));
        max = new BlockLocation(Math.max(pos1.getX(),pos2.getX()), Math.max(pos1.getY(),pos2.getY()),Math.max(pos1.getZ(),pos2.getZ()));
    }


    public BlockLocation getMin(){
        return min;
    }

    public BlockLocation getMax(){
        return max;
    }

    public void setMin(BlockLocation min){
        this.min = min;
    }

    public void setMax(BlockLocation max){
        this.max = max;
    }
}
