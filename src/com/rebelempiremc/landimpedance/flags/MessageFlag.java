package com.rebelempiremc.landimpedance.flags;

import org.bukkit.entity.Player;

public class MessageFlag extends Flag{
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void execute(Player player){
        player.sendMessage(message);
    }
}
