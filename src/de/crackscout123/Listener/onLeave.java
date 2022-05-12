package de.crackscout123.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.crackscout123.Main;
import de.crackscout123.Commands.Vanish;

public class onLeave implements Listener {
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent e){
		Vanish.vanished.remove(e.getPlayer());
		Main.lastLocation.remove(e.getPlayer(), e.getPlayer().getLocation());
	}
}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 21:10:39
 *
 */