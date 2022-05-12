package de.crackscout123;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import de.crackscout123.Commands.Back;
import de.crackscout123.Commands.Craft;
import de.crackscout123.Commands.Enderchest;
import de.crackscout123.Commands.Fly;
import de.crackscout123.Commands.Force;
import de.crackscout123.Commands.Gamemode;
import de.crackscout123.Commands.Heal;
import de.crackscout123.Commands.Home;
import de.crackscout123.Commands.Invsee;
import de.crackscout123.Commands.Sethome;
import de.crackscout123.Commands.Sun;
import de.crackscout123.Commands.Tpa;
import de.crackscout123.Commands.Tpd;
import de.crackscout123.Commands.Tpr;
import de.crackscout123.Commands.Vanish;
import de.crackscout123.Listener.onDeath;
import de.crackscout123.Listener.onEntityExplode;
import de.crackscout123.Listener.onEntityTransform;
import de.crackscout123.Listener.onJoin;
import de.crackscout123.Listener.onLeave;

public class Main extends JavaPlugin implements Listener{
	

	public static HashMap<Player, Player> tpa = new HashMap<Player, Player>();
	public static HashMap<Player, Location> lastLocation = new HashMap<Player, Location>();
	
	@Override
	public void onEnable() {
		getCommand("back").setExecutor(new Back());
		getCommand("craft").setExecutor(new Craft());
		getCommand("enderchest").setExecutor(new Enderchest());
		getCommand("fly").setExecutor(new Fly());
		getCommand("force").setExecutor(new Force());
		getCommand("gamemode").setExecutor(new Gamemode());
		getCommand("heal").setExecutor(new Heal());
		getCommand("home").setExecutor(new Home());
		getCommand("invsee").setExecutor(new Invsee());
		getCommand("sethome").setExecutor(new Sethome());
		getCommand("sun").setExecutor(new Sun());
		getCommand("tpa").setExecutor(new Tpa());
		getCommand("tpd").setExecutor(new Tpd());
		getCommand("tpr").setExecutor(new Tpr());
		getCommand("vanish").setExecutor(new Vanish());
		
		
		Bukkit.getPluginManager().registerEvents(new onDeath(), this);
		Bukkit.getPluginManager().registerEvents(new onEntityExplode(), this);
		Bukkit.getPluginManager().registerEvents(new onEntityTransform(), this);
		Bukkit.getPluginManager().registerEvents(new onJoin(), this);
		Bukkit.getPluginManager().registerEvents(new onLeave(), this);
		
	}
	
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
	}
	
	

}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 19:53:10
 *
 */