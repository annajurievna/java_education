package lesson4.task4;

import java.util.List;

public interface LeagManager {
	public void addPlayer(Player player); 
	public boolean removePlayer(Player player); 
	public Player getPlayer(String name); 
	public List getAllPlayers(); 
	public List getPlayers(League league); 
	public List getPlayers(Race race); 
	public void addPoints(String name, int points);
}
