package javanio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileRead {
	void readFiles(String directory) throws IOException {
		Path path = Paths.get(directory);
		Stream<Path> list = Files.list(path);
		list.forEach(System.out::println);
	}

	void applyFilters(String directory, String pattern1) throws IOException {

		System.out.println("After applying filter....");
		Path path = Paths.get(directory);
		String pattern = pattern1;
		File file = Paths.get(directory).toFile();
		Stream.of(file.list((pFile, pString) -> pString.endsWith(pattern))).forEach(System.out::println);

	}

	void readUsingIO(String fileName) throws IOException {
		long start = System.nanoTime();
		BufferedReader fr = new BufferedReader(new FileReader(fileName));
		String str = fr.readLine();
		while (str != null) {
			System.out.println(str);
			str = fr.readLine();
		}
		long end = System.nanoTime();
		long total = end - start;
		System.out.println(total);
		fr.close();

	}

	void readUsingNIO(String fileName) {
		long start = System.nanoTime();

		Path path = Paths.get(fileName);
		try (Stream<String> stream = Files.lines(path)) {

			stream.forEach(System.out::println);

		} catch (IOException ex) {
			ex.printStackTrace(); // handle an exception here
		}
		long end = System.nanoTime();
		long total = end - start;
		System.out.println(total);
	}

}
