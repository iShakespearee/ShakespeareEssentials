package org.shakespeare.lectureplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length == 0) {
                player.sendMessage("§6§l§n/GM INFORMATION: \n§e/gmc (switches to creative mode!\n§e/gms §e(switches to survival mode!)\n§e/gmsp §e(switches to spectator mode!)\n§e/gma §e(switches to adventure mode!");
            } else if (args.length != 0) {
                player.sendMessage("§c§lINCORRECT USAGE! §cRUN: /gm for more information!");
            }


        }

        return false;
    }
}
