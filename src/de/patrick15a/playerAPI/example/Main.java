package de.patrick15a.playerAPI.example;

import org.bukkit.plugin.java.JavaPlugin;

import de.patrick15a.playerAPI.PlayerAPI;

public class Main extends JavaPlugin {

	private static PlayerAPI playerAPI;
	
	@Override
	public void onEnable() {
		
		playerAPI = new PlayerAPI();
		
	}
	
	public static PlayerAPI getPlayerAPI() {
		return playerAPI;
	}
	
}
