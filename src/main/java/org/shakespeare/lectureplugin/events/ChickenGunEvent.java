package org.shakespeare.lectureplugin.events;

import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class ChickenGunEvent implements Listener {

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e) {

        Player player = e.getPlayer();

        if (e.getHand().equals(EquipmentSlot.HAND)) {
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || (e.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {

                if (player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_SHOVEL)) {
                    player.launchProjectile(Egg.class, player.getLocation().getDirection());

                    player.sendTitle("", "§9§lC§b§lH§3§lI§d§lC§4§lK§c§lE§e§lN§1§l'D", 20, 12, 20);
                }
            }
        }
    }
    @EventHandler
    public void onProjectileHit(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Egg) {
            // Spawns a chicken at the location where the egg hits
            event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.CHICKEN);
        }
    }
}
