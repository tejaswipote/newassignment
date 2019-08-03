package javanio;

import java.io.IOException;
import java.util.Scanner;

public class FileNIO {

	public static void main(String[] args) throws IOException {
		System.out.println("MENU \n1.List all files \n2.Apply filters \n3.Read using IO \n4.Read using NIO");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		FileRead fr = new FileRead();
		switch (choice) {
		case 1:

			fr.readFiles("c:\\Assignment1");
			break;
		case 2:
			System.out.println("Enter filter");
			String pattern = sc.next();
			fr.applyFilters("c:\\Assignment1", pattern);
			break;
		case 3:
			fr.readUsingIO("c:\\Assignment1\\tej.txt");
			break;
		case 4:
			fr.readUsingNIO("c:\\Assignment1\\tej.txt");
			break;
		default:
			System.out.println("Enter correct choice");
		}

	}

}
