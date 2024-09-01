package org.shakespeare.lectureplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LevelsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.giveExpLevels(10);
            player.sendTitle(
                    ChatColor.WHITE + "",
                    "§d§l+10 LEVELS!",
                    20, 28, 20);


            return true;
        }



        return false;
    }
}
