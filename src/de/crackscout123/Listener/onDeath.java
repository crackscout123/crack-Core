package de.crackscout123.Listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import de.crackscout123.Main;

public class onDeath implements Listener{
	
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		Entity et = e.getEntity();
		if(et instanceof Player) {			
			Player p = ((Player) et).getPlayer();

			//rest lastLocation onDeath
			if(Main.lastLocation.containsKey(p)) { Main.lastLocation.remove(p, p.getLocation()); }
		}
	}

}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 20:19:33
 *
 */