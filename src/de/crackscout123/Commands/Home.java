package de.crackscout123.Commands;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.entity.Player;

import de.crackscout123.Main;
import de.crackscout123.Utils.Message;
import de.crackscout123.Utils.configGen;


public class Home implements CommandExecutor {
	
	Message msg = new Message();
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			if(a.length == 0) {
				Player p = (Player)s;
				Main.lastLocation.put(p, p.getLocation()); // saving current Location for /back
				try {
					p.teleport(configGen.loadLoc(p.getName()));
					msg.send(p, "Du wurdest zu deinem §cHome §7gebracht.");
				} catch (IOException | InvalidConfigurationException e) {
					System.out.println("something went wrong!");
					e.printStackTrace();
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
