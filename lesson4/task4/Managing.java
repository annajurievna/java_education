package lesson4.task4;

import java.util.ArrayList;
import java.util.List;

public class Managing implements LeagManager {
	List<Player> players;
	List<Race> races;
	List<League> leagues;
	
	public Managing(List<Player> pl, List<Race> r, List<League> l) {
		this.players = pl;
		this.races = r;
		this.leagues = l;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	public boolean removePlayer(Player player) {
		List<Player> newPlayers = new ArrayList<Player>();
		Boolean exists = false;
		for (Player p: this.players) {
			if (!p.getName().equals(player.getName())) {
				newPlayers.add(p);
			}
			else {
				exists = true;
			}
		}
		if (exists) this.players = newPlayers;
		return exists;
	}
	
	public Player getPlayer(String name) {
		for (Player p: this.players) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return new Player(" ", 0);
	}
	
	public List<Player> getAllPlayers() {
		return this.players;
	}
	
	public List<Player> getPlayers(League league) {
		int i = this.leagues.indexOf(league);
		return this.leagues.get(i).getPlayers();
	}
	
	public List<Player> getPlayers(Race race) {
		int i = this.races.indexOf(race);
		return this.races.get(i).getPlayers();
	}
	
	public void addPoints(String name, int pt) {
		for (Player p: this.players) {
			if (p.getName().equals(name)) {
				p.points = pt;
			}
		}
	}
}
