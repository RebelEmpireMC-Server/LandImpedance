package com.rebelempiremc.landimpedance.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LandImpedanceCommand implements CommandExecutor{
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player player = (Player)sender;
        if ((cmd.getName().equalsIgnoreCase("landimpedence")))
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
                        player.sendMessage(ChatColor.GOLD + "/li reload" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Reloads configuration.");
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("add")) || (args[0].equalsIgnoreCase("a")))
                {
                    if (sender.hasPermission("li.command.add"))
                    {
                        player.sendMessage("Test");
                    }
                    else
                    {
                        player.sendMessage("You do not have permission to use that command!");
                    }
                }
                if ((args[0].equalsIgnoreCase("remove")) || (args[0].equalsIgnoreCase("r")))
                {
                    if (sender.hasPermission("li.command.remove"))
                    {
                        player.sendMessage("Test2");
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
