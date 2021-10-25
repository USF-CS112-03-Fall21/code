import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookstoreExample {
	public static void main(String[] args) {
		Bookstore store  = new Bookstore();
		store.addBook("Harry Potter", "Rowling");
		store.addBook("Lord of the Rings", "Tolkien");
		store.addBook("Hobbit", "Tolkien");

		
		Iterator<Book> it = store.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		

		
		 
	}
}
