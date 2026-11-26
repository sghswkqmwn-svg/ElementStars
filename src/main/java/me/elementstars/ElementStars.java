package me.elementstars;

import org.bukkit.plugin.java.JavaPlugin;

public final class ElementStars extends JavaPlugin {

    private static ElementStars instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getLogger().info("================================");
        getLogger().info("ElementStars Enabled!");
        getLogger().info("Minecraft: Paper 1.21.11");
        getLogger().info("Version: 1.0.0");
        getLogger().info("================================");
    }

    @Override
    public void onDisable() {
        getLogger().info("ElementStars Disabled!");
    }

    public static ElementStars getInstance() {
        return instance;
    }
}
