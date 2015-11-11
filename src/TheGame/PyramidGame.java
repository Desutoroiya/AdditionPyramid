package TheGame;

import java.util.Random;
import java.util.Scanner;

public class PyramidGame {

	private int difficulty;
	int[] pyramid;
	boolean[] userArray;
	public int randomNumbers;

	Scanner scanner = new Scanner(System.in);

	/**
	 * Constructor. Ask difficulty level from the user (System.in).
	 */
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
		createPyramid();
	}

	/**
	 * Create the two arrays needed for the game (pyramid - solution array &
	 * user array).
	 */
	public void createPyramid() {
		if (pyramid != null && userArray != null)
			return;
		int size, s = size = (int) Math.pow(2, difficulty + 1);
		for (int i = s - 1; i > 0; i--)
			size += i;
		pyramid = new int[size];
		userArray = new boolean[size];
	}

	/**
	 * 
	 * @param line
	 * @return
	 */
	public boolean setInputCell(String line) {
		int x, y, value, i, j;
		try {
			for (i = 0; i < line.length(); i++)
				if (line.charAt(i) == ' ')
					break;
			if (i == line.length()) {
				System.out.println("Wrong input form of \"" + line + "\".");
				return false;
			}
			x = (int) Integer.parseInt(line.substring(0, i));
			if (x < 1 || x > (int) Math.pow(2, difficulty + 1)) {
				System.out.println("Wrong input for cell number");
				return false;
			}
			for (j = i + 1; j < line.length(); j++)
				if (line.charAt(j) == ' ')
					break;
			y = (int) Integer.parseInt(line.substring(i + 1, j));
			value = (int) Integer.parseInt(line.substring(j + 1, line.length()));
		} catch (Exception e) {
			System.out.println("Wrong input form of \"" + line + "\".");
			return false;
		}
		return true;
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

	public void createRandomNumbers() {
		/**
		 * Creates random numbers from 1 to 50. Amount of Numbers depending on
		 * the difficult will be added to the array
		 */
		int size = (int) Math.pow(2, difficulty + 1);
		for (int i = 0; i < size; i++) {
			Random random = new Random();
			randomNumbers = random.nextInt(50) + 1;
			pyramid[i] = randomNumbers;
			userArray[i] = true;
		}
	}

	public boolean completePyramid(int[] base) {
		if (base.length != (int) Math.pow(2, difficulty + 1))
			return false;
		for (int i = 0; i < base.length; i++)
			pyramid[i] = base[i];
		pyramid[4] = pyramid[0] + pyramid[1];
		pyramid[5] = pyramid[1] + pyramid[2];
		pyramid[6] = pyramid[2] + pyramid[3];
		pyramid[7] = pyramid[4] + pyramid[5];
		pyramid[8] = pyramid[5] + pyramid[6];
		pyramid[9] = pyramid[7] + pyramid[8];
		for (int i = 0; i < pyramid.length; i++)
			System.out.print(pyramid[i] + " ");
		return true;
	}
}
