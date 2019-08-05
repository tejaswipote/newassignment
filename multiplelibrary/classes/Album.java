package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Album implements Comparable<Album> {
	private String name;
	public List<Song> song = new ArrayList<>();

	/**
	 * @param name
	 */
	public Album(String name) {

		this.name = name;
	}

	@Override
	public int compareTo(Album album) {
		return this.name.compareTo(album.name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public void showSongs() {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		song.stream().forEach(song -> System.out.println(song.toString()));

	}
}
