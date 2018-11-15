package lesson4.task4;

public class Player {
	String playerName;
	int points;
	
	public Player (String name, int points) {
		this.playerName = name;
		this.points = points;
	}
	
	public String getName() {
		return this.playerName;
	}
	
	public int getPoints() {
		return this.points;
	}
}
