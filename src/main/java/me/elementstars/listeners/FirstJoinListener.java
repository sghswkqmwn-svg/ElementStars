package me.elementstars.listeners;

import me.elementstars.managers.StarManager;
import me.elementstars.stars.StarType;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class FirstJoinListener implements Listener {

    private final StarManager starManager;

    public FirstJoinListener(StarManager starManager) {
        this.starManager = starManager;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        if (starManager.hasStar(player)) {
            return;
        }

        StarType star = starManager.getRandomStar();

        starManager.setStar(player, star);

        player.sendTitle(
                ChatColor.GOLD + "Choosing Your Star...",
                ChatColor.YELLOW + star.getDisplayName(),
                20,
                60,
                20
        );

        player.sendMessage(ChatColor.GREEN + "You have received the " + ChatColor.GOLD + star.getDisplayName());
    }
}
