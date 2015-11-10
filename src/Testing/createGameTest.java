package Testing;

import static org.junit.Assert.*;
import org.junit.Test;
import TheGame.PyramidGame;

public class createGameTest {

	private PyramidGame game = new PyramidGame();

	@Test
	public void testCreateGame() {
		int result = game.getDifficulty();
		if (result < 1 || result > 3)
			fail("Difficulty not decided!");
	}

	@Test
	public void testCreatePyramid() {
		game.createPyramid();
		int size = (int) Math.pow(2, game.getDifficulty() + 1);
		if (game.getPyramid().length != size || game.getUserArray().length != size)
			fail("Wrong pyramid size for this difficulty level!");
	}
}