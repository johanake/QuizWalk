package app.game.game;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.game.enteties.*;
import app.logic.calculators.CoordinatesCalc;

public class Game {
	private int gameId;
	private boolean gameIsLive = false;
	private Map<Integer, Player> players;
	private List<QuizStop> quizStops;
	private CoordinatesCalc coordCal = new CoordinatesCalc();
	private int quizStopIndex =0;
	
	
	//Borde kanske även ta med en lista av QuizStops
	public Game(int gameId){
		this.gameId = gameId;
		players = new HashMap<Integer, Player>();
		quizStops = new ArrayList<QuizStop>();

	}
	
	public void startGame(){
		this.gameIsLive = true;
	}
	
	public void stopGame(){
		this.gameIsLive = false;
		//Visa highscore och avsluta sessionen
	}
	
	//Lägg till 
	public void addPlayer(int id, String name){		
		if(!gameIsLive){
			players.put(id, new Player(name));
		}	
				
	}
	
	public void addQuizStop(String question, String answer, Position position){
		quizStops.add(new QuizStop(quizStopIndex, question, answer, position));
		quizStopIndex++;
		
	}
	
	public String getDistanceToQuizStop(Player p){
		String distance ="";
		
		return distance;
		
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
		Game game = new Game(1);
		
		//Portugal
		float longitude = (float) -8.219522;
		float latitude = (float) 40.273239;
		Position stopPos = new Position(latitude, longitude);
		//Adding a question
		game.addQuizStop("What color is the tower", "Red", stopPos);
		game.addQuizStop("What color is the tower", "Red", stopPos);
		
		//Adding players
		game.addPlayer(1, "Johan");
		game.addPlayer(2, "David");

		
	}
	

}
