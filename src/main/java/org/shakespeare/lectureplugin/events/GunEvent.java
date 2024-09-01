package org.shakespeare.lectureplugin.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class GunEvent implements Listener {

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e) {

        Player player = e.getPlayer();

        if (e.getHand().equals(EquipmentSlot.HAND)) {
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || (e.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
            /* Making sure that the item in main hand is not equal to null, and that the item in main hand is
            A GOLDEN_HOE!*/
                if (player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().getType().equals(Material.GOLDEN_HOE)) {
                    player.launchProjectile(Fireball.class, player.getLocation().getDirection());

                    player.sendTitle("", "§d§lBRUHBOOOOM'D!", 20, 12, 20);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_BREAK,  3.0F, 0.45F);
                }
            }
        }
    }
}
