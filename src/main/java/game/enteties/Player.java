package game.enteties;

public class Player implements Comparable<Player>{	
	private String playerName;
	private int playerScore;
	
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
	private Position playerPostion;

	@Override
	public int compareTo(Player o) {
		return Integer.compare(this.playerScore, o.playerScore);

	}

}
