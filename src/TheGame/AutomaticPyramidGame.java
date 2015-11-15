package TheGame;

import java.util.Scanner;

public class AutomaticPyramidGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean stop = false, askAgain = false;
		do {
			PyramidGame game = new PyramidGame();
			game.play();
			do {
				System.out.print("Do you want to play again? (yes/no) ");
				String line = scanner.nextLine();
				if (line.length() <= 3) {
					if (line.compareToIgnoreCase("yes") == 0)
						askAgain = false;
					else if (line.compareToIgnoreCase("no") == 0)
						stop = true;
				} else
					askAgain = true;
			} while (askAgain);
		} while (!stop);
		System.out.println("Thank you for playing :)");
	}
}
