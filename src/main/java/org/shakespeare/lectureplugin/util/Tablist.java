package org.shakespeare.lectureplugin.util;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Tablist implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.getPlayer().setPlayerListHeaderFooter(
                " §b§l§khkhkhk §3§lWELCOME TO SHAKESPEARE'S DEVSERVER! §b§l§khkhkhk",
                "§b§lServer Store: §9§lMACBETH.ORG\n§6§lJoin our discord! §d§l(/discord)\n §b§lEnjoy your stay!"
        );
    }
}
