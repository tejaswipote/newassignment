package com.global.EmployeeHibernate;

import java.util.Scanner;



/**
 * @author tejaswi.pote
 *
 */
public class App {
	public static void main(String[] args) {

		HibernateOperation operation = new HibernateOperation();
		operation.displayMenu();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case OperationConstants.INSERT:
			operation.insert();
			break;
		case OperationConstants.DELETE:
			operation.delete();
			break;
		case OperationConstants.FIND:
			operation.find();
			break;
		case OperationConstants.UPDATE:
			operation.update();
			break;
		default:
			System.out.println("wrong Input");

		}

	}
}
