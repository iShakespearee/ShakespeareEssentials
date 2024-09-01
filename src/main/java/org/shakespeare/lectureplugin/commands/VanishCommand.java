package org.shakespeare.lectureplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class VanishCommand implements CommandExecutor, Listener {

    private List<UUID> vanished = new ArrayList<>();


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (vanished.contains(player.getUniqueId())) { // They are vanished
                vanished.remove(player.getUniqueId());
                for (Player target : Bukkit.getOnlinePlayers()) {
                    target.showPlayer(player);
                }
                player.sendTitle("", "§c§lDISABLED VANISH", 20, 10, 20);
            } else { // They are not vanished
                vanished.add(player.getUniqueId());
                for (Player target : Bukkit.getOnlinePlayers()) {
                    target.hidePlayer(player);
                }
                player.sendTitle("", "§a§lENABLED VANISH", 20, 10, 20);
            }
            return true;
        }
        return false;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        if (vanished.contains(event.getPlayer().getUniqueId())) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("§c§lYOU CANNOT SPEAK WHILST IN VANISH!");
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        if (vanished.contains(event.getPlayer().getUniqueId())) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("§c§lYOU CANNOT BREAK BLOCKS WHILST IN VANISH!");
        }
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        if (vanished.contains(e.getPlayer().getUniqueId())) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("§c§lYOU CANNOT PLACE BLOCKS WHILST IN VANISH!");
        }
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) { // Check if the damager is a player
            Player player = (Player) event.getDamager();
            if (vanished.contains(player.getUniqueId())) {
                event.setCancelled(true); // Cancel the event
                player.sendMessage("§c§lYOU CANNOT HIT ENTITIES WHILST IN VANISH!");
            }
        }
    }
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player player = (Player) e.getEntity();
            if (vanished.contains(player.getUniqueId()) && e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                e.setCancelled(true);
                player.sendMessage("§e§lYOU CANNOT TAKE FALL DAMAGE WHILST IN VANISH!");
            }
        }
    }
}
