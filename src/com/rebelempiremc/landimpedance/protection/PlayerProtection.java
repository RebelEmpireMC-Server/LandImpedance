package com.rebelempiremc.landimpedance.protection;


import com.rebelempiremc.landimpedance.api.BlockLocation;
import com.rebelempiremc.landimpedance.api.Cuboid;
import com.rebelempiremc.landimpedance.flags.Flag;
import com.rebelempiremc.landimpedance.flags.FlagList;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class PlayerProtection {

    private String owner;
    private Cuboid cuboid;
    private FlagList flags;

    public PlayerProtection(String owner, BlockLocation pos1, BlockLocation pos2){
        this.owner = owner;
        cuboid = new Cuboid(pos1,pos2);
        flags = new FlagList();
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

    public boolean isFlag(Class<? extends Flag> flag){
        return flags.isFlag(flag);
    }

    public List<Flag> getFlags(){
        return flags.getFlags();
    }

    public FlagList getFlagList(){
        return flags;
    }

    public String serialize(){
        //TODO: finish
        return null;
    }

}
