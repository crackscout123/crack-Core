package de.crackscout123.Listener;

import org.bukkit.entity.Damageable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTransformEvent;

public class onEntityTransform implements Listener {
	
	private int infectionRate = 100;
	
	@EventHandler
	public void onKill(EntityTransformEvent e) {
		if (!e.getTransformReason().equals(EntityTransformEvent.TransformReason.INFECTION)) {
			return;
		}
		int random = (int)(Math.random() * 101.0D + 0.0D);
		if(random > this.infectionRate) {
			Damageable villager = (Damageable)e.getTransformedEntity();
			villager.setHealth(0.0D);
		}
	}
}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 21:13:31
 *
 */