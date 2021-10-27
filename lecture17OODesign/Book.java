
/** Class Book represents a book in the library catalog */
public class Book {
    private String title;
    private String author;
    private int year;
    private double avgRating; // average goodreads rating
    private boolean isCheckedOut; // whether or not it is currently checked out


    /**
     * Constructor of class Book
     * @param title title of the book
     * @param author author of the book
     * @param year year when the book was first published
     * @param avgRating average rating on goodreads
     */
    public Book(String title, String author, int year,
                double avgRating){
        this.title = title;
        this.author = author;
        this.year = year;
        this.avgRating = avgRating;
    }

    /**
     * Return true if the book is currently checked out
     * and false otherwise.
     * @return value of boolean variable isCheckedOut
     */
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    /**
     * Return the title of the book
     * @return title
     */
    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    /** Return average rating of the book from goodreads
     *
     * @return average rating
     */
    public double getAverageRating() {
        return avgRating;
    }

    /**
     * Check out the book if it is available,
     * by updating isCheckedOut variable.
     * If the book is not available (checked out), return false
     * @return true if was able to checkout the book, and false otherwise
     */
    public boolean checkoutBook() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            return true;
        }

        return false; // change as needed
    }

    /**
     * Return the book if it is currently checked out, return true.
     * If the book is not checked out (can not return), return false
     * @return true if was able to return a book, false otherwise
     */
    public boolean returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            return true;
        }

        return false; // change as needed
    }

    /** Return a string with the information about the book
     * in the following format:
     * (title; author; year; averageRating)
     * @return string representation of the book
     */
    public String toString() {
        return title + ", " + author + ", " + year;
    
    }
}
