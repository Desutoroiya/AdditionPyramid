package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import TheGame.PyramidGame;

public class createGameTest {

	@Test
	public void testCreateGame() {
		//check difficulty
		//create pyramid
		
		PyramidGame game = new PyramidGame();
		int result = game.difficulty;
		if (result < 1 || result > 3)
			fail("Difficulty not decided!");
	}

}
