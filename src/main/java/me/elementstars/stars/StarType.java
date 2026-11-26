package me.elementstars.stars;

public enum StarType {

    FIRE("Fire Star"),
    WATER("Water Star"),
    AIR("Air Star"),
    EARTH("Earth Star"),
    ELEMENTAL("Elemental Star");

    private final String displayName;

    StarType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
