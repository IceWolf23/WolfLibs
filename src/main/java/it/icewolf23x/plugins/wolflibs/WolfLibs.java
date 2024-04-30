package it.icewolf23x.plugins.wolflibs;

import it.icewolf23x.plugins.wolflibs.utils.BroadUtils;
import it.icewolf23x.plugins.wolflibs.utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class WolfLibs extends JavaPlugin {

    public static WolfLibs PLUGIN;
    public static FileConfiguration CONFIG;

    @Override
    public void onEnable() {
        PLUGIN = this;
        CONFIG = this.getConfig();
        BroadUtils.send(CONFIG.getString("messages.prefix"), Bukkit.getConsoleSender(), MessageUtils.format(CONFIG.getString("messages.startup")));
        // Plugin startup logic



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
