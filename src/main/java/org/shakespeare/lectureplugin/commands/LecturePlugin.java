package org.shakespeare.lectureplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.shakespeare.lectureplugin.events.ChickenGunEvent;
import org.shakespeare.lectureplugin.events.GunEvent;
import org.shakespeare.lectureplugin.events.JoinEvent;
import org.shakespeare.lectureplugin.objects.CustomLeatherArmour;
import org.shakespeare.lectureplugin.util.Tablist;

public final class LecturePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
       VanishCommand vanishCommand = new VanishCommand();

        // All different events

        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new CustomLeatherArmour(), this);
        getServer().getPluginManager().registerEvents(new GunEvent(), this);
        getServer().getPluginManager().registerEvents(new ChickenGunEvent(), this);
        getServer().getPluginManager().registerEvents(new Tablist(), this);
        getServer().getPluginManager().registerEvents(vanishCommand, this);

        // <33333

        getCommand("palestine").setExecutor(new PalestineBannerCommand());
        getCommand("yemen").setExecutor(new YemenBannerCommand());

        // IDEK
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("dragonbreath").setExecutor(new DragonBreathCommand());
        getCommand("kaboom").setExecutor(new FireballCommand());
        getCommand("bababoi").setExecutor(new FireballCommand());
        getCommand("book").setExecutor(new WizardBookCommand());


        // All GameMode commands!

        getCommand("gmc").setExecutor(new CreativeCommand());
        getCommand("gms").setExecutor(new SurvivalCommand());
        getCommand("gma").setExecutor(new AdventureCommand());
        getCommand("gmsp").setExecutor(new SpectatorCommand());
        getCommand("gm").setExecutor(new GamemodeCommand());

        // All basic essential commands

        getCommand("heal").setExecutor(new HealCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("levelup").setExecutor(new LevelsCommand());
        getCommand("broadcast").setExecutor(new BroadcastCommand());
        getCommand("serverbc").setExecutor(new BroadcastCommand());
        getCommand("alert").setExecutor(new AlertCommand());
        getCommand("alertplayers").setExecutor(new AlertCommand());
        getCommand("suicide").setExecutor(new SuicideCommand());
        getCommand("killmyself").setExecutor(new SuicideCommand());

        // Basic Vanish Command (WILL CREATE ADVANCEDVANISH LATER ON HOPEFULLY! 27/8/24

        getCommand("vanishabout").setExecutor(new VanishAboutCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("v").setExecutor(vanishCommand);

        // InvSee and EnderchestSee commands

        getCommand("invsee").setExecutor(new InvseeCommand());
        getCommand("openinv").setExecutor(new InvseeCommand());
        getCommand("invopen").setExecutor(new InvseeCommand());
        getCommand("ec").setExecutor(new EnderchestCommand());
        getCommand("ecopen").setExecutor(new EnderchestOpenCommand());
        getCommand("ecsee").setExecutor(new EnderchestOpenCommand());
        getCommand("openender").setExecutor(new EnderchestOpenCommand());
        getCommand("openenderchest").setExecutor(new EnderchestOpenCommand());

        // All effect commands (PUT TIMER ON THEM)

        getCommand("effectstrength").setExecutor(new EffectStrengthCommand());
        getCommand("effectspeed").setExecutor(new EffectSpeedCommand());
        getCommand("effectresistance").setExecutor(new EffectResistanceCommand());
        getCommand("effectinvis").setExecutor(new EffectInvisCommand());
        getCommand("effectgod").setExecutor(new EffectGodCommand());
        getCommand("effectclearall").setExecutor(new EffectClearallCommand());

        // Punish commands (Kick, mute, ban etc...)

        getCommand("punish").setExecutor(new PunishCommand());

    }

}