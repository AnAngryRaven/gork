package com.guhcat.raven.gork;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import static com.guhcat.raven.gork.Gork.plugin;

public class Reload implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        plugin.reloadConfig();
        plugin.loadConfig();
        sender.sendMessage("gork reloaded successfully!");
        plugin.getLogger().log(java.util.logging.Level.INFO,"gork reloaded by user " + sender.getName() + "!");
        return true;
    }
}
