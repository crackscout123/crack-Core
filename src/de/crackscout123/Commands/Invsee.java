package de.crackscout123.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;

public class Invsee implements CommandExecutor{
	
	Message msg = new Message();
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			Player p = (Player)s;
			if(p.hasPermission("crackscout123.command.invesee")) {
				if(a.length == 1) {
					Player t = Bukkit.getPlayer(a[0]);
					p.openInventory(t.getInventory());
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