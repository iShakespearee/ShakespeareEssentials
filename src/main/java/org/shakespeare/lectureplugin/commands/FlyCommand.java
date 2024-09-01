package org.shakespeare.lectureplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            // Check if the player can currently fly
            if (player.getAllowFlight()) {
                // If the player can fly, disable flight
                player.setAllowFlight(false);
                player.setFlying(false);
                player.sendTitle(
                        ChatColor.WHITE + "",
                        "§4§lDISABLED FLIGHT!",
                        20, 28, 20);
            } else {
                // If the player cannot fly, enable flight
                player.setAllowFlight(true);
                player.setFlying(true);
                player.sendTitle(
                        ChatColor.WHITE + "",
                        "§e§lENABLED FLIGHT!",
                        20, 28, 20);
            }

            return true;
        }

        return false;
    }
}