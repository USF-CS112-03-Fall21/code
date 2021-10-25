import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bookstore implements Iterable<Book> {
	private List<Book> books;
	
	public Bookstore() {
		books  = new ArrayList<Book>();
	}
	
	public void addBook(String title, String author) {
		Book b = new Book(title, author);
		books.add(b);
	}
	
	public Book findBook(String title) {
		for (Book b: books) {
			if (b.getTitle().equals(title))
				return b;
		}
		return null;
	}
	

	@Override
	public Iterator<Book> iterator() {
		return books.iterator();
	}
	
}
