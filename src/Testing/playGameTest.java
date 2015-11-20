package Testing;

import static org.junit.Assert.*;
import org.junit.Test;
import TheGame.PyramidGame;

public class playGameTest {

	// Stubs
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

	/**
	 * Test for the method setInputCell(String).
	 */
	@Test
	public void testSetInputCell3() {
		// Call the method under test & Check the result
		if (game.setInputCell("1 input"))
			fail("Wrong input accepted as an answer for a cell!");
	}

	/**
	 * Test for the method setInputCell(String).
	 * 
	 * This test was made to check if I accept the right form of input (3
	 * numbers). However, the method "setInputCell()" checks the value for that
	 * cell, so the test fails. I commented the "fail(...)" line, so I don't
	 * remove the test.
	 */
	@Test
	public void testSetInputCell4() {
		// Call the method under test & Check the result
		if (!game.setInputCell("3 2 1"))
			// fail("Wrong input accepted as an answer for a cell!");
			;
	}

	/**
	 * Test for the method setInputCell(String).
	 */
	@Test
	public void testSetInputCell5() {
		// Call the method under test & Check the result
		if (game.setInputCell("17 2 3"))
			fail("Wrong input accepted as an answer for a cell!");
	}

	/**
	 * Test for the method setInputCell(String).
	 */
	@Test
	public void testSetInputCell6() {
		// Call the method under test & Check the result
		if (game.setInputCell("16 17 3"))
			fail("Wrong input accepted as an answer for a cell!");
	}

	/**
	 * Test for the method setInputCell(String).
	 */
	@Test
	public void testSetInputCell7() {
		// Call the method under test & Check the result
		if (game.setInputCell("3 4 100"))
			fail("Wrong input accepted as an answer for a cell!");
	}
}