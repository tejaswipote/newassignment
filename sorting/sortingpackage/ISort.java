package sortingpackage;

import java.util.List;

public interface ISort {
	int QUICKSORT = 1;
	int SELECTIONSORT = 2;

	void sort(Integer[] arr);

	static void printArray(List<Integer> array) {
		array.forEach(value -> System.out.println(value));

	}

}
