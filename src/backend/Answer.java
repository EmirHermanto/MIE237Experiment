package backend;

public class Answer {
	String userName;
	Image image;
	float fractionCorrect;
	long timeTaken;
	
	public Answer() {
		userName = new String();
		image = new Image();
		fractionCorrect = 0f;
		timeTaken = 0l;
	}
	
	public Answer(String name, Image image, float fractionCorrect, long timeTaken ) {
		this.userName = name;
		this.image = image;
		this.fractionCorrect = fractionCorrect;
		this.timeTaken = timeTaken;
	}
}
