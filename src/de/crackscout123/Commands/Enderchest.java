package de.crackscout123.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;

public class Enderchest implements CommandExecutor{
	
	Message msg = new Message();

	@Override
	public boolean onCommand(CommandSender cs, Command c, String l, String[] a) {
		
		if(cs instanceof Player) {
			if(a.length == 0) {
				Player p = (Player)cs;
					p.openInventory(p.getEnderChest());
			} else if(a.length == 1){
				if(cs instanceof Player) {
					Player p = (Player)cs;
					if(p.hasPermission("crackscout123.command.enderchest.others") || p.hasPermission("crackscout123.command.*")) {
						if(Bukkit.getPlayer(a[0]).isOnline()) {
							p.openInventory(Bukkit.getPlayer(a[0]).getEnderChest());
						}else {
							msg.send(p, "Der Spieler §c" + a[0] + " §7wurde nicht gefunden.");
						}
					} else {
						msg.send(p, "Du hast keine Berechtigung um diesen Befehl auszuführen.");
					}
				} else {
					msg.needPlayer(cs);
				}
				
			} else {
				Player p = (Player)cs;
				msg.send(p, "/ec");
			}
		} else {
			msg.needPlayer(cs);;
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
