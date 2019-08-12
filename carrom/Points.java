package carrom;

import java.util.List;
import java.util.Scanner;

public class Points extends Input {
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
		default:
			System.out.println("Enter");

		}
		return point;
	}

	void calculatePoints(List<Integer> player1, List<Integer> player2) {
		Player firstPlayer = new Player("ram");
		Player secondPlayer = new Player("Shyam");

		int point1 = 0;
		int point2 = 0;

		takeTurnInput(player1, player2);

		while (red != 0 || black != 0) {

			point1 = point1 + getScore(player1);
			point2 = point2 + getScore(player2);

			turn++;
		}

		System.out.println(point1);
		System.out.println(point2);

		if (point1 >= 5 && Math.abs(point1 - point2) >= 3) {

			System.out.println("player1 won... Congratulation " + firstPlayer.getName());

		}

		else if (point2 >= 5 && point2 - point1 >= 3) {

			System.out.println("player2 won... congratulation " + secondPlayer.getName());

		} else
			System.out.println("Its draw....");

	}

}
