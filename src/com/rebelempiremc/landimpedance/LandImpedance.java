package com.rebelempiremc.landimpedance;

import com.rebelempiremc.landimpedance.commands.LandCommand;
import com.rebelempiremc.landimpedance.commands.LandImpedanceCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class LandImpedance extends JavaPlugin {
    public void onEnable(){
        this.getCommand("landimpedance").setExecutor(new LandImpedanceCommand());
        this.getCommand("land").setExecutor(new LandCommand());
    }
}
