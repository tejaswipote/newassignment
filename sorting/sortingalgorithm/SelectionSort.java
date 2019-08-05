package sortingalgorithm;

import java.util.Arrays;

import sortingpackage.ISort;

public class SelectionSort implements ISort {

	public void sort(Integer[] arr) {
		long start = System.nanoTime();

		System.out.println("Using Selection sort....");

		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			// minimum element in array
			int min = i;
			for (int j = i + 1; j < len; j++)
				if (arr[j] < arr[min])
					min = j;

			// Swap minimum element with the first element
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

		long end = System.nanoTime();
		long total = end - start;
		ISort.printArray(Arrays.asList(arr));
		System.out.println(" Execution time :" + total);

	}

}
