package de.crackscout123.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class configGen {
	
	static File file = new File("plugins/crack-Core/Locations", "homes.yml");
	static FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static void saveLoc(Player player, String path) throws IOException {
		Player p = player;
		String world_pre = p.getWorld().getName();
		String world = world_pre.toLowerCase();
		Location loc = p.getLocation();
		double x = loc.getX();
		double y = loc.getY();
		double z = loc.getZ();
		float yaw = loc.getYaw();
		float pitch = loc.getPitch();
		
		cfg.set("warps." + path + ".world", world);
		cfg.set("warps." + path + ".x", x);
		cfg.set("warps." + path + ".y", y);
		cfg.set("warps." + path + ".z", z);
		cfg.set("warps." + path + ".yaw", yaw);
		cfg.set("warps." + path + ".pitch", pitch);
		cfg.save(file);
	}
	
	
	public static Location loadLoc(String path) throws FileNotFoundException, IOException, InvalidConfigurationException {

		cfg.load(file);
		String w = cfg.getString("warps." + path + ".world");
		double x = cfg.getDouble("warps." + path + ".x");
		double y = cfg.getDouble("warps." + path + ".y");
		double z = cfg.getDouble("warps." + path+ ".z");
		float yaw = (float)cfg.getDouble("warps." + path + ".yaw");
		float pitch = (float)cfg.getDouble("warps." + path + "pitch");
		
		Location loc = new Location(Bukkit.getWorld(w), x, y, z, yaw, pitch);
		
		return loc;
	}

}


/**
 * @author Joel Rzepka - crackscout123.de
 *
 * @date 12.05.2022 - 20:11:17
 *
 */