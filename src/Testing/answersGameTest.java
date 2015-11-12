package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import TheGame.PyramidGame;

public class answersGameTest {

	@Test
	public void solutionGameTest() {
		PyramidGame game = new PyramidGame();
		int difficulty = game.getDifficulty();
		int[] expected;
		if (difficulty == 1) {
			game.completePyramid(new int[] { 1, 2, 3, 4 });
			expected = new int[] { 1, 2, 3, 4, 3, 5, 7, 8, 12, 20 };
		} else if (difficulty == 2) {
			game.completePyramid(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
			expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 3, 5, 7, 9, 11, 13, 15, 8, 12, 16, 20, 24, 28, 20, 28, 36,
					44, 52, 48, 64, 80, 96, 112, 144, 176, 256, 320, 576 };
		} else {
			game.completePyramid(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 });
			expected = new int[] { 
					1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
					3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31,
					8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60,
					20, 28, 36, 44, 52, 60, 68, 76, 84, 92, 100, 108, 116,
					48, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224,
					112, 144, 176, 208, 240, 272, 304, 336, 368, 400, 432,
					256, 320, 384, 448, 512, 576, 640, 704, 768, 832,
					576, 704, 832, 960, 1088, 1216, 1344, 1472, 1600,
					1280, 1536, 1792, 2048, 2304, 2560, 2816, 3072,
					2816, 3328, 3840, 4352, 4864, 5376, 5888,
					6144, 7168, 8192, 9216, 10240, 11264,
					13312, 15360, 17408, 19456, 21504,
					28672, 32768, 36864, 40960, 
					61440, 69632, 77824, 
					131072, 147456, 
					278528 };
		}

		int[] result = game.getPyramid();

		for (int i = 0; i < result.length; i++)
			assertEquals(expected[i], result[i]);
	}

}
