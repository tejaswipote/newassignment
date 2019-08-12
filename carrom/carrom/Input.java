package carrom;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Input {
	private static final Logger LOGGER = Logger.getLogger(Input.class.getName());;

	void displayOption() {

		LOGGER.info( "Welcome and Enjoy the Carrom.....");
		LOGGER.info( "1. Strike");
		LOGGER.info( "2. Multistrike");
		LOGGER.info( "3. Redstrike");
		LOGGER.info( "4. Stikerstrike");
		LOGGER.info( "5. Defunction");
		LOGGER.info( "6. None");
	}

	public void takeTurnInput(List<Integer> player1, List<Integer> player2) {
		Scanner sc = new Scanner(System.in);
		displayOption();
		int r = 1, b = 9;
		while (r != 0 || b != 0) {
			LOGGER.info( "player1>");
			int score1 = sc.nextInt();
			player1.add(score1);
			if (score1 == 1 || score1 == 5) {
				b--;
			} else if (score1 == 3) {
				r--;
			}
			LOGGER.info( "player2>");
			int score2 = sc.nextInt();
			player2.add(score2);
			if (score2 == 1 || score2 == 5) {
				b--;
			} else if (score2 == 3) {
				r--;
			}

		}
	}

}
