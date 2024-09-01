package org.shakespeare.lectureplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderchestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            // If the command is used with arguments, show an error message and do not open the Ender Chest
            if (args.length != 0) {
                player.sendMessage("§c§lINCORRECT USAGE! §4Usage: /ec");
            } else {
                // Open the Ender Chest if no arguments are passed
                player.openInventory(player.getEnderChest());
                player.sendMessage("§e§lOPENED YOUR ENDER CHEST!");
            }

            return true;
        }
        return false;
    }
}

