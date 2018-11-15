package lesson4.task4;


import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		
		//create Players
		Player player1 = new Player("Bob", 11);
		Player player2 = new Player("Blake", 65);
		Player player3 = new Player("Anna", 2);
		Player player4 = new Player("Jack", 117);
		Player player5 = new Player("Peter", 6);
		Player player6 = new Player("Jane", 94);
		Player player7 = new Player("Alex", 25);
		Player player8 = new Player("Chris", 76);
		List<Player> allPlayers = new ArrayList<Player>();
		allPlayers.add(player1);
		allPlayers.add(player2);
		allPlayers.add(player3);
		allPlayers.add(player4);
		allPlayers.add(player5);
		allPlayers.add(player6);
		allPlayers.add(player7);
		allPlayers.add(player8);

		//creating races
		List<Player> playersList1 = new ArrayList<Player>();
		List<Player> playersList2 = new ArrayList<Player>();
		List<Player> playersList3 = new ArrayList<Player>();
		playersList1.add(player1);
		playersList1.add(player2);
		playersList2.add(player3);
		playersList2.add(player4);
		playersList2.add(player5);
		playersList2.add(player6);
		playersList3.add(player7);
		playersList3.add(player8);
		Race race1 = new Race("Final race", playersList1);
		Race race2 = new Race("1/2 race", playersList2);
		Race race3 = new Race("Final race", playersList3);
		List<Race> allRaces = new ArrayList<Race>();
		allRaces.add(race1);
		allRaces.add(race2);
		allRaces.add(race3);
		
		
		//creating leagues
		playersList1.addAll(playersList2);
		List<Race> racesLeague1 = new ArrayList<Race>();
		List<Race> racesLeague2 = new ArrayList<Race>();
		racesLeague1.add(race1);
		racesLeague1.add(race2);
		racesLeague2.add(race3);
		League league1 = new League("Highest", racesLeague1);
		League league2 = new League("Middle", racesLeague2);
		List<League> allLeagues = new ArrayList<League>();
		allLeagues.add(league1);
		allLeagues.add(league2);
		
		//start managing
		Managing manage = new Managing(allPlayers, allRaces, allLeagues);
		
		//check addPlayer(Player player)
		manage.addPlayer(new Player("Alla", 46));
		
		//check getPlayer(String name)
		Player pl = manage.getPlayer("Chris");
		System.out.println(pl.getName() + ": " + pl.getPoints());
		System.out.println(" ");
		
		// check getAllPlayers()
		List<Player> getAllPl = manage.getAllPlayers();
		System.out.println("All players:");
		for (Player plr: getAllPl) System.out.println(plr.getName() + ": " + plr.getPoints());
		System.out.println(" ");
		
		//check getPlayers(League league)
		List<Player> getAllPlLeague = manage.getPlayers(league2);
		System.out.println("All players in a league:");
		for (Player plr1: getAllPlLeague) System.out.println(plr1.getName() + ": " + plr1.getPoints());
		System.out.println(" ");
		
		//check getPlayers(Race race)
		List<Player> getAllPlRaces = manage.getPlayers(race2);
		System.out.println("All players in a race:");
		for (Player plr2: getAllPlRaces) System.out.println(plr2.getName() + ": " + plr2.getPoints());
		System.out.println(" ");
		
		//check addPoints(String name, int points)
		manage.addPoints("Anna", 0);
		Player pl9 = manage.getPlayer("Anna");
		System.out.println(pl9.getName() + ": " + pl9.getPoints());
	}
}
