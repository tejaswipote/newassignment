package collectionclass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import classes.*;

public class LibraryCollection {
		public List<Library> libraries = new ArrayList<Library>();
		
		
		
		public void printLibraries() {
			// TODO Auto-generated method stub
			
			System.out.println("Enter choice for Library 1 2 3");
			Collections.sort((List<Library>) libraries);
			libraries.stream().forEach(library->System.out.println(library.getName()) );
				Scanner scanner=new Scanner(System.in);
					
				
				int choice = scanner.nextInt();
				libraries.get(choice-1).showAlbums();
					
				
		}

		
		

}
