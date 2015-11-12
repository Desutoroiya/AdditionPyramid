package TheGame;

import java.util.Random;
import java.util.Scanner;

public class PyramidGame {

	private int difficulty;
	int[] pyramid;
	boolean[] userArray;

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
			for (j = i + 1; j < line.length(); j++)
				if (line.charAt(j) == ' ')
					break;
			x = (int) Integer.parseInt(line.substring(0, i));
			y = (int) Integer.parseInt(line.substring(i + 1, j));
			int max = (int) Math.pow(2, difficulty + 1);
			if (x < 1 || y < 1 || x > max || y > max) {
				System.out.println("Wrong input for cell number");
				return false;
			}
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
<<<<<<< HEAD

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
=======
	
	public void completePyramid(){
		int[] base = createRandomNumbers();
		int size = (int) Math.pow(2, difficulty + 1);
		for (int i = 0; i < size; i++) {
			pyramid[i] = base[i];
>>>>>>> refs/remotes/origin/master
			userArray[i] = true;
		}
		completePyramid(base);
	}
	
	/**
	 * Creates random numbers from 1 to 50. Amount of Numbers depending on
	 * the difficult will be added to the array
	 */
	public int[] createRandomNumbers() {
		int size = (int) Math.pow(2, difficulty + 1);
		int[] randomNumbers = new int[size];
		for (int i = 0; i < size; i++) {
			Random random = new Random();
			randomNumbers[i] = random.nextInt(50) + 1;
		}
		return randomNumbers;
	}

	public boolean completePyramid(int[] base) {
		if (base.length != (int) Math.pow(2, difficulty + 1))
			return false;
		for (int i = 0; i < base.length; i++)
			pyramid[i] = base[i];

		int next, skip = next = base.length - 1; 
		int i = 0;
		for (int k = base.length; k < pyramid.length; k++) {
			if (i == skip) {
				i++;
				skip += next;
				next--;
			}
			pyramid[k] = pyramid[i] + pyramid[i + 1];
			i++;
		}
		return true;
	}
}
