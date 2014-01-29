package com.rebelempiremc.landimpedance.protection;


import com.rebelempiremc.landimpedance.api.BlockLocation;
import com.rebelempiremc.landimpedance.api.Cuboid;
import com.rebelempiremc.landimpedance.flags.Flag;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class PlayerProtection {

    private String owner;
    private Cuboid cuboid;
    private List<Flag> flags;

    public PlayerProtection(String owner, BlockLocation pos1, BlockLocation pos2){
        this.owner = owner;
        cuboid = new Cuboid(pos1,pos2);
        flags = new ArrayList<Flag>();
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String string){
        this.owner = string;
    }

    public boolean isInProtection(BlockLocation location){
        boolean x = cuboid.getMin().getX() < location.getX() && location.getX() < cuboid.getMax().getX();
        boolean y = cuboid.getMin().getY() < location.getY() && location.getY() < cuboid.getMax().getY();
        boolean z = cuboid.getMin().getZ() < location.getZ() && location.getZ() < cuboid.getMax().getZ();

        return x && y && z;
    }

    public boolean isFlag(Flag flag){
        return flags.contains(flag);
    }

    public List<Flag> getFlags(){
        return flags;
    }

    public String serialize(){
        //TODO: finish
    }
}
