package carrom;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		List<String> player1Strikes = new ArrayList<>();
//		List<String> player2Strikes = new ArrayList<>();
//
//		
//		Player player1=new Player("Ram");
//		player1.ReadInput("src/data/player1.txt",player1Strikes);
//		Player player2=new Player("Shyam");
//		player2.ReadInput("src/data/player2.txt",player2Strikes);
		
		
		// TODO Auto-generated method stub
		List<Integer> player1 = new ArrayList<>();
		List<Integer> player2 = new ArrayList<>();
		player1.add(3);
		player1.add(1);
		player1.add(6);
		player1.add(1);
		player1.add(6);
		player1.add(2);
		player1.add(6);
		player1.add(4);
		player1.add(5);
		player1.add(1);
		player1.add(6);
		player1.add(6);
		
	
		
		
		player2.add(1);
		player2.add(6);
		player2.add(6);
		player2.add(6);
		player2.add(1);
		player2.add(6);
		player2.add(1);
		player2.add(6);
		player2.add(1);
		player2.add(6);
		player2.add(6);
		player2.add(1);
		
		Points point=new Points();
		point.calculatePoints(player1, player2);
		
		
}

}
