package lesson4.task4;

import java.util.ArrayList;
import java.util.List;

public class League {
	String leagueName;
	List<Player> inLeague;
	List<Race> races;
	
	public League(String name, List<Race> rc) {
		this.leagueName = name;
		inLeague = new ArrayList<Player>();
		this.races = rc;
		for (Race r: rc) {
			this.inLeague.addAll(r.getPlayers());
		}
	}
	
	public List<Player> getPlayers() {
		return this.inLeague;
	}
}
