package de.crackscout123.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Main;
import de.crackscout123.Utils.Message;

public class Tpr implements CommandExecutor{
	
	Message msg = new Message();
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			Player p = (Player)s;
			Player t = Bukkit.getPlayer(a[0]);
			if(Bukkit.getPlayer(a[0]) != null) {
				if(t.isOnline()) {
					Main.tpa.put(t,p);
					//putting p (command executer as value and & p [player] as key)
					msg.send(p, "Teleportanfrage an §c" + t.getDisplayName()+ " §7wurde gesendet.");
					msg.send(t, "Teleportanfrage von §c" + p.getDisplayName()+ " §7will zu dir §c/tpa §7zum annehmen & §c/tpd §7zum ablehnen.");
				} else {
					msg.send(p, "Der Spieler §c" + a[0] + " §7wurde nicht gefunden.");
				}
			
			} else {
				msg.send(p, "Der Spieler §c" + a[0] + " §7wurde nicht gefunden.");
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