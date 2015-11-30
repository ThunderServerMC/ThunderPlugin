package com.jacob.mathboy601;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.EventHandler;

public class ThunderPlugin extends JavaPlugin {
	public void onEnable() {

	}
	public void onDisable() {

	}
	public void adminAction(String user, String action, boolean isRed) {
		getServer().broadcastMessage((isRed ? ChatColor.RED : ChatColor.AQUA) + user + " - " + action);
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("thunder")) {
			if (sender instanceof Player) {
				sender.sendMessage(ChatColor.GOLD + "You sent out a Thunder Bolt!");
				sender.getLocation().getWorld().strikeLightning(sender.getLocation());
			} else {
				sender.sendMessage(ChatColor.RED + "You have to be a player!");
			}
			return true;
		}
		return false;
	}
}
