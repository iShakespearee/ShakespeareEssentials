package org.shakespeare.lectureplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length == 0) {
                player.setHealth(0);
                player.sendMessage("§e§lKILLED YOU! §e :(");

            } else if (args.length != 0) {
                player.sendMessage("§c§lINCORRECT USAGE! §cRUN: /suicide");

            }


        }


        return false;
    }
}