package de.crackscout123.Commands;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;
import de.crackscout123.Utils.configGen;


public class Sethome implements CommandExecutor{
	
	Message msg = new Message(); 
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			Player p = (Player)s;
			if(a.length == 0) {
				try {
					configGen.saveLoc(p, p.getName());
					msg.send(p, "Home erfolgreich gesetzt.");
				} catch (IOException e) {
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