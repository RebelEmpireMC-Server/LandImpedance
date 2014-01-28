package com.rebelempiremc.landimpedance.protection;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ProtectionStore {
    public volatile ConcurrentHashMap<String, List<PlayerProtection>> protectionMap = new ConcurrentHashMap<String, List<PlayerProtection>>();

    public PlayerProtection getInProtection(Player player){
        return null; //TODO: do this
    }

    public List<PlayerProtection> getProtections(Player player){
        if (protectionMap.containsKey(player.getName())){
            return protectionMap.get(player.getName());
        }
        return null;
    }


}
