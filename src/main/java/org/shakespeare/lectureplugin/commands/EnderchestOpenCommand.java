package org.shakespeare.lectureplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderchestOpenCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (player.hasPermission("myessentials.ecopen")) {
                player.sendMessage("§c§lYOU DO NOT HAVE PERMISSIONS!");

            } else {
                player.sendMessage("§c§lYOU DO NOT HAVE PERMISSIONS!");
            }

            if (args.length == 1) {
                String targetName = args[0];
                Player target = Bukkit.getPlayer(targetName);

                if (target != null && target.isOnline()) {
                    player.openInventory(target.getEnderChest());
                    player.sendMessage("§e§lYOU ARE NOW VIEWING " + targetName + "'s ENDERCHEST! ");
                } else {
                    player.sendMessage("§c§lTHIS PLAYER DOES NOT EXIST!");
                }

                if (args.length != 1)
                    player.sendMessage("§c§lINCORRECT USAGE! §c/ecopen (username)!");

            }


        }

        return false;
    }
}