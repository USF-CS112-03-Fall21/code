import java.util.*;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		LibraryCatalogWithList lc = new LibraryCatalogWithList();
		Book b1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 4.34);
		Book b2 = new Book("The Hobbit or There and Back Again", "J.R.R. Tolkien", 1937, 4.25);
		Book b3 = new Book("The Kite Runner", "Khaled Hosseini", 2003, 4.26);

		lc.addBook(b1);
		lc.addBook(b2);
		lc.addBook(b3);
		System.out.println("The catalog: ");
		System.out.println(lc);

		/*List<Book> booksFromCatalog = lc.getBooks1();
		booksFromCatalog.clear(); // we erased all the books
		System.out.println("The catalog: ");
		System.out.println(lc);*/

		/*List<Book> booksFromCatalog = lc.getBooks2(); // creates a shallow copy of the list
		booksFromCatalog.clear(); // this will not clear the catalog now
		System.out.println("The catalog: ");
		System.out.println(lc);
		//Book b = booksFromCatalog.get(0);
		//b.checkoutBook(); // this will modify the catalog by checking out a book (note: we are able to do it without using lc -- not good)
		// System.out.println("Available books in the catalog: ");
		// System.out.println(lc.getAvailableBooks()); */

		/*List<Book> booksFromCatalog = lc.getBooks3(); // creates a deep copy of the list
		Book b = booksFromCatalog.get(0);
		b.checkoutBook(); // this will modify the catalog by checking out a book (note: we are able to do it without using lc -- not good)
		System.out.println("Available books in the catalog: ");
		System.out.println(lc.getAvailableBooks()); */


		List<Book> booksFromCatalog = lc.getBooks4(); // returns unmodifiable list
		booksFromCatalog.clear(); // this will not clear the catalog now
		System.out.println("The catalog: ");
		System.out.println(lc);
		//Book b = booksFromCatalog.get(0);
		//b.checkoutBook(); // this will modify the catalog by checking out a book (note: we are able to do it without using lc -- not good)
		//System.out.println("Available books in the catalog: ");
		//System.out.println(lc.getAvailableBooks());
	}


}