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
		
		
//		int point1 = 0, point2 = 0, count1 = 0, count2 = 0, turn = 0, foul1 = 0;
//				
//		int foul2 = 0;
//		int red = 1, black = 9;
//		while (red != 0||black != 0) {
//
//			if (player1.get(turn) == 3) {
//				red--;
//				point1 = point1 + 3;
//				foul1=0;count1=0;
//			} else if (player1.get(turn) == 1) {
//				point1 = point1 + 1;
//				black--;
//				count1++;
//				foul1=0;
//			} else if (player1.get(turn) == 0) {
//				foul1++;
//				count1=0;
//			}
//			else if (player1.get(turn) == -2) {
//				point1--;
//				count1=0;
//			}
//			else if (player1.get(turn) == -3) {
//				point1=point1-2;
//				black--;
//				count1=0;
//			}
//			
//
//			if (player2.get(turn) == 3) {
//				red--;
//				foul2=0;
//				point2 = point2 + 3;
//				count2=0;
//			} else if (player2.get(turn) == 1) {
//				count2++;
//				black--;
//				foul2=0;
//				point2 = point2 + 1;
//				count2=0;
//			} else if (player2.get(turn) == 0) {
//				foul2++;
//				count2=0;
//			}else if (player2.get(turn) == -2) {
//				point2--;
//				count2=0;
//			}
//			else if (player2.get(turn) == -2) {
//				point2=point2-2;
//				black--;
//				count2=0;
//			}
//
//			if (foul1 == 3) {
//				System.out.println("subtracting1");
//				point1--;
//				foul1 = 0;
//			}
//
//			if (foul2 == 3) {
//				System.out.println("subtrating2");
//				point2--;
//				foul2 = 0;
//				
//			}
//
//			if(count1>1)
//			{
//				System.out.println("adding1");
//			
//				black=black+count1;
//			}
//			if(count2>1)
//			{
//				System.out.println("adding2");
//				black=black+count2;
//			}
//			
//			turn++;
//		}
//
//		System.out.println(point1);
//		System.out.println(point2);
//		
//		if(point1>=5&&(point1-point2)>=3)
//		{
//			System.out.println(" player 1 wins...");
//		}
//		else if(point2>=5&&(point2-point1)>=3)
//		{
//			System.out.println(" player 2 wins...");
//		}
//		else {
//			System.out.println("its draw");
//		}
//		
		
	}

}
