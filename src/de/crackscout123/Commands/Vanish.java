package de.crackscout123.Commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;


public class Vanish implements CommandExecutor {

	public static ArrayList<Player> vanished = new ArrayList<>();
	Message msg = new Message();
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
			if(s instanceof Player) {
				final Player p = (Player)s;
				if(a.length == 0  && p.isOp()) {
						if(vanished.contains(p)) {
							for(Player team : Bukkit.getServer().getOnlinePlayers()) {
								team.showPlayer(p);
								vanished.remove(p);
								p.setGameMode(GameMode.SURVIVAL);
							}
							p.sendMessage("§cSystem: §7");
							msg.send(p, "Du befindest dich nicht mehr im §cVanish§7.");
						}else {
							for(Player team : Bukkit.getOnlinePlayers()) {
								team.hidePlayer(p);
								vanished.add(p);
								p.setGameMode(GameMode.SPECTATOR);
							}
							msg.send(p, "Du befindest dich nun im §cVanish§7.");
						}
					}
			} else {
				msg.needPlayer(s);
			}
		return false;
	}
	
	
}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 20:10
 *
 */
