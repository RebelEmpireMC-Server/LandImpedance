package com.rebelempiremc.landimpedance.database;

import com.rebelempiremc.landimpedance.LandImpedance;

public class AsyncDatabaseUpdater implements Runnable{
    public void run(){
        synchronized(this){
            LandImpedance.database.writeToMySQL(LandImpedance.getProtectionStore().protectionMap);
        }
    }
}
