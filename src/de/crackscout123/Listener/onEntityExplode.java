package de.crackscout123.Listener;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class onEntityExplode implements Listener {

	@EventHandler
	public void onEntityExplodeEvent(EntityExplodeEvent e) {
		if(e.getEntityType() == EntityType.CREEPER) {
			e.setCancelled(true);
		}
	}
}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 21:08:34
 *
 */