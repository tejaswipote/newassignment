package carrom;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Points {
	private static final Logger LOGGER = Logger.getLogger(Points.class.getName());
	Scanner sc = new Scanner(System.in);
	Player firstPlayer, secondPlayer;

	int point;
	int blackCoin = 9;
	int redCoin = 1;
	int foul;
	int turn = 0;
	int countRed = 1;

	public int getScore(List<Integer> player1) {

		point = 0;
		switch (player1.get(turn)) {
		case InputConstants.STRIKE:
			point++;
			blackCoin--;
			foul = 0;
			break;
		case InputConstants.MULTISRIKE:
			point = point + 2;
			foul = 0;
			break;
		case InputConstants.REDSTRIKE:
			point = point + 3;
			foul = 0;
			redCoin = 0;
			countRed = 0;
			break;
		case InputConstants.STIKERSTRIKE:
			point = point - 1;
			foul = 0;
			break;
		case InputConstants.DEFUNCTCOIN:
			point = point - 2;
			int result = 0;
			ABC: while (result != 1) {
				LOGGER.info("1. red  2. black");
				int defunctionInput = sc.nextInt();
				if (defunctionInput == 1) {

					redCoin = 0;
					if (countRed != 1) {
						LOGGER.info("wrong input.. red already used.");
						continue ABC;

					}

					result = 1;
					countRed = 0;
				} else if (defunctionInput == 2) {
					blackCoin--;
					result = 1;
				} else {
					LOGGER.info("Enter correct input..");
					continue ABC;
				}

			}

			foul = 0;

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
		LOGGER.info("Enter player1 Name");
		firstPlayer = new Player(sc.nextLine());
		LOGGER.info("Enter player2 Name");

		secondPlayer = new Player(sc.nextLine());
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

		int point1 = 0;
		int point2 = 0;
		int result = 0;
		int score1 = 0;
		int correctInput;
		while (redCoin != 0 || blackCoin != 0) {

			LOGGER.info("player1>");
			score1 = sc.nextInt();
			if (score1 == 3 && countRed != 1) {
				LOGGER.info("wrong input.. red already used.");
				continue;

			}

			player1.add(score1);

			point1 = point1 + getScore(player1);

			if (point1 >= 5 && Math.abs(point1 - point2) >= 3) {
				LOGGER.info("player1 won... Congratulation " + firstPlayer.getName());
				result++;
				break;
			}

			int score2 = 0;
			correctInput = 1;
			bc: while (correctInput == 1) {
				LOGGER.info("player2>");
				score2 = sc.nextInt();

				if (score2 == 3 && countRed != 1) {
					LOGGER.info("wrong input.. red already used.");
					continue bc;

				} else
					correctInput = 0;
			}
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