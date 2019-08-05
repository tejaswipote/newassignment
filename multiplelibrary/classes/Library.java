package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library implements Comparable<Library> {
	private String name;
	public List<Album> album = new ArrayList<>();

	/**
	 * @param name
	 */
	public Library(String name) {

		this.name = name;
	}

	@Override
	public int compareTo(Library library) {
		return this.name.compareTo(library.name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public void showAlbums() {
		// TODO Auto-generated method stub
		System.out.println("Enter choice for Album 1 2 3");
		album.stream().forEach(album -> System.out.println(album.getName()));
		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();
		album.get(choice - 1).showSongs();

	}

}
