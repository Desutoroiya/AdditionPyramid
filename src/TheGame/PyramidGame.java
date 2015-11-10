package TheGame;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class PyramidGame {

	private int difficulty;
	int[] pyramid;
	boolean[] userArray;
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

	public void createPyramid() {
		int size = 0;
		if (difficulty == 1)
			size = 4;
		else if (difficulty == 2)
			size = 8;
		else
			size = 16;
		pyramid = new int[size];
		userArray = new boolean[size];
	}

	public int getDifficulty() {
		return difficulty;
	}

	public int[] getPyramid() {
		return pyramid;
	}

	public boolean[] getUserArray() {
		return userArray;
	}
}
