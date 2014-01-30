package com.rebelempiremc.landimpedance;

import com.rebelempiremc.landimpedance.commands.LandCommand;
import com.rebelempiremc.landimpedance.commands.LandImpedanceCommand;
import com.rebelempiremc.landimpedance.database.AsyncDatabaseUpdater;
import com.rebelempiremc.landimpedance.database.MySQLDatabase;
import com.rebelempiremc.landimpedance.protection.ProtectionStore;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class LandImpedance extends JavaPlugin {
    public static MySQLDatabase database;
    private static ProtectionStore protectionStore;
    private int databaseTask = 0;


    public void onEnable(){
        //database = new MySQLDatabase();
        protectionStore = new ProtectionStore();

        this.getCommand("landimpedance").setExecutor(new LandImpedanceCommand());
        this.getCommand("li").setExecutor(new LandImpedanceCommand());
        this.getCommand("land").setExecutor(new LandCommand());

        //runnables
        databaseTask = Bukkit.getScheduler().scheduleAsyncRepeatingTask(this,new AsyncDatabaseUpdater(),10L,2400L);
    }

    public static ProtectionStore getProtectionStore(){
        return protectionStore;
    }
}
