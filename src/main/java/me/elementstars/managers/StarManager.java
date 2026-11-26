package me.elementstars.managers;

import me.elementstars.stars.StarType;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class StarManager {

    private final Map<UUID, StarType> playerStars = new HashMap<>();
    private final Random random = new Random();

    public StarType getStar(Player player) {
        return playerStars.get(player.getUniqueId());
    }

    public boolean hasStar(Player player) {
        return playerStars.containsKey(player.getUniqueId());
    }

    public void setStar(Player player, StarType star) {
        playerStars.put(player.getUniqueId(), star);
    }

    public StarType getRandomStar() {
        StarType[] stars = {
                StarType.FIRE,
                StarType.WATER,
                StarType.AIR,
                StarType.EARTH
        };

        return stars[random.nextInt(stars.length)];
    }

    public void removeStar(Player player) {
        playerStars.remove(player.getUniqueId());
    }
}
