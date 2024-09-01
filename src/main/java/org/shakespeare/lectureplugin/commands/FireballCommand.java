package org.shakespeare.lectureplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;

public class FireballCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.launchProjectile(Fireball.class, player.getLocation().getDirection());
            player.sendTitle("", "§c§lKABOOOOM!", 20, 10, 20);

        }


        return false;
    }
}
