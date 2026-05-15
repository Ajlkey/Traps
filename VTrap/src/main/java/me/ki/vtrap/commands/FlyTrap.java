package me.ki.vtrap.commands;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyTrap implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(ChatColor.RED + "Да Да. Через консоль. " + ChatColor.AQUA + "Понятно." + ChatColor.GOLD + " Ну бро. Ты не игрок! " + ChatColor.DARK_RED + "Но но но. " + ChatColor.RED + "Команду не выполнишь!");
            return true;
        }
        {
            if (commandSender.hasPermission("FlyTrap.Usage")) {
                commandSender.sendMessage(ChatColor.DARK_GREEN + "Ну прав у тяя нету!");
            }
            if (args.length == 0) {
                commandSender.sendMessage(ChatColor.YELLOW + "Боже чел... Щя я теe покажу как команду прописовать. " + ChatColor.RED + " ХАААТЬФУ: " + ChatColor.GREEN + "/flytrap <игрок который лоханулся>");
                return true;
            }
            {
                Player target = Bukkit.getPlayer(args[0]);
                if (target == null) {
                    commandSender.sendMessage(ChatColor.AQUA + "Клянусь, искал, но не нашел");
                    return true;
                }
                World world = target.getWorld();
                Location voidLok = new Location(world, target.getLocation().getX(), 2000, target.getLocation().getZ()

                );

                target.teleport(voidLok);

                target.sendTitle(
                        ChatColor.RED + "Ну ты и лоханулся конечно. ХАХА. ПОПАЛ ТЫ!!!",
                        ChatColor.BOLD + "Ну что? ЛЕТИИИИ ПТАШКА!",
                        10, 60, 10
                );

                target.playSound(target.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 10f, 10f);


                commandSender.sendMessage(ChatColor.DARK_RED + "ХАААХАХАХАХА!!! " + ChatColor.UNDERLINE + "За этим так смешно наблюдать! (Поздравляю! Все прекрастно!) игрок " + ChatColor.DARK_PURPLE + "Немножко ПоЛеТеЛ!");
            }
        }
        return true;
    }
}
