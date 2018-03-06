package backend;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static String userName;
	static ArrayList<Picture> pictures = new ArrayList<>();
	static ArrayList<Answer> answers = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO: 
		// Enter user's name
		// Screen 1: Show user instructions
		// check for user confirmation
		
		while(!pictures.isEmpty()) {
			answers.add(PictureTest(userName));
		}

	}

	public static void init() {
		//Fills Pictures with the Pictures of the typos
		
	}
	
	public static Answer PictureTest(String userName) throws IOException{
		Boolean on = true;
		int typosGuessed = 0;
		long timeTaken = 0l;
		float fractionCorrect = 0f;
		Answer ans = new Answer();
		
		while(on){
			String userInput = new String();
			BufferedReader cin = new BufferedReader( new InputStreamReader(System.in));
			Boolean ready = false;
			
			//User is ready or not
			while(!ready) {
				System.out.println("Are you ready (enter Y to confirm): ");
				userInput = cin.readLine();
				try {
					ready = (userInput.trim().toLowerCase() == "y")?(true):(false);
				}catch (Exception e) {
					System.out.println("User Input error!");
				}
			}
			
			//TODO:Generate the randomNo.
			int randomNo = 0;
			//retrieves Picture and removes that Picture from remainingPictures.
			Picture test = pictures.get(randomNo);
			pictures.remove(randomNo);

			//Starts the test for the current user
			//TODO: Output the Picture
			Long startTime = System.currentTimeMillis();
			System.out.println("What is your typo guess: ");
			while(on) {
				try {
					userInput = cin.readLine();
					typosGuessed = Integer.parseInt(userInput.trim());
					timeTaken = System.currentTimeMillis() - startTime;
					on = false;
				}catch (Exception e) {
					System.out.println("User MUST enter an integer");
				}
			}

			//generates the final answer
			fractionCorrect = typosGuessed/(test.getNoTypos());
			ans = new Answer(userName, test, fractionCorrect, timeTaken);
		}
		return ans;
	}


}
