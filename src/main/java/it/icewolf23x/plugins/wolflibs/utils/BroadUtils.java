package it.icewolf23x.plugins.wolflibs.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class BroadUtils {

    public static void send(Player sendTo, Component message) {
        sendTo.sendMessage(message);
    }



































    public static void send(String prefix, Player sendTo, Component message) {
        sendTo.sendMessage(MessageUtils.format(prefix).append(message));
    }



































    public static void send(ConsoleCommandSender sendTo, Component message) {
        sendTo.sendMessage(message);
    }



































    public static void send(String prefix, ConsoleCommandSender sendTo, Component message) {
        sendTo.sendMessage(MessageUtils.format(prefix).append(message));
    }
}
