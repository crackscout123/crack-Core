package de.crackscout123.Listener;

import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.crackscout123.Utils.configGen;

public class onJoin implements Listener {

	@SuppressWarnings("deprecation")
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.setHealth(20D);
		p.setMaxHealth(20.0D);
		try {
			p.teleport(configGen.loadLoc("spawn"));
		} catch (IOException | InvalidConfigurationException e1) {
			e1.printStackTrace();
		}
	}
}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 21:09:44
 *
 */