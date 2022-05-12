package de.crackscout123.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Main;
import de.crackscout123.Utils.Message;

public class Tpd implements CommandExecutor{
	
	Message msg = new Message();
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			Player p = (Player)s;
			if(Main.tpa.containsKey(p)) {
				Player t = Main.tpa.get(p);
				msg.send(p, "Die Teleportanfrage von §c" + t.getDisplayName() + " §7wurde entfernt.");
				Main.tpa.remove(p);
				msg.send(t, "Die Teleportanfrage an §c" + p.getDisplayName() + " §7wurde abgelehnt.");
			}
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
