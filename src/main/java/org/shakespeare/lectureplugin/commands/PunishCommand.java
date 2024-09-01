package org.shakespeare.lectureplugin.commands;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Calendar;

public class PunishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        // Usage: /punish <playername> <kick/ban/tempban> [duration (for tempban)]

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length >= 2) {

                Player target = Bukkit.getPlayer(args[0]);

                if (target != null) {
                    String punishmentType = args[1].toLowerCase();

                    switch (punishmentType) {
                        case "kick":
                            target.kickPlayer("§c§lYOU HAVE BEEN KICKED!");
                            break;

                        case "ban":
                            target.kickPlayer("§c§lYOU HAVE BEEN BANNED!");
                            Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), "§c§lFOR BEING A LUNATIC!\nFeel free to appeal on our forums!\n§f§lMACBETH.ORG", null, null);
                            break;

                        case "tempban":
                            if (args.length == 3) {
                                try {
                                    int duration = Integer.parseInt(args[2]);
                                    Calendar cal = Calendar.getInstance();
                                    cal.add(Calendar.HOUR_OF_DAY, duration);

                                    target.kickPlayer("§c§lYOU HAVE BEEN BANNED FOR " + duration + " HOURS!");
                                    Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), "§c§lFOR BEING A LUNATIC!\nFeel free to appeal on our forums!\n§f§lMACBETH.ORG", cal.getTime(), null);

                                } catch (NumberFormatException e) {
                                    player.sendMessage("§c§lINVALID DURATION! §cPlease use a valid number for hours.");
                                    return false;
                                }
                            } else {
                                player.sendMessage("§c§lINVALID USAGE! USE: §c/punish <username> tempban <duration in hours>");
                                return false;
                            }
                            break;

                        default:
                            player.sendMessage("§c§lYOU DID NOT SPECIFY A VALID PUNISHMENT TYPE!");
                            return false;
                    }
                } else {
                    player.sendMessage("§c§lTHIS PLAYER IS NOT ONLINE!");
                    return false;
                }

            } else {
                player.sendMessage("§c§lINVALID USAGE! USE: §c/punish <username> <punishment type>");
                return false;
            }

        }

        return false;
    }
}
