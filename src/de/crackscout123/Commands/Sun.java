package de.crackscout123.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;

public class Sun implements CommandExecutor{
	
	Message msg = new Message();
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(a.length == 0) {
			if(s instanceof Player) {
				//Player p = (Player)s;
				
				if(c.getName().equalsIgnoreCase("sun")) {
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "time set day");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "weather clear 999999");
				}
				
			}
		}
		return true;
	}
}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 21:24:36
 *
 */