package org.shakespeare.lectureplugin.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DragonBreathCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length == 0) {
                // Connecting the /dragonbreath command to the spawnParticles!
                player.spawnParticle(Particle.LAVA, player.getLocation(), 20);
                player.sendTitle("",
                        "§6§lBREATH OF THE DRAGON!", 20, 10, 20);

            } else if (args.length != 0) {
                player.sendMessage("§c§lINCORRECT USAGE! §c/dragonbreath");
            }


        }


        return false;
    }
}
