package org.shakespeare.lectureplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectClearallCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            // Clear all potion effects in 1 command if ever needed. Better to just manually clear though

            for (PotionEffect effect :player.getActivePotionEffects ()){
                player.removePotionEffect(effect.getType());
            }

            player.sendTitle(
                    ChatColor.WHITE + "",
                    "§c§lALL EFFECTS CLEARED!",
                    20, 28, 20);


            return true;
        }


        return false;
    }
}
