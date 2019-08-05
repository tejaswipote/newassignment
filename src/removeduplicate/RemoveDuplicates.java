package removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.LinkedHashSet;
import java.util.List;;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 8, 9, 9, 5, 1));
		Set<Integer> result = new LinkedHashSet<>();
		result.addAll(array);
		System.out.println("Removing Duplicates using LinkedHashSet");
		// result.forEach(System.out::println);

		array.clear();
		array.addAll(result);
		array.forEach(System.out::println);

		System.out.println("After Sorting:");
		array = result.stream().sorted().collect(Collectors.toList());
		array.forEach(System.out::println);
	}

}
