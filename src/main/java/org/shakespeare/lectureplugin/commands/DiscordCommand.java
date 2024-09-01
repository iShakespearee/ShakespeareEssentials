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
            if (args.length == 0) {

                /* YOU CAN MAKE CASES AND BREAKS FOR OTHER SERVERS
                EXAMPLE:
                /discord <learnspigot/freshsmp/hypixel> etc..!!!
                 */

            player.sendMessage("§ediscord.gg/learnspigot");

            } else if (args.length != 0) {
                player.sendMessage("c§§lINVALID USAGE! §c/discord");
            }

        }
            return false;
        }
    }