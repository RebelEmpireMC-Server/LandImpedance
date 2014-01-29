package com.rebelempiremc.landimpedance.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LandCommand implements CommandExecutor{
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player player = (Player)sender;
        if ((cmd.getName().equalsIgnoreCase("landimpedence")) || ((cmd.getName().equalsIgnoreCase("li"))))
        {
            if (args.length == 0)
            {
                player.sendMessage(ChatColor.BLUE + "-------" + ChatColor.AQUA + "Land Impedence" + ChatColor.BLUE + "-------");
                player.sendMessage(ChatColor.YELLOW + "Website:" + ChatColor.RED + " http://goo.gl/WBv0sZ");
                player.sendMessage(ChatColor.YELLOW + "Authors:" + ChatColor.RED + " Axe2760 & 97WaterPolo");
                player.sendMessage(ChatColor.YELLOW + "Version: " + ChatColor.RED + "1.0");
            }
            if (!(args.length == 0))
            {
                if ((args[0].equalsIgnoreCase("command")) || (args[0].equalsIgnoreCase("list")))
                {
                    if (sender.hasPermission("li.command.list"))
                    {
                        player.sendMessage(ChatColor.BLUE + "-------" + ChatColor.AQUA + "Land Impedence" + ChatColor.BLUE + "-------");
                        player.sendMessage(ChatColor.GOLD + "/li list" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Opens up a list of commands.");
                        player.sendMessage(ChatColor.GOLD + "/li add <player>" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Adds a player to your area.");
                        player.sendMessage(ChatColor.GOLD + "/li remove <player>" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Removes a player to your area.");
                        player.sendMessage(ChatColor.GOLD + "/li owner <player>" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Adds an owner to your region.");
                        
                        if (sender.hasPermission("li.admin.list"))
                        {
                            player.sendMessage(ChatColor.DARK_RED + "-------" + ChatColor.RED + "Land Impedence Admin" + ChatColor.DARK_RED + "-------");
                            player.sendMessage(ChatColor.GREEN + "/li reload" + ChatColor.BLACK + " - " + ChatColor.GOLD + "Opens up a list of commands.");
                            player.sendMessage(ChatColor.GREEN + "/li forceadd <player>" + ChatColor.BLACK + " - " + ChatColor.GOLD + "Adds a player to any area.");
                            player.sendMessage(ChatColor.GREEN + "/li forceremove <player>" + ChatColor.BLACK + " - " + ChatColor.GOLD + "Removes a player in any area.");
                            player.sendMessage(ChatColor.GREEN + "/li addowner <player>" + ChatColor.BLACK + " - " + ChatColor.GOLD + "Adds an owner to any area.");
                            player.sendMessage(ChatColor.GREEN + "/li remowner <player>" + ChatColor.BLACK + " - " + ChatColor.GOLD + "Removes an owner to any area.");
                            player.sendMessage(ChatColor.GREEN+ "/li reload" + ChatColor.BLACK + " - " + ChatColor.GOLD + "Reloads configuration.");
                        }
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("add")))
                {
                    if (sender.hasPermission("li.command.add"))
                    {
                        //TODO add code to add player to an area [PlayerCommand]
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("remove")))
                {
                    if (sender.hasPermission("li.command.remove"))
                    {
                        //TODO add code to remove player from area [Player Command]                        
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("owner")))
                {
                    if (sender.hasPermission("li.command.owner"))
                    {
                        //TODO add co-owner to area [Player Command]                  
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Admin Commands~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                if ((args[0].equalsIgnoreCase("reload")))
                {
                    if (sender.hasPermission("li.admin.reload"))
                    {
                        //TODO Allows you to reload the configuartion [Admin Command]       
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("forceadd")))
                {
                    if (sender.hasPermission("li.admin.forceadd"))
                    {
                        //TODO force add a person to an area [Admin Command]     
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("forceremove")) || ((args[0].equalsIgnoreCase("forcerem"))))
                {
                    if (sender.hasPermission("li.admin.forceremove"))
                    {
                        //TODO Force remove a player from an area [Admin Command]
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("addowner")))
                {
                    if (sender.hasPermission("li.admin.addowner"))
                    {
                        //TODO add an owner to an area [Admin Command]            
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("remowner")))
                {
                    if (sender.hasPermission("li.admin.remowner"))
                    {
                        //TODO remove an owner to an area [Admin Command]            
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                
                
                
                
                
                
                
                
                
                
                
            }
        }

        return false;
    }
}
