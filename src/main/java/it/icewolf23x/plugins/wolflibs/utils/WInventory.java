package it.icewolf23x.plugins.wolflibs.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class WInventory implements InventoryHolder {


    private int SIZE;
    private InventoryType TYPE;
    private final Component TITLE;
    private final String IDENTIFIER;


    public WInventory(String identifier, int size, Component title) {
        IDENTIFIER = identifier;
        SIZE = size;
        TITLE = title;
    }
    public WInventory(String identifier, InventoryType type, Component title) {
        IDENTIFIER = identifier;
        TYPE = type;
        TITLE = title;
    }



































    public String getIdentifier() {
        return this.IDENTIFIER;
    }
    public Component getTitle() {
        return this.TITLE;
    }



































    @Override
    public @NotNull Inventory getInventory() {
        if (TYPE != null) {
            return Bukkit.createInventory(this, this.TYPE, this.TITLE);
        } else {
            return Bukkit.createInventory(this, this.SIZE, this.TITLE);
        }
    }
}
