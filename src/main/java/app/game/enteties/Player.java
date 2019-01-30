package app.game.enteties;

public class Player{	
	private String playerName;
	private int playerScore;
	private Position playerPostion;	

	
	public Player(String name){
		this.playerName = name;
		
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	public Position getPlayerPostion() {
		return playerPostion;
	}
	public void setPlayerPostion(Position playerPostion) {
		this.playerPostion = playerPostion;
	}



}
