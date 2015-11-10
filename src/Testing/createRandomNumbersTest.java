package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import TheGame.PyramidGame;

public class createRandomNumbersTest {

	@Test
	public void testRandomNumbers() {
		PyramidGame game = new PyramidGame();
		int result = game.randomNumbers;
		if(result < 1 || result > 50)
			fail("Random number is out of range!");			
	}

}
