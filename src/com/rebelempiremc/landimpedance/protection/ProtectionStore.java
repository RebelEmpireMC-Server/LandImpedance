package com.rebelempiremc.landimpedance.protection;

import com.rebelempiremc.landimpedance.api.BlockLocation;
import com.rebelempiremc.landimpedance.api.Quadrant;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProtectionStore {
    public volatile ConcurrentHashMap<Quadrant, List<PlayerProtection>> protectionMap = new ConcurrentHashMap<Quadrant, List<PlayerProtection>>();
    private HashMap<String,PlayerProtection> protectionCache = new HashMap<String,PlayerProtection>();

    public PlayerProtection getInProtection(Player player){
        if (!protectionCache.containsKey(player.getName())){
            this.searchForInProtection(player);
        }
        else{
            //check if protection in cache is still valid
            PlayerProtection cachedProtection = protectionCache.get(player.getName());
            if (cachedProtection.isInProtection(BlockLocation.fromBukkitLocation(player.getLocation()))){
                return cachedProtection;
            }
            else{
                this.searchForInProtection(player);
            }
        }
        return null;
    }

    public List<PlayerProtection> getProtections(Player player){
        List<PlayerProtection> protections = new ArrayList<PlayerProtection>();
        List<PlayerProtection> quadrantProtections = protectionMap.get(BlockLocation.fromBukkitLocation(player.getLocation()).getQuadrant());

        for (PlayerProtection protection : quadrantProtections){
            if (protection.getOwner().equalsIgnoreCase(player.getName())) protections.add(protection);
        }
        return protections;
    }

    public PlayerProtection searchForInProtection(Player player){
        Quadrant quadrant = BlockLocation.fromBukkitLocation(player.getLocation()).getQuadrant();
        List<PlayerProtection> protections = protectionMap.get(quadrant);
        for (PlayerProtection protection : protections){
            if (protection.isInProtection(BlockLocation.fromBukkitLocation(player.getLocation()))) {
                protectionCache.put(player.getName(),protection);
                return protection;
            }
        }
        return null;
    }

}
