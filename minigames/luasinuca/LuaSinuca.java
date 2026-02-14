package net.theastro.luaclan.luasinuca;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

if (command.getName().equalsIgnoreCase("apostar")) {
    int dado = new Random().nextInt(6) + 1;
    player.sendMessage("§b§l[LuaClan] §fVocê jogou o dado e tirou: §6" + dado);
    if (dado > 3) {
        player.sendMessage("§a§lVITORIA! §fVocê ganhou 10 ouros!");
    } else {
        player.sendMessage("§c§lDERROTA! §fMais sorte na próxima.");
    }
}
