package jdbcapplication;

import java.sql.SQLException;
import java.util.Scanner;

import jdbcmain.Action;

public class Operation {
	public void performOperation(int choice) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		JdbcFunctions jdbcObject = new JdbcFunctions();
		switch (choice) {
		case Action.ADDSTUDENT:
			Student student1 = new Student();

			jdbcObject.addStudent(student1);
			break;

		case Action.GETALLSTUDENT:
			jdbcObject.getAllStudent();
			break;

		case Action.SEARCHBYNAME:
			System.out.println("Enter name for search");
			sc.nextLine();
			jdbcObject.searchByName(sc.nextLine());
			break;

		case Action.SEARCHBYID:
			System.out.println("Enter ID for search");

			jdbcObject.searchById(sc.nextInt());
			break;
		case Action.SEARCHBYADDRESS:
			System.out.println("Enter address for search");
			sc.nextLine();
			jdbcObject.searchByAddress(sc.nextLine());
			break;

		case Action.UPDATEBYNAME:
			System.out.println("Enter name for update i,e old name and new name");
			sc.nextLine();
			String old = sc.nextLine();

			String newname = sc.nextLine();
			jdbcObject.updateByName(old, newname);
			break;

		case Action.DELETEBYID:
			System.out.println("Enter id for delete");
			jdbcObject.deleteById(sc.nextInt());
			break;
		case Action.DELETEALLSTUDENT:

			jdbcObject.deleteAllStudent();
			break;
		default:
			System.out.println("Enter Correct choice....");

		}
	}

	public void displayOption() {
		System.out.println("1. Add new student");
		System.out.println("2. List all student");
		System.out.println("3. Search student by name");
		System.out.println("4. Search by id");
		System.out.println("5. Search by address");
		System.out.println("6. update name");
		System.out.println("7. Delete student by id");
		System.out.println("8. Delete all student");
	}

}
