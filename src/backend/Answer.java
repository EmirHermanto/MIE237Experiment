package backend;

import java.awt.Image;

public class Answer {
	String userName;
	Image image;
	float fractionCorrect;
	long timeTaken;
	
	public Answer() {
		userName = new String();
		fractionCorrect = 0f;
		timeTaken = 0l;
	}
	
	public Answer(String name, Picture picture, float fractionCorrect, long timeTaken ) {
		this.userName = name;
		this.fractionCorrect = fractionCorrect;
		this.timeTaken = timeTaken;
		
		//generate an Image object from picture class.
	}
}
