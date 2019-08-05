package classes;

import java.sql.Date;

public class Song implements Comparable<Song> {
	private String name;
	private String singer;
	private Date dateofrelease;
	private String movie;

	/**
	 * @param name
	 * @param singer
	 * @param dateofrelease
	 * @param movie
	 */
	public Song(String name, String singer, Date dateofrelease, String movie) {
		this.name = name;
		this.singer = singer;
		this.dateofrelease = dateofrelease;
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "name=" + name + ", singer=" + singer + ", dateofrelease=" + dateofrelease + ", Movie=" + movie + "";
	}

	@Override
	public int compareTo(Song song) {
		return this.dateofrelease.compareTo(song.dateofrelease);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @return the dateofrelease
	 */
	public Date getDateofrelease() {
		return dateofrelease;
	}

	/**
	 * @return the movie
	 */
	public String getMovie() {
		return movie;
	}

}
