package jdbcmain;

import java.sql.SQLException;
import java.util.Scanner;


import jdbcapplication.*;
public class JdbcExecutor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Operation jdbcOperation=new Operation();
		
		jdbcOperation.displayOption();
		System.out.println("Enter option");
		int choice = sc.nextInt();
		jdbcOperation.performOperation(choice);
		
				}


	}


