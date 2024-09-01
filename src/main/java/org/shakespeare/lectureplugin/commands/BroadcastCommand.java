package org.shakespeare.lectureplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender.hasPermission("myessentials.broadcast")) {
            commandSender.sendMessage("");

        } else {
            commandSender.sendMessage("§c§lYOU DO NOT HAVE PERMISSION TO RUN THIS COMMAND!");
            return true;
        }

            if (args.length > 0) {
                String message = String.join(" ", args);

                Bukkit.broadcastMessage("§c§l[SERVER BROADCAST]: §f" + message);
            } else {
                commandSender.sendMessage("§4§lINCORRECT USAGE!");
            }


            return false;
        }
    }
