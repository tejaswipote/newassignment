package carrom;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Points {
	private static final Logger LOGGER = Logger.getLogger(Points.class.getName());;
	int point;
	int black = 9;
	int red = 1;
	int foul;
	int turn = 0;

	public int getScore(List<Integer> player1) {

		point = 0;
		switch (player1.get(turn)) {
		case InputConstants.STRIKE:
			point++;
			black--;
			foul = 0;
			break;
		case InputConstants.MULTISRIKE:
			point = point + 2;
			foul = 0;
			break;
		case InputConstants.REDSTRIKE:
			point = point + 3;
			foul = 0;
			red--;
			break;
		case InputConstants.STIKERSTRIKE:
			point = point - 1;
			foul = 0;
			break;
		case InputConstants.DEFUNCTCOIN:
			point = point - 2;
			foul = 0;
			black--;
			break;
		case InputConstants.NONE:
			foul = foul + 1;
			if (foul == 3) {
				point--;
				foul = 0;

			}
			break;

		}
		return point;
	}

	void displayOption() {

		LOGGER.info("Welcome and Enjoy the Carrom.....");
		LOGGER.info("1. Strike");
		LOGGER.info("2. Multistrike");
		LOGGER.info("3. Redstrike");
		LOGGER.info("4. Stikerstrike");
		LOGGER.info("5. Defunction");
		LOGGER.info("6. None");
	}

	void calculatePoints(List<Integer> player1, List<Integer> player2) {

		displayOption();
		Player firstPlayer = new Player("ram");
		Player secondPlayer = new Player("Shyam");

		int point1 = 0;
		int point2 = 0;
		int result = 0;

		while (red != 0 &&  black != 0) {
			Scanner sc = new Scanner(System.in);

			LOGGER.info("player1>");
			int score1 = sc.nextInt();
			player1.add(score1);
			point1 = point1 + getScore(player1);
			if (point1 >= 5 && Math.abs(point1 - point2) >= 3) {

				LOGGER.info("player1 won... Congratulation " + firstPlayer.getName());
				result++;
				break;
			}

			LOGGER.info("player2>");
			int score2 = sc.nextInt();
			player2.add(score2);

			point2 = point2 + getScore(player2);
			if (point2 >= 5 && point2 - point1 >= 3) {

				LOGGER.info("player2 won... congratulation " + secondPlayer.getName());
				result++;
				break;
			}

			turn++;
		}

		if (result == 0) {
			LOGGER.info("Its draw....");
		}

	}

}
