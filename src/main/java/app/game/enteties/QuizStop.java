package app.game.enteties;

public class QuizStop {
	private int index;
	private String question;
	private String answer;
	private Position position;
	
	public QuizStop(int index, String question, String answer, Position pos){
		this.index = index;
		this.question = question;
		this.answer = answer;
		this.position = pos;		
		
	}
	
	public QuizStop(int index, String question){
		this.index = index;
		this.question = question;
		
	}

	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}	
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}

}
