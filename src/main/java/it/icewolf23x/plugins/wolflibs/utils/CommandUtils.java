package it.icewolf23x.plugins.wolflibs.utils;


import it.icewolf23x.plugins.wolflibs.WolfLibs;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class CommandUtils {
    static String prefix = WolfLibs.CONFIG.getString("messages.prefix");

    public static int register(String command, CommandExecutor object, Plugin plugin, TabCompleter completer) {

        try {
            Objects.requireNonNull(WolfLibs.PLUGIN.getCommand(command)).setExecutor(object);
            Objects.requireNonNull(WolfLibs.PLUGIN.getCommand(command)).setTabCompleter(completer);
            BroadUtils.send(prefix, Bukkit.getConsoleSender(), MessageUtils.format(Objects.requireNonNull(WolfLibs.CONFIG.getString("messages.loading.commands.success")).replace("%command%", command).replace("%plugin%", plugin.getName())));
            return 0;
        } catch (Exception e) {
            BroadUtils.send(prefix, Bukkit.getConsoleSender(), MessageUtils.format(Objects.requireNonNull(WolfLibs.CONFIG.getString("messages.loading.commands.error")).replace("%command%", command).replace("%plugin%", plugin.getName())));
            BroadUtils.send(prefix, Bukkit.getConsoleSender(), MessageUtils.format(String.format("§c%s", e)));
            return 1;
        }


    }



































    public static int register(String command, CommandExecutor object, Plugin plugin) {

        try {
            Objects.requireNonNull(WolfLibs.PLUGIN.getCommand(command)).setExecutor(object);
            BroadUtils.send(prefix, Bukkit.getConsoleSender(), MessageUtils.format(Objects.requireNonNull(WolfLibs.CONFIG.getString("messages.loading.commands.success")).replace("%command%", command).replace("%plugin%", plugin.getName())));
            return 0;
        } catch (Exception e) {
            BroadUtils.send(prefix, Bukkit.getConsoleSender(), MessageUtils.format(Objects.requireNonNull(WolfLibs.CONFIG.getString("messages.loading.commands.error")).replace("%command%", command).replace("%plugin%", plugin.getName())));
            BroadUtils.send(prefix, Bukkit.getConsoleSender(), MessageUtils.format(String.format("§c%s", e)));
            return 1;
        }


    }

}
