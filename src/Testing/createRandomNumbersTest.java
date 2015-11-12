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
		PyramidGame game = new PyramidGame();
		game.completePyramid();

		if (game.getDifficulty() == 1) {
			int size = 4;
			int[] pyramid = game.getPyramid();
			boolean[] userArray = game.getUserArray();
			for (int i = 0; i < size; i++)
				if (pyramid[i] < 1 || pyramid[i] > 50 || !userArray[i]) {
					fail("Wrong data in the arrays.");
				}
			for (int i = size; i < pyramid.length; i++)
				if (pyramid[i] < 1 || pyramid[i] > 50 || userArray[i]) {
					fail("Wrong data in the arrays.");
				}
		} else if (game.getDifficulty() == 2) {
			int size = 8;
			int[] pyramid = game.getPyramid();
			boolean[] userArray = game.getUserArray();
			for (int i = 0; i < size; i++)
				if (pyramid[i] < 1 || pyramid[i] > 50 || !userArray[i]) {
					fail("Wrong data in the arrays.");
				}
			for (int i = size; i < pyramid.length; i++)
				if (pyramid[i] < 1 || pyramid[i] > 50 || userArray[i]) {
					fail("Wrong data in the arrays.");
				}
		} else {
			int size = 16;
			int[] pyramid = game.getPyramid();
			boolean[] userArray = game.getUserArray();
			for (int i = 0; i < size; i++)
				if (pyramid[i] < 1 || pyramid[i] > 50 || !userArray[i]) {
					fail("Wrong data in the arrays.");
				}
			for (int i = size; i < pyramid.length; i++)
				if (pyramid[i] < 1 || pyramid[i] > 50 || userArray[i]) {
					fail("Wrong data in the arrays.");
				}
		}
	}
}
