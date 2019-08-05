package executor;

import classes.*;
import collectionclass.DataCollection;
import collectionclass.LibraryCollection;

/**
 * @author tejaswi.pote
 *
 */
public class LibraryExecutor {

	public static void main(String[] args) {

		LibraryCollection collection = new LibraryCollection();
		DataCollection datacollection = new DataCollection();
		datacollection.addData(collection);
		collection.printLibraries();

	}
}
