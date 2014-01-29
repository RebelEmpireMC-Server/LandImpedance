package com.rebelempiremc.landimpedance.api;

import org.bukkit.Location;

public class BlockLocation {

    private int x;
    private int y;
    private int z;

    public BlockLocation(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setZ(int z){
        this.z = z;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    public String serialize(){
        return String.valueOf(x) + "," + String.valueOf(y) + "," + String.valueOf(z);
    }

    public static BlockLocation deserialize(String input){
        String[] array = input.split(",");
        try{
            return new BlockLocation(Integer.valueOf(array[0]), Integer.valueOf(array[1]), Integer.valueOf(array[2]));
        }catch(Exception e){
            //the array probably isn't big enough, or it's just invalid or something like that
            e.printStackTrace();
        }
        return null;
    }

    public static BlockLocation fromBukkitLocation(Location location){
        return new BlockLocation(location.getBlockX(), location.getBlockY(), location.getBlockZ());
    }

    public Quadrant getQuadrant(){
        if (x >= 0 && y >= 0) return Quadrant.Q1; //both are positive
        else if (x <= 0 && y >= 0) return Quadrant.Q2; //x negative, y postive
        else if (x <= 0 && y <= 0) return Quadrant.Q3;
        else if (x >= 0 && y <= 0) return Quadrant.Q4; //x positive, y negative
        return Quadrant.Q4; //should technically never happen.... will leave this as Q4 for convenience
    }
}
