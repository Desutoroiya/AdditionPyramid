package TheGame;

import java.util.Random;
import java.util.Scanner;

public class PyramidGame {

	private int difficulty;
	private int baseLength;

	private int[] pyramid;
	private boolean[] userArray;

	private Scanner scanner = new Scanner(System.in);

	/**
	 * Constructor. Ask difficulty level from the user (System.in).
	 */
	public PyramidGame() {
		int input = 0;
		System.out.println("Difficulty Level:\n1 : EASY (4-base pyramid)\n"
				+ "2 : MEDIUM (8-base pyramid)\n3 : HARD (16-base pyramid)");
		do {
			try {
				System.out.print("Please choose 1, 2 or 3:   ");
				String line = scanner.nextLine();
				input = (int) Integer.parseInt(line.charAt(0) + "");
				if (line.length() != 1)
					input = 0;
			} catch (Exception e) {
				System.out.println("Please choose number 1,2 or 3");
			}
		} while (input < 1 || input > 3);
		System.out.println("-------------------------------------------------------------------");
		difficulty = input;
		baseLength = (int) Math.pow(2, difficulty + 1);
		createPyramid();
		completePyramid();
		// TODO delete - move
		play();
	}

	/**
	 * Create the two arrays needed for the game (pyramid - solution array &
	 * user array).
	 */
	public void createPyramid() {
		if (pyramid != null && userArray != null)
			return;
		int size = baseLength;
		for (int i = baseLength - 1; i > 0; i--)
			size += i;
		pyramid = new int[size];
		userArray = new boolean[size];
	}

	public boolean gameIsFinished() {
		for (int i = baseLength; i < userArray.length; i++)
			if (!userArray[i])
				return false;
		return true;
	}

	private void giveInstructions() {
		String instructions = "Instructions:\nYou chose to play the Addition Pyramid with " + baseLength
				+ " numbers in its base!\nTo enter " + "a number in a cell you have to enter three (3) numbers\n"
				+ "in the following form : x y value\n" + "x     : the row (strating from the top)\n"
				+ "y     : the column (starting from the left)\n" + "value : the answer for that cell.\nGood luck!\n"
				+ "--------------------------------------------------------------------\n";
		System.out.println(instructions);
	}

	public void printPyramid() {
		if (pyramid == null)
			return;
		System.out.print("\t  ");
		for (int i = 1; i <= baseLength; i++)
			System.out.print(i + "\t");
		System.out.print("\n1\t| ");
		int position = 0, lineLength = 1;
		for (int i = pyramid.length - 1; i >= 0; i--) {
			if (userArray[i])
				System.out.print(pyramid[i] + "\t");
			else
				System.out.print("--\t");
			position++;
			if (position == lineLength) {
				position = 0;
				lineLength++;
				System.out.println();
				if (lineLength <= baseLength)
					System.out.print(lineLength + "\t| ");
			}
		}
		for (int i = 0; i < baseLength; i++)
			System.out.print("---------");
		System.out.println();
	}

	public void play() {
		giveInstructions();
		printPyramid();
		do {
			System.out.print("New answer [x y value] : ");
			String line = scanner.nextLine();
			if (setInputCell(line))
				printPyramid();
		} while (!gameIsFinished());
		System.out.println("Congratulations! You completed the pyramid!");
	}

	private boolean checkValue(int x, int y, int value) {
		// Check the value & fill in the pyramid if it's correct
		int magic = 0;
		for (int i = 1; i <= x; i++)
			magic += i;
		int pos = pyramid.length - magic + x - y;

		if (userArray[pos]) {
			System.out.println("This cell is already completed!");
			return false;
		}
		if (pyramid[pos] != value)
			return false;
		userArray[pos] = true;
		return true;
	}

	/**
	 * 
	 * @param line
	 * @return
	 */
	public boolean setInputCell(String line) {
		int x, y, value, i, j;
		try {
			// Check input form & boundaries
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
			if (x < 1 || y < 1 || x > baseLength || y > x) {
				System.out.println("Wrong input for cell number");
				return false;
			}
			value = (int) Integer.parseInt(line.substring(j + 1, line.length()));
		} catch (Exception e) {
			System.out.println("Wrong input form of \"" + line + "\".");
			return false;
		}
		return checkValue(x, y, value);
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

	public void completePyramid() {
		int[] base = createRandomNumbers();
		for (int i = 0; i < baseLength; i++) {
			pyramid[i] = base[i];
			userArray[i] = true;
		}
		completePyramid(base);
	}

	/**
	 * Creates random numbers from 1 to 50. Amount of Numbers depending on the
	 * difficult will be added to the array
	 */
	public int[] createRandomNumbers() {
		int[] randomNumbers = new int[baseLength];
		for (int i = 0; i < baseLength; i++) {
			Random random = new Random();
			randomNumbers[i] = random.nextInt(50) + 1;
		}
		return randomNumbers;
	}

	public boolean completePyramid(int[] base) {
		if (base.length != baseLength)
			return false;
		for (int i = 0; i < baseLength; i++)
			pyramid[i] = base[i];

		int next, skip = next = baseLength - 1;
		int i = 0;
		for (int k = baseLength; k < pyramid.length; k++) {
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