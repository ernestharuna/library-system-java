public class Book extends Library {
    private String author;

    public Book(String author, String publisher, String title, int item_id, int year) {
        super(publisher, title, item_id, year);
        this.author = author;
    }

    public void check_in() {
        System.out.println("A book was returned");
    }

    public void check_out() {
        System.out.println("A book was taken");
    }

    public String toString() {
        return "Welcome to the Book Shelve";
    }
}
