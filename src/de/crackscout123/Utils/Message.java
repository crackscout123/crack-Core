package de.crackscout123.Utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Message {
	
	public void send(Player target, String message) {
		String prefix = "§cSystem: §7";
		target.sendMessage(prefix + message);
	}
	
	public void needPlayer(CommandSender s) {
		s.sendMessage("§cSystem: §7Du musst ein Spieler sein um diesen Befehl auszuführen.");
	}

}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 20:25:15
 *
 */