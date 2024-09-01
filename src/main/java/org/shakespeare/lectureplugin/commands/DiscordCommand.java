package org.shakespeare.lectureplugin.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

                /* YOU CAN MAKE CASES AND BREAKS FOR OTHER SERVERS
                EXAMPLE:
                /discord <learnspigot/freshsmp/hypixel> etc..!!!
                 */

            player.sendMessage("§e§lCLICK TO JOIN OUR DISCORD SERVER: §ediscord.gg/learnspigot");


        }
            return false;
        }
    }