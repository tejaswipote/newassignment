package carrom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tejaswi.pote
 *
 */
public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Integer> player1EachTurnScore = new ArrayList<>();
		List<Integer> player2EachTurnScore = new ArrayList<>();
		Points point = new Points();
		point.calculatePoints(player1EachTurnScore, player2EachTurnScore);

	}

}
