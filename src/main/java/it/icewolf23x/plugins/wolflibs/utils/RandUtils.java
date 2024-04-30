package it.icewolf23x.plugins.wolflibs.utils;

public class RandUtils {
    public static int get(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
