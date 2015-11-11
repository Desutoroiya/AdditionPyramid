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
		game.createPyramid();
		game.createRandomNumbers();
		if (game.getDifficulty() == 1) {
			int size = (int) Math.pow(2, game.getDifficulty() + 1);
			int[] pyramid = game.getPyramid();
			for (int i = 0; i < size; i++)
				if (pyramid[i] < 1 || pyramid[i] > 50) {
					fail("No numbers created in array");
				}
			for (int i = size; i < pyramid.length; i++)
				if (pyramid[i] != 0) {
					fail("Rest of array should be zero!");
				}
		}
	}
}
