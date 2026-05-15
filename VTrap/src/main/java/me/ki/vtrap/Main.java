package me.ki.vtrap;

import me.ki.vtrap.commands.FlyTrap;
import me.ki.vtrap.commands.V_Command;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(ChatColor.GOLD + "Хаа. Вы включили МОЙ плагин, блогадоря ему можно жестко тролить типков!");

        getCommand("voidtrap").setExecutor(new V_Command());

        getCommand("flytrap").setExecutor(new FlyTrap());
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.DARK_RED + "Ну зря бро, зря...");
    }
}
