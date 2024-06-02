package it.icewolf23x.plugins.wolflibs.utils;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class WInventory implements InventoryHolder {


    private final Plugin PLUGIN;
    private final String IDENTIFIER;


    public WInventory(Plugin plugin, String identifier) {
        PLUGIN = plugin;
        IDENTIFIER = identifier;
    }


    public String getIdentifier() {
        return this.IDENTIFIER;
    }
    public Plugin getPluginHolder() {
        return this.PLUGIN;
    }

    @Override
    public @NotNull Inventory getInventory() {
        return null;
    }
}
