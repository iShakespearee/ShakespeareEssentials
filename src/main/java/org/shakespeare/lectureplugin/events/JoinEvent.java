package org.shakespeare.lectureplugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().sendTitle("", "§e§lWELCOME TO THE SERVER!", 20, 12, 20);
    }

}
