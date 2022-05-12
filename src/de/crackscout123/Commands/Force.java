package de.crackscout123.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crackscout123.Utils.Message;

public class Force implements CommandExecutor{
	 
	Message msg = new Message();
	
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		if(s instanceof Player) {
			Player p = (Player)s;
			if (p.isOp() || p.hasPermission("crackscout123.admin.force")) {
				if(a.length == 0) {
					msg.send(p, "/force <player> <content>");
				}
				
				Player target = Bukkit.getPlayer(a[0]);
				if(target != null && target.isOnline()) {
					String content = "";
					for(int i = 1; i < a.length; i++) {
						content += a[i] + " ";
					}
					content = content.trim();
					if(content.startsWith("/")) {
						content = content.replaceFirst("/", "");
						target.performCommand(content);
						msg.send(p, "Forced §c" + target.getName() + " §7to perform: §c''/"+ content +"''§7.");
					} else {
						target.chat(content);
						msg.send(p, "Forced §c" + target.getName() + " §7to say: §c''"+ content +"''§7.");
					}
					
				} else {
					msg.send(p, "§7/force <player> <content>");
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