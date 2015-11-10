package TheGame;

import java.util.Scanner;

public class PyramidGame {

	public int difficulty;

	public PyramidGame() {
		Scanner s = new Scanner(System.in);
		int input = 0;
		do {
			System.out.println("Choose difficulty: 1-EASY, 2-MEDIUM, 3-HARD");
			try {
				String line = s.nextLine();
				input = (int) Integer.parseInt(line.charAt(0) + "");
			} catch (Exception e) {
				System.out.println("Please choose number 1,2 or 3");
			}
		} while (input < 1 || input > 3);
		difficulty = input;
	}

}
