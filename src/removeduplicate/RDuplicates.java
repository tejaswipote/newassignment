package removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array = new ArrayList<>(Arrays.asList(4, 5, 6, 4, 5, 6));
		List<Integer> result = array.stream().distinct().collect(Collectors.toList());
		System.out.println("After Removing duplicates using distinct method...");
		result.forEach(System.out::println);

		System.out.println("After Sorting:");
		array = result.stream().sorted().collect(Collectors.toList());
		array.forEach(System.out::println);
	}

}
