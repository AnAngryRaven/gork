package com.guhcat.raven.gork;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.Arrays;
import java.util.List;

public class ChatListener implements Listener {


    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Gork.VARIANTS.forEach((variant) ->{
            if(event.getMessage().startsWith(Gork.PREFIX + " " +variant)){
                String playerName = event.getPlayer().getName();
                Bukkit.getScheduler().runTaskLaterAsynchronously(Gork.plugin, () ->{
                    Bukkit.getOnlinePlayers().forEach((player) -> {
                        if(player.getName() == playerName && Gork.HIGHLIGHTUSER)
                            player.sendMessage("<" + Gork.BotName +"> §c@"+ playerName + "§r yeh");
                        else
                            player.sendMessage("<" + Gork.BotName + "> @" + playerName + " yeh");
                    });
                    Gork.plugin.getLogger().log(java.util.logging.Level.INFO, "<" + Gork.BotName +"> @"+playerName+" yeh");
                }, 10);
            }
        });
    }
}
