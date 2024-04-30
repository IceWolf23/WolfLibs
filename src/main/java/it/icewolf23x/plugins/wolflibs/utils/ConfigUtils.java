package it.icewolf23x.plugins.wolflibs.utils;

import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class ConfigUtils {
    private static final String FILE_SUFFIX = ".yml";
    private static File file;

    public static File createFile(String path, Plugin plugin) {
        file = new File(plugin.getDataFolder(), path+FILE_SUFFIX);
        if (!file.exists()) {
            try {
                boolean ignore = file.createNewFile();
            } catch (IOException ignored) {}
        }
        return file;
    }



































    public static File getFile(String path, Plugin plugin) {
        file = new File(plugin.getDataFolder(), path+FILE_SUFFIX);
        return file;
    }



































    public static boolean fileExists(String path, Plugin plugin) {
        file = new File(plugin.getDataFolder(), path+FILE_SUFFIX);
        return file.exists();
    }

}
