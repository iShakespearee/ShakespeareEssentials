package org.shakespeare.lectureplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AlertCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (!commandSender.hasPermission("myessentials.alert")) {
            commandSender.sendMessage("§c§lYOU DO NOT HAVE PERMISSION TO RUN THIS COMMAND!");
            return true;
        }

        if (args.length > 0) {
            String title = String.join(" ", args);

            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendTitle("§c§lALERT!", title, 20, 60, 20);
            }

            commandSender.sendMessage("§e§lALERT SENT TO ALL PLAYERS!");
        } else {
            commandSender.sendMessage("§c§lINCORRECT USAGE!");
        }

        return true;
    }
}
