package org.shakespeare.lectureplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdventureCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.setGameMode(GameMode.ADVENTURE);
            player.sendTitle(
                    ChatColor.WHITE + "",
                    "§7§lENABLED ADVENTURE MODE!",
                    20, 28, 20);

            return true;
        }
        return false;
    }

}