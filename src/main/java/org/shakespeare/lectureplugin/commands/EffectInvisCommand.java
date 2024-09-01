package org.shakespeare.lectureplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectInvisCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1200, 1, false, false, true));

            player.sendTitle(
                    ChatColor.WHITE + "",
                    "§4§lYOU ARE INVISIBLE!",
                    20, 28, 20);

            return true;
        }
        return false;

    }

}