package collectionclass;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Album;
import classes.Library;
import classes.Song;

public class DataCollection {

	public void addData(LibraryCollection collection) {

		collection.libraries.add(new Library("Library3"));
		collection.libraries.add(new Library("Library1"));
		collection.libraries.add(new Library("Library2"));

		List<Song> song = new ArrayList<>();

		song.add(new Song("Song1", "Ajay-Atul", Date.valueOf("2010-1-3"), "3 idiots"));
		song.add(new Song("Song2", "Ajay-Atul", Date.valueOf("2011-1-3"), "3 idiots"));
		song.add(new Song("Song3", "Ajay-Atul", Date.valueOf("2012-3-3"), "3 idiots"));
		song.add(new Song("Song4", "Ajay-Atul", Date.valueOf("2013-1-3"), "3 idiots"));
		song.add(new Song("Song5", "Ajay-Atul", Date.valueOf("2014-1-3"), "3 idiots"));
		song.add(new Song("Song6", "Ajay-Atul", Date.valueOf("2015-1-3"), "3 idiots"));
		song.add(new Song("Song7", "Ajay-Atul", Date.valueOf("2016-1-3"), "3 idiots"));
		song.add(new Song("Song8", "Ajay-Atul", Date.valueOf("2017-1-3"), "3 idiots"));
		song.add(new Song("Song9", "Ajay-Atul", Date.valueOf("2018-1-3"), "3 idiots"));
		song.add(new Song("Song10", "Ajay-Atul", Date.valueOf("2019-1-3"), "3 idiots"));
		song.add(new Song("Song11", "Ajay-Atul", Date.valueOf("2020-1-3"), "3 idiots"));
		song.add(new Song("Song12", "Ajay-Atul", Date.valueOf("2021-1-3"), "3 idiots"));
		song.add(new Song("Song13", "Ajay-Atul", Date.valueOf("2022-1-3"), "3 idiots"));
		song.add(new Song("Song14", "Ajay-Atul", Date.valueOf("2023-1-3"), "3 idiots"));
		song.add(new Song("Song15", "Ajay-Atul", Date.valueOf("2024-1-3"), "3 idiots"));
		song.add(new Song("Song16", "Ajay-Atul", Date.valueOf("2025-1-3"), "3 idiots"));
		song.add(new Song("Song17", "Ajay-Atul", Date.valueOf("2026-1-3"), "3 idiots"));
		song.add(new Song("Song18", "Ajay-Atul", Date.valueOf("2027-1-3"), "3 idiots"));
		song.add(new Song("Song19", "Ajay-Atul", Date.valueOf("2028-1-3"), "3 idiots"));
		song.add(new Song("Song20", "Ajay-Atul", Date.valueOf("2029-1-3"), "3 idiots"));
		song.add(new Song("Song21", "Ajay-Atul", Date.valueOf("2030-1-3"), "3 idiots"));
		song.add(new Song("Song22", "Ajay-Atul", Date.valueOf("2031-1-3"), "3 idiots"));
		song.add(new Song("Song23", "Ajay-Atul", Date.valueOf("2032-1-3"), "3 idiots"));
		song.add(new Song("Song24", "Ajay-Atul", Date.valueOf("2033-1-3"), "3 idiots"));
		song.add(new Song("Song25", "Ajay-Atul", Date.valueOf("2034-1-3"), "3 idiots"));
		song.add(new Song("Song26", "Ajay-Atul", Date.valueOf("2035-1-3"), "3 idiots"));
		song.add(new Song("Song27", "Ajay-Atul", Date.valueOf("2036-1-3"), "3 idiots"));
		Collections.sort((List<Song>) song);

		List<Library> libraries = new ArrayList<>();
		collection.libraries.get(0).album.add(new Album("Album1"));
		collection.libraries.get(0).album.add(new Album("Album2"));
		collection.libraries.get(0).album.add(new Album("Album3"));
		collection.libraries.get(1).album.add(new Album("Album5"));
		collection.libraries.get(1).album.add(new Album("Album4"));
		collection.libraries.get(1).album.add(new Album("Album6"));
		collection.libraries.get(2).album.add(new Album("Album7"));
		collection.libraries.get(2).album.add(new Album("Album8"));
		collection.libraries.get(2).album.add(new Album("Album9"));

		collection.libraries.get(0).album.get(0).song.add(song.get(0));
		collection.libraries.get(0).album.get(0).song.add(song.get(1));
		collection.libraries.get(0).album.get(0).song.add(song.get(2));

		collection.libraries.get(0).album.get(1).song.add(song.get(3));
		collection.libraries.get(0).album.get(1).song.add(song.get(4));
		collection.libraries.get(0).album.get(1).song.add(song.get(5));

		collection.libraries.get(0).album.get(2).song.add(song.get(6));
		collection.libraries.get(0).album.get(2).song.add(song.get(7));
		collection.libraries.get(0).album.get(2).song.add(song.get(8));

		collection.libraries.get(1).album.get(0).song.add(song.get(9));
		collection.libraries.get(1).album.get(0).song.add(song.get(10));
		collection.libraries.get(1).album.get(0).song.add(song.get(11));

		collection.libraries.get(1).album.get(1).song.add(song.get(12));
		collection.libraries.get(1).album.get(1).song.add(song.get(13));
		collection.libraries.get(1).album.get(1).song.add(song.get(14));

		collection.libraries.get(1).album.get(2).song.add(song.get(15));
		collection.libraries.get(1).album.get(2).song.add(song.get(16));
		collection.libraries.get(1).album.get(2).song.add(song.get(17));

		collection.libraries.get(2).album.get(0).song.add(song.get(18));
		collection.libraries.get(2).album.get(0).song.add(song.get(19));
		collection.libraries.get(2).album.get(0).song.add(song.get(20));

		collection.libraries.get(2).album.get(1).song.add(song.get(21));
		collection.libraries.get(2).album.get(1).song.add(song.get(22));
		collection.libraries.get(2).album.get(1).song.add(song.get(23));

		collection.libraries.get(2).album.get(2).song.add(song.get(24));
		collection.libraries.get(2).album.get(2).song.add(song.get(25));
		collection.libraries.get(2).album.get(2).song.add(song.get(26));

	}

}
