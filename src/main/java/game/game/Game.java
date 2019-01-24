package game.game;
import game.enteties.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
	private int gameId;
	private int playerId;
	private Map<Integer, Player> players;
	private List<QuizStop> quizStops;
	
	public Game(int gameId){
		this.gameId = gameId;
		players = new HashMap<Integer, Player>();
		quizStops = new ArrayList<QuizStop>();
		
		addPlayer(1, "Johan");
		addPlayer(2, "Henrik");
		addPlayer(3, "Adam");
		addPlayer(4, "Jonte");
		
		updatePlayerScore(1,500);
		updatePlayerScore(2,100);
		updatePlayerScore(4,250);
		writeScores();
	}
	
	public void addPlayer(int id, String name){
		players.put(id, new Player(name));
				
	}
	
	public void updatePlayerScore(int id, int score){
		Player p = players.get(id);
		p.setPlayerScore(score);
	}
	
	public void writeScores(){
		
		for(Map.Entry<Integer, Player> entry : players.entrySet()){
			System.out.println("Player name: " +entry.getValue().getPlayerName()
					+ "\nPlayer score: " + entry.getValue().getPlayerScore());
		}
		
	}
	
	public static void main(String[] args){
		new Game(1);
		
	}
	

}
