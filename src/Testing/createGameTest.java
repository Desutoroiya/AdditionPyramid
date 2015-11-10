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
		if (game.getDifficulty() == 1) {
			if (game.getPyramid().length != 4)
				fail("Wrong pyramid size for this difficulty level!");
		} else if (game.getDifficulty() == 2) {
			if (game.getPyramid().length != 8)
				fail("Wrong pyramid size for this difficulty level!");
		} else if (game.getDifficulty() == 3) {
			if (game.getPyramid().length != 16)
				fail("Wrong pyramid size for this difficulty level!");
		}
	}
}
