package it.icewolf23x.plugins.wolflibs.utils;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

public class PersistentDataContainerUtils {

    public static LivingEntity set(Plugin plugin, LivingEntity entity, String identifier, String value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        entity.getPersistentDataContainer().set(key, PersistentDataType.STRING, value);
        return entity;
    }
    public static LivingEntity set(Plugin plugin, LivingEntity entity, String identifier, int value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        entity.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, value);
        return entity;
    }
    public static LivingEntity set(Plugin plugin, LivingEntity entity, String identifier, boolean value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        entity.getPersistentDataContainer().set(key, PersistentDataType.BOOLEAN, value);
        return entity;
    }
    public static LivingEntity set(Plugin plugin, LivingEntity entity, String identifier, float value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        entity.getPersistentDataContainer().set(key, PersistentDataType.FLOAT, value);
        return entity;
    }
    public static LivingEntity set(Plugin plugin, LivingEntity entity, String identifier, double value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        entity.getPersistentDataContainer().set(key, PersistentDataType.DOUBLE, value);
        return entity;

    }
    public static LivingEntity set(Plugin plugin, LivingEntity entity, String identifier, long value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        entity.getPersistentDataContainer().set(key, PersistentDataType.LONG, value);
        return entity;
    }






    public static ItemMeta set(Plugin plugin, ItemMeta meta, String identifier, String value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, value);
        return meta;
    }
    public static ItemMeta set(Plugin plugin, ItemMeta meta, String identifier, int value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        meta.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, value);
        return meta;
    }
    public static ItemMeta set(Plugin plugin, ItemMeta meta, String identifier, boolean value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        meta.getPersistentDataContainer().set(key, PersistentDataType.BOOLEAN, value);
        return meta;
    }
    public static ItemMeta set(Plugin plugin, ItemMeta meta, String identifier, float value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        meta.getPersistentDataContainer().set(key, PersistentDataType.FLOAT, value);
        return meta;
    }
    public static ItemMeta set(Plugin plugin, ItemMeta meta, String identifier, double value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        meta.getPersistentDataContainer().set(key, PersistentDataType.DOUBLE, value);
        return meta;

    }
    public static ItemMeta set(Plugin plugin, ItemMeta meta, String identifier, long value) {
        NamespacedKey key = new NamespacedKey(plugin, identifier);
        meta.getPersistentDataContainer().set(key, PersistentDataType.LONG, value);
        return meta;
    }
}
