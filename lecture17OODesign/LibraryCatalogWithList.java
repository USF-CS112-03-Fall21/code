import java.io.*;
import java.util.*;

/** LibraryCatalog Class - represents a collection of books,
 *  where each book can be "checked out" and "returned".
 */
public class LibraryCatalogWithList {

    private List<Book> books; // arraylist of books in the catalog

    /**
     * Constructor for LibraryCatalog
     */
    public LibraryCatalogWithList() {
        books = new ArrayList<>();
    }

    /** Adds a book to the array of books at the index = currIndex. Increment currIndex.
     *
     * @param book book to be added to the catalog
     */
    public void addBook(Book book) {
        books.add(book);

    }


    // This method breaks encapsulation! Do not use
    public List<Book> getBooks1() {
        return books;
    }

    public List<Book> getBooks2() {
        List<Book> copyList = new ArrayList<>();
        for (Book book: books) {
            copyList.add(book);
        }
        return copyList;
    }

    public List<Book> getBooks3() {
        List<Book> copyList = new ArrayList<>();
        for (Book book: books) {
            copyList.add(new Book(book.getTitle(), book.getAuthor(), book.getYear(), book.getAverageRating()));
        }
        return copyList;
    }

    public List<Book> getBooks4() {
        return Collections.unmodifiableList(books);
    }

    public Iterator<Book> iterator() {
        return books.iterator();
    }

    /**
     * Searches for the book with the given title in the array
     * "books" and returns the book. Returns null if there is no book
     *  with this title.
     * @param title title of the book
     * @return reference to the Book with the given title
     */
    public Book findBook(String title) {
        for (Book b: books) {
            if (b.getTitle().equals(title))
                return b;
        }

        return null; 
    }

    /**
     * Checks out the book with the given title from the library.
     *  First, searches for the book with the given title, and then
     * checks it out (by calling the corresponding method in class Book)
     * if it is not currently checked out. The method returns true if it
     * was able to check out the book, otherwise false.
     * @param title title of the book
     * @return true if was able to checkout a book, false otherwise
     */
    public boolean checkoutBook(String title) {
        Book b = findBook(title);
        if (b != null)
            return b.checkoutBook();

        return false; 
    }

    /**
     * Returns the book with the given title to the library. If the
     * book is in the array of books, has the matching title and is
     * currently checked out, the method is going to "return" it to the library (by
     * calling the returnBook() method of class Book.
     * @param title title of the book to return
     * @return true if was able to return the book, false otherwise
     */
    public boolean returnBook(String title) {
        Book b = findBook(title);
        if (b != null)
            return b.returnBook();

        return false; 
    }



    /**
     * Returns a String containing books that are available for checkout
     * @return string with books that are not checked out
     */
    public String getAvailableBooks() {
       StringBuilder sb = new StringBuilder();
        for (Book b: books) {
            if (!b.isCheckedOut()) 
                sb.append(b.toString() + System.lineSeparator());
        }

        return sb.toString();
    }

    /**
     * Returns a string that contains information about all books
     * from the catalog; one book per line in the same format as in
     * toString method in class Book.
     * Important: instead of adding newline character using
    *  "\n", add System.lineSeparator() - it will return the system-dependent line separator
     *
     * @return string representation of the library catalog
     */
    public String toString() {
       StringBuilder sb = new StringBuilder();
        for (Book b: books) {
            sb.append(b.toString() + System.lineSeparator());
        }

        return sb.toString();
    }

    
}
