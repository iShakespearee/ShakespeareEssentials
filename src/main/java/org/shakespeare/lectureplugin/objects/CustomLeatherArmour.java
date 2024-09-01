package org.shakespeare.lectureplugin.objects;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class CustomLeatherArmour implements Listener {

    @EventHandler
    public void onEgg(PlayerRespawnEvent e) {

        // Setting the item meta, colors, material (CUSTOMISE TO YOUR LIKING)

        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmetMeta.setColor(Color.fromRGB(255, 30, 158));
        helmetMeta.setDisplayName("§d§lHELMET!");
        helmet.setItemMeta(helmetMeta);

        e.getPlayer().getInventory().addItem(helmet); // Adding the item to inv

        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestplateMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        chestplateMeta.setColor(Color.fromRGB(255, 23, 159));
        chestplateMeta.setDisplayName("§d§lBRA!");
        chestplate.setItemMeta(chestplateMeta);

        e.getPlayer().getInventory().addItem(chestplate); // Adding the item to inv

        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta leggingstMeta = (LeatherArmorMeta) leggings.getItemMeta();
        leggingstMeta.setColor(Color.fromRGB(253, 26, 139));
        leggingstMeta.setDisplayName("§d§lPANTIES!");
        leggings.setItemMeta(leggingstMeta);

        e.getPlayer().getInventory().addItem(leggings); // Adding the item to inv

        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();
        bootsMeta.setColor(Color.fromRGB(245, 26, 193));
        bootsMeta.setDisplayName("§d§lBOOTIES!");
        boots.setItemMeta(bootsMeta);

        e.getPlayer().getInventory().addItem(boots); // Adding the item to inv

    }

}
