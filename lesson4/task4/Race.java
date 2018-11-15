package lesson4.task4;

import java.util.List;

public class Race {
	String raceName;
	List<Player> attendingPlayers;
	
	public Race(String name, List<Player> list) {
		this.raceName = name;
		this.attendingPlayers = list;
	}
	
	
	public List<Player> getPlayers() {
		return this.attendingPlayers;
	}
	
}
