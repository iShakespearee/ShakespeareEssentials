package org.shakespeare.lectureplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectResistanceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 1200, 2, false, false));
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1200, 2, false, false));

            player.sendTitle(
                    ChatColor.WHITE + "",
                    "§5§lRESISTANCES GIVEN!",
                    20, 28, 20);

            return true;
        }
        return false;

    }

}