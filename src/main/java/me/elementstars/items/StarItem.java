package me.elementstars.items;

import me.elementstars.stars.StarType;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class StarItem {

    public static ItemStack createStar(StarType star) {

        ItemStack item = new ItemStack(Material.NETHER_STAR);

        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.GOLD + star.getDisplayName());

        meta.setLore(Arrays.asList(
                ChatColor.GRAY + "Permanent Element Star",
                ChatColor.YELLOW + "Soulbound",
                ChatColor.GREEN + "Cannot be dropped"
        ));

        meta.setUnbreakable(true);

        item.setItemMeta(meta);

        return item;
    }
}
