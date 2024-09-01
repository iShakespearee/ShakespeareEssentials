package org.shakespeare.lectureplugin.commands;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.ArrayList;
import java.util.List;

public class YemenBannerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            ItemStack banner = new ItemStack(Material.WHITE_BANNER);
            BannerMeta bannerMeta = (BannerMeta) banner.getItemMeta();

            List<Pattern> patterns = new ArrayList<>();
            patterns.add(new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT));
            patterns.add(new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER));
            patterns.add(new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT));

            bannerMeta.setPatterns(patterns);
            banner.setItemMeta(bannerMeta);
            player.getInventory().addItem(banner);
            player.sendTitle("", "§c§lY§f§lE§f§lM§f§lE§0§lN", 20, 4, 20);

        }

        return false;
    }
}
