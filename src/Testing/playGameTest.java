package Testing;

import static org.junit.Assert.*;
import org.junit.Test;
import TheGame.PyramidGame;

public class playGameTest {

	PyramidGame game = new PyramidGame();

	/**
	 * Test for the method setInputCell(String).
	 */
	@Test
	public void testSetInputCell() {
		// Call the method under test & Check the result
		if (game.setInputCell("Wrong_input"))
			fail("Wrong input accepted as an answer for a cell!");
	}
	
	/**
	 * Test for the method setInputCell(String).
	 */
	@Test
	public void testSetInputCell2() {
		// Call the method under test & Check the result
		if (game.setInputCell("Wrong input"))
			fail("Wrong input accepted as an answer for a cell!");
	}
}
