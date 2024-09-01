package org.shakespeare.lectureplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishAboutCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length == 0) {
                player.sendMessage("§6§lABOUT VANISH:\n§e§lUSAGE: §e/vanish §e§lOR §e/v\n§eVanish is a simple and easy command that\n§eis meant for staff members to hide\n§efrom cheaters or possible hackers,\nand eventually catch them breaking rules!\n§c§lCURRENT VERSION: V1.2\n§c§lMADE BY §4§niShakespeare\n§c§lCONTACT: §c_ishakespeare §c§lON DISCORD FOR FURTHER QUERIES!");
            } else if (args.length != 0) {
                player.sendMessage("§e§lINCORRECT USAGE! §c/vanishabout");
            }


            return false;
        }
        return false;
    }
}
