package Testing;

import static org.junit.Assert.*;
import org.junit.Test;
import TheGame.PyramidGame;

public class createGameTest {

	private PyramidGame game = new PyramidGame();

	/**
	 * Test for the constructor. Check difficulty value.
	 */
	@Test
	public void testCreateGame() {
		// Spy
		int result = game.getDifficulty();
		if (result < 1 || result > 3)
			fail("Difficulty not decided!");
	}

	/**
	 * Test for the method createPyramid().
	 */
	@Test
	public void testCreatePyramid() {
		// Spy
		// Call the method under test
		game.createPyramid();
		// Check the arrays' size
		int size, s = size = (int) Math.pow(2, game.getDifficulty() + 1);
		for (int i = s - 1; i > 0; i--)
			size += i;
		if (game.getPyramid().length != size || game.getUserArray().length != size)
			fail("Wrong pyramid size for this difficulty level!");
	}
}