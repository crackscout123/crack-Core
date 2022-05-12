package de.crackscout123.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Main;
import de.crackscout123.Utils.Message;

public class Back implements CommandExecutor{
	
	Message msg = new Message();
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			Player p = (Player)s;
			if (a.length == 0){
				if(Main.lastLocation.containsKey(p)) {
					p.teleport(Main.lastLocation.get(p));
					msg.send(p, "Du wurdest Teleportiert.");
				} else {
					msg.send(p, "§cNullPointerExeption: lastLocation is empty for §c" + p.getName());
				}
			} else {
				msg.send(p, "/back");
			}
		}else {
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
