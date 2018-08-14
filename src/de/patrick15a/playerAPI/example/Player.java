package de.patrick15a.playerAPI.example;

public class Player {

	public void getUUID(String name) {
		Main.getPlayerAPI().getUUIDByPlayerName(name);
	}
	
	public void getName(String uuid) {
		Main.getPlayerAPI().getPlayerNameByUUID(uuid);
	}
	
	
	public void getVersion(String uuid) {
		Main.getPlayerAPI().getPlayerVersion(uuid);
	}
	
	public void getLastIPAddress(String uuid) {
		Main.getPlayerAPI().getPlayerLastIPAddress(uuid);
	}
	
	public void getFistJoin(String uuid) {
		Main.getPlayerAPI().getPlayerFirstJoin(uuid);
	}
	
	public void getLastJoin(String uuid) {
		Main.getPlayerAPI().getPlayerLastJoin(uuid);
	}
	
}
