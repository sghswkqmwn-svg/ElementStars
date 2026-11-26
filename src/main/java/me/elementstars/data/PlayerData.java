package me.elementstars.data;

import me.elementstars.stars.StarType;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerData {

    private final Map<UUID, StarType> playerStars = new HashMap<>();

    public void setStar(UUID uuid, StarType star) {
        playerStars.put(uuid, star);
    }

    public StarType getStar(UUID uuid) {
        return playerStars.get(uuid);
    }

    public boolean hasStar(UUID uuid) {
        return playerStars.containsKey(uuid);
    }

    public void removeStar(UUID uuid) {
        playerStars.remove(uuid);
    }
}
