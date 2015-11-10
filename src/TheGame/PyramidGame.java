package TheGame;

import java.util.ArrayList;
import java.util.Scanner;

public class PyramidGame {

	private int difficulty;
	public int randomNumbers;

	Scanner scanner = new Scanner(System.in);
	
	public PyramidGame() {
		int input = 0;
		do {
			System.out.println("Choose difficulty: 1-EASY, 2-MEDIUM, 3-HARD");
			try {
				String line = scanner.nextLine();
				input = (int) Integer.parseInt(line.charAt(0) + "");
				if (line.length() != 1)
					input = 0;
			} catch (Exception e) {
				System.out.println("Please choose number 1,2 or 3");
			}
		} while (input < 1 || input > 3);
		difficulty = input;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public int[] getPyramid() {
		return null;
	}

	public void createPyramid() {		
	}
}
