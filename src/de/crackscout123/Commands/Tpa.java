package de.crackscout123.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Main;
import de.crackscout123.Utils.Message;

public class Tpa implements CommandExecutor{
	
	Message msg = new Message();
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			Player p = (Player)s;
			if(Main.tpa.containsKey(p)) {
			Player t = Main.tpa.get(p);
				if(t.isOnline()) {
					Main.lastLocation.put(p, p.getLocation()); // saving current Location for /back
					t.teleport(p.getLocation());
					msg.send(t, "Du wurdest zu §c"+ p.getDisplayName() +"§7 gebracht.");
					Main.tpa.remove(p);
				} else {
					msg.send(p, "Der Spieler §c" + t.getDisplayName() + " §7wurde nicht gefunden.");
				}
			} else {
				msg.send(p, "Keine Anfrage gefunden.");
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
