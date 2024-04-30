package it.icewolf23x.plugins.wolflibs.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemUtils {



































    public static ItemStack get(Material material, int amount, Component displayName, List<Component> lore, int customModelData) {
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(displayName);
        meta.lore(lore);
        meta.setCustomModelData(customModelData);

        item.setItemMeta(meta);
        return item;
    }



































    public static ItemStack get(Material material, int amount, List<Component> lore, int customModelData) {
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);

        ItemMeta meta = item.getItemMeta();
        meta.lore(lore);
        meta.setCustomModelData(customModelData);

        item.setItemMeta(meta);
        return item;
    }



































    public static ItemStack get(Material material, int amount, Component displayName, int customModelData) {
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(displayName);
        meta.setCustomModelData(customModelData);

        item.setItemMeta(meta);
        return item;
    }



































    public static ItemStack get(Material material, int amount, int customModelData) {
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);

        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(customModelData);

        item.setItemMeta(meta);
        return item;
    }



































    public static ItemStack get(Material material, int amount, Component displayName, List<Component> lore) {
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(displayName);
        meta.lore(lore);

        item.setItemMeta(meta);
        return item;
    }



































    public static ItemStack get(Material material, int amount, Component displayName) {
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);

        ItemMeta meta = item.getItemMeta();
        meta.displayName(displayName);

        item.setItemMeta(meta);
        return item;
    }



































    public static ItemStack get(Material material, int amount, List<Component> lore) {
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);

        ItemMeta meta = item.getItemMeta();
        meta.lore(lore);

        item.setItemMeta(meta);
        return item;
    }









}
