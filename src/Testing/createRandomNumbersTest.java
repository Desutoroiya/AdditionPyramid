package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import TheGame.PyramidGame;

public class createRandomNumbersTest {

	@Test
	public void testRandomNumbers() {
		PyramidGame game = new PyramidGame();
		game.createPyramid();
		game.createRandomNumbers();
		if (game.getDifficulty() == 1) {
			int[] pyramid = game.getPyramid();
			for (int i = 0; i < 4; i++) {
				if (pyramid[i] < 1 || pyramid[i] > 50) {
					fail("No numbers created in array");
				}
			}
			for (int i = 4; i < pyramid.length; i++) {
				if(pyramid[i] != 0){
					fail("Rest of array should be zero!");
				}
			}
		} else if (game.getDifficulty() == 2) {
			int[] pyramid = game.getPyramid();
			for (int i = 0; i < 8; i++) {
				if (pyramid[i] < 1 || pyramid[i] > 50) {
					fail("No numbers created in array");
				}
			}
			for (int i = 8; i < pyramid.length; i++) {
				if(pyramid[i] != 0){
					fail("Rest of array should be zero!");
				}
			}
			
		} else {
			int[] pyramid = game.getPyramid();
			for (int i = 0; i < 16; i++) {
				if (pyramid[i] < 1 || pyramid[i] > 50) {
					fail("No numbers created in array");
				}
			}
			for (int i = 16; i < pyramid.length; i++) {
				if(pyramid[i] != 0){
					fail("Rest of array should be zero!");
				}
			}
		}
	}
}
