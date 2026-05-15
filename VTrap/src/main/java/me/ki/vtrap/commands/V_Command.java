package me.ki.vtrap.commands;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class V_Command implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (!(sender instanceof Player)) {
        sender.sendMessage(ChatColor.YELLOW + "НеНеНеНеНе " + ChatColor.DARK_BLUE + "Я на такое " + ChatColor.RED + "Не видусь!");

        return true;

}

        if (!sender.hasPermission("VoidTrap.Usage")) {
            sender.sendMessage(ChatColor.RED + "Брооу. У тяя нету прав!");
        }

            if (args.length == 0) {
                sender.sendMessage(ChatColor.YELLOW + "Боже чел... Щя я теe покажу как команду прописовать. " + ChatColor.RED + " ХАААТЬФУ: " + ChatColor.GREEN + "/voidtrap <игрок который лоханулся>");
                return true;
            }

            Player target = Bukkit.getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage(ChatColor.AQUA + "Клянусь, искал, но не нашел");
                return true;
            }

                World world = target.getWorld();
                Location voidLok = new Location(world, target.getLocation().getX(), -100, target.getLocation().getZ()

                );

                    target.teleport(voidLok);



            target.sendTitle(
                    ChatColor.RED + "Ну ты и лоханулся конечно. ХАХА. ПОПАЛ ТЫ!!!",
                    ChatColor.BOLD + "Наслаждайся ПрЕкРаСнОй бездной LoL.",
                    10, 60, 10
            );

            target.playSound(target.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 10f, 10f);


            sender.sendMessage(ChatColor.GREEN + "ХАААХАХАХАХА!!! За этим так смешно наблюдать! (Поздравляю! Все прекрастно!) игрок " + ChatColor.DARK_PURPLE + "Немножко упал.");

            return true;

        }
    }



