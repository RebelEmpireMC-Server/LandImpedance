package com.rebelempiremc.landimpedance.flags;

import com.rebelempiremc.landimpedance.events.ProtectionPlayerEnterEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class MessageFlag extends Flag{
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
