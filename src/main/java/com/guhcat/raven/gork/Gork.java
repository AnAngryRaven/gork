package com.guhcat.raven.gork;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class Gork extends JavaPlugin {
    public static Gork plugin;
    FileConfiguration config = getConfig();
    public static List<String> VARIANTS;
    public static String PREFIX;
    public static boolean HIGHLIGHTUSER;
    public static String BotName;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new ChatListener(), this);

        VARIANTS = plugin.getConfig().getStringList("triggers");
        PREFIX = plugin.getConfig().getString("prefix");
        HIGHLIGHTUSER = plugin.getConfig().getBoolean("highlight_username");

        if(PREFIX.startsWith("@"))
            BotName = PREFIX.substring(1);
        else
            BotName = PREFIX;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
