package net.theastro.luaclan.core;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class LuaClanCore extends JavaPlugin implements Listener, CommandExecutor {

    @Override
    public void onEnable() {

        getLogger().info("\u001B[34m========================================\u001B[0m");
        getLogger().info("\u001B[32m   A LuaClan iniciou!!   \u001B[0m");
        getLogger().info("\u001B[32m   O caos semi-anarquico comecou.    \u001B[0m");
        getLogger().info("\u001B[34m========================================\u001B[0m");

        // Registra os eventos e comandos
        Bukkit.getPluginManager().registerEvents(this, this);
        getCommand("apostar").setExecutor(this);
    }

    @EventHandler
    public void aoEntrar(PlayerJoinEvent event) {
        criarScoreboard(event.getPlayer());
    }

    public void criarScoreboard(Player player) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        
        
        Objective obj = board.registerNewObjective("luaclan", "dummy", "§b§lLUACLAN");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);

        // Linhas da Scoreboard
        obj.getScore("§7 ").setScore(5);
        obj.getScore("§fRank: §aMembro").setScore(4);
        obj.getScore("§fLobby: §7#1").setScore(3);
        obj.getScore("§fJogadores: §b" + Bukkit.getOnlinePlayers().size()).setScore(2);
        obj.getScore("§e ").setScore(1);
        obj.getScore("§eluaclan.com").setScore(0);

        player.setScoreboard(board);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if (command.getName().equalsIgnoreCase("apostar")) {
                int dado = new Random().nextInt(6) + 1;
                player.sendMessage("§b§l[Lounge] §fVocê jogou o dado e tirou: §6" + dado);
                
                if (dado > 3) {
                    player.sendMessage("§a§lGANHOU! §fVocê é o mestre da sinuca.");
                } else {
                    player.sendMessage("§c§lPERDEU! §fA sorte não está com você hoje.");
                }
                return true;
            }
        }
        return false;
    }
}
