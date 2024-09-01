package org.shakespeare.lectureplugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class WizardBookCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (strings.length > 0) {
                String bookType = strings[0].toLowerCase();

                switch (bookType) {
                    case "wizard":
                        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
                        BookMeta bookMeta = (BookMeta) book.getItemMeta();
                        bookMeta.setTitle("§b§lTHE BOOK OF WIZARDS");
                        bookMeta.setAuthor("§3Shakespeare");
                        bookMeta.addPage("§0Welcome to the book of the wizards!" +
                                "\n\n§0You may be wondering why you are here, but don't!" +
                                "\n§0To make it past the first world, you must conquer the beast!" +
                                "\n§0The beast... Has slain many of us good folk" +
                                "\n§0But we believe in you, to be the one... The one to lead us all!" +
                                "\n§0If you kill this beast, we will crown you as the Witcher!" +
                                "\n§0Now go! Before the sun sets, and take haste my fellow!");

                        List<String> wizardBookLore = new ArrayList<>();
                        wizardBookLore.add("§e§lFIND THIS BOOK IN THE DEPTHS");
                        wizardBookLore.add("§e§lAND CONQUER THE BEAST OF THE LAND!");
                        bookMeta.setLore(wizardBookLore);

                        book.setItemMeta(bookMeta);
                        player.getInventory().addItem(book);

                        player.sendTitle("", "§e§lRECEIVED WIZARD's BOOK!", 20, 5, 20);

                        break;
                    case "sorcerer":
                        ItemStack sBook = new ItemStack(Material.WRITTEN_BOOK);
                        BookMeta sBookMeta = (BookMeta) sBook.getItemMeta();
                        sBookMeta.setTitle("§e§lBOOK OF SORCERERS");
                        sBookMeta.setAuthor("§6Shakespeare");
                        sBookMeta.addPage("§0Welcome to the Book of Sorcerers!" +
                                "\n§0You may be curious about your presence here, but let your curiosity rest!" +
                                "\n§0To advance beyond the first realm, you must defeat the Archmage!" +
                                "\n§0But we have faith in you, to be the one... The one to rise above all!" +
                                "\n§0If you vanquish the Archmage, you shall be honored as the Supreme Sorcerer!" +
                                "\n§0Now go! Time is fleeting, and may your magic guide you, brave one!");

                        List<String> sBookLore = new ArrayList<>();
                        sBookLore.add("§e§lTHE GUIDE TO THE ARCHMAGE");
                        sBookLore.add("§e§lO' BRAVE ONE!");
                        sBookMeta.setLore(sBookLore);

                        sBook.setItemMeta(sBookMeta);
                        player.getInventory().addItem(sBook);

                        player.sendTitle("", "§6§lRECEIVED SORCERER's BOOK!", 20, 5, 20);
                        break;

                    case "witcher":
                        ItemStack witcher = new ItemStack(Material.WRITTEN_BOOK);
                        BookMeta witcherMeta = (BookMeta) witcher.getItemMeta();
                        witcherMeta.setTitle("§lTHE WITCHER OF BLAVIKEN");
                        witcherMeta.setAuthor("§4Shakespeare");
                        witcherMeta.addPage("§0Welcome to the Witcher of Blaviken's quest!" +
                                "\n§0To prove your worth, you must defeat the fiercest monsters!" +
                                "\n§0These beasts have claimed many lives, but we believe in you!" +
                                "\n§0If you succeed, you will be honored as a true hero!" +
                                "\n§0Now go, and may your courage guide you!");

                        List<String> witcherLore = new ArrayList<>();
                        witcherLore.add("§c§lTHE QUEST OF THE WITCHER");
                        witcherLore.add("§c§lTHE BRAVE MUTANT HUNTER!");
                        witcherMeta.setLore(witcherLore);

                        witcher.setItemMeta(witcherMeta);
                        player.getInventory().addItem(witcher);

                        player.sendTitle("", "§e§lRECEIVED WITCHER's BOOK!", 20, 5, 20);

                        break;


            }



            }

        }


        return false;
    }
}
