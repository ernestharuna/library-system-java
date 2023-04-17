public class Book extends Library {
    private String author;

    public Book(String title, String publisher, int year, String author) {
        super(title, publisher, year);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void check_in() {
    }

    public void check_out() {
    }

    public String toString() {
        return "Welcome to the Book Shelve";
    }
}
