package de.crackscout123.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;

public class Fly implements CommandExecutor {
	
	Message msg = new Message();

	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
			if(s instanceof Player) {
				Player p = (Player)s;
				if(a.length == 0) {
					if(!p.hasPermission("crackscout123.command.fly") || p.hasPermission("crackscout123.command.*")) {
						if(p.getAllowFlight()) {
							p.setFlying(false);
							p.setAllowFlight(false);
							msg.send(p, "Fliegen wurde deaktiviert.");
						} else {
							p.setAllowFlight(true);
							p.setFlying(true);
							p.setFlySpeed(0.1F);
							msg.send(p, "Fliegen wurde aktiviert.");
						}
					} else {
						msg.send(p, "Du hast keine Berechtigung um diesen Befehel auszuführen.");
					}
				} else {
					msg.send(p, "/fly");
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
