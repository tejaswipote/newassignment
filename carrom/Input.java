package carrom;

import java.util.List;
import java.util.Scanner;

public class Input {

	void displayOption() {

		System.out.println("Welcome and Enjoy the Carrom.....");
		System.out.println("1. Strike");
		System.out.println("2. Multistrike");
		System.out.println("3. Redstrike");
		System.out.println("4. Stikerstrike");
		System.out.println("5. Defunction");
		System.out.println("6. None");
	}

	public void takeTurnInput(List<Integer> player1, List<Integer> player2) {
		Scanner sc = new Scanner(System.in);
		displayOption();
		int r = 1, b = 9;
		while (r != 0 || b != 0) {
			System.out.println("player1>");
			int score1 = sc.nextInt();
			player1.add(score1);
			if (score1 == 1 || score1 == 5) {
				b--;
			} else if (score1 == 3) {
				r--;
			}
			System.out.println("player2>");
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
