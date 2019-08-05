package sortingalgorithm;

import java.util.Arrays;

import sortingpackage.ISort;

public class QuickSort implements ISort {

	public void sort(Integer[] arr) {
		long start = System.nanoTime();
		System.out.println("Using Quick sort....");

		int size = arr.length;
		for (int i = 0; i < size - 1; i++)
			for (int j = 0; j < size - i - 1; j++)
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		long end = System.nanoTime();
		final long total = end - start;
		ISort.printArray(Arrays.asList(arr));
		System.out.println(" Execution time :" + total);
	}

}
