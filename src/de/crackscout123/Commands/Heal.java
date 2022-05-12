package de.crackscout123.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;

public class Heal implements CommandExecutor{
	
	Message msg = new Message();	
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			Player p = (Player)s;
			if(a.length == 1) {
				Player target = Bukkit.getPlayer(a[0]);
				if(p.hasPermission("crackscout123.command.heal.others") || p.hasPermission("crackscout123.command.*")) {
					if (target.isOnline()) {
						target.setHealth(20.0D);
						target.setFoodLevel(20);
						msg.send(p, "Das Vaterland hat dich geheilt!.");
					}
				} else {
					msg.send(p, "Du hast keine Berechtigung um diesen Befehl auszuführen.");
				}
			}else{
				
				if(p.hasPermission("crackscout123.command.heal") || p.hasPermission("crackscout123.command.*")) {
					p.setHealth(20.0D);
					p.setFoodLevel(20);
					msg.send(p, "Das Vaterland hat dich geheilt!.");
				} else {
					msg.send(p, "Du hast keine Berechtigung um diesen Befehl auszuführen.");
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