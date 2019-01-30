package app.game.enteties;

import java.util.Comparator;

public class GameScoreComparator implements Comparator<Player>{


	@Override
	public int compare(Player p1, Player p2) {
		
		if(p1.getPlayerScore() > p2.getPlayerScore()){
			return -1;
		}else{
			return 1;
		}
		
		
		
	}

}
