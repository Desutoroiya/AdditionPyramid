package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import TheGame.PyramidGame;

public class createRandomNumbersTest {

	/**
	 * Test method for creating random numbers into the array
	 */
	@Test
	public void testRandomNumbers() {
		// Spy
		PyramidGame game = new PyramidGame();
		int difficulty = game.getDifficulty();
		game.completePyramid();

		int size = (int) Math.pow(2, difficulty + 1);
		int[] pyramid = game.getPyramid();
		boolean[] userArray = game.getUserArray();

		for (int i = 0; i < size; i++)
			if (pyramid[i] < 1 || pyramid[i] > 50 || !userArray[i]) {
				fail("Wrong data in the arrays.");
			}
		for (int i = size; i < pyramid.length; i++)
			if (pyramid[i] == 0 || userArray[i]) {
				fail("Wrong data in the arrays.");
			}
	}
}
