package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import TheGame.PyramidGame;

public class answersGameTest {

	@Test
	public void solutionGameTest() {
		PyramidGame game = new PyramidGame();

		game.completePyramid(new int[] { 1, 2, 3, 4 });
		int[] pyramid = game.getPyramid();
		int[] expected = new int[] { 1, 2, 3, 4, 3, 5, 7, 8, 12, 20 };
		int[] result = game.getPyramid();

		for (int i = 0; i < pyramid.length; i++)
			assertEquals(expected[i], result[i]);
	}

}
