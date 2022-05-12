package de.crackscout123.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;

public class Craft implements CommandExecutor{
	
	Message msg = new Message();
	

	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			if(a.length == 0) {
				Player p = (Player)s;
	                p.openWorkbench(null, true);				
			} else {
				Player p = (Player)s;
				msg.send(p, "/craft");
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
