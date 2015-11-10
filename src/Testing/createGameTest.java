package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import TheGame.PyramidGame;

public class createGameTest {

	PyramidGame game = new PyramidGame();
	
	@Test
	public void testCreateGame() {		
		int result = game.getDifficulty();
		if (result < 1 || result > 3)
			fail("Difficulty not decided!");
	}
}
