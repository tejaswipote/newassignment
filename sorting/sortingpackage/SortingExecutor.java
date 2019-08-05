package sortingpackage;

import sortingalgorithm.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SortingExecutor {
	static Scanner sc = new Scanner(System.in);

	static void takeInput(ArrayList<Integer> array) {

		System.out.println("Enter Number of element in array ");

		int elements = sc.nextInt();
		System.out.println("Enter array elements");
		int i = 0;
		while (i != elements) {
			array.add(sc.nextInt());
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		takeInput(array);
		System.out.println("Enter Choice to sort");
		System.out.println("1.Quicksort");
		System.out.println("2.Selectionsort");
		int choice = sc.nextInt();

		Integer[] arr = array.toArray(new Integer[0]);
		switch (choice) {
		case ISort.QUICKSORT:
			QuickSort quick = new QuickSort();
			quick.sort(arr);
			break;
		case ISort.SELECTIONSORT:
			SelectionSort selection = new SelectionSort();
			selection.sort(arr);
			break;
		default:
			System.out.println("Enter Correct choice");
		}

	}
}