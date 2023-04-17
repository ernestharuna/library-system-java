abstract class Library {
    // features || attributes
    private String author;
    private String publisher;
    private int item_code;
    private int year;

    public Library(String check_in, String check_out, int item_code) {
        this.author = check_in;
        this.publisher = check_out;
        this.item_code = item_code;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int item_code() {
        return item_code;
    }

    public int getYear() {
        return this.year;
    }

    // abstract methods
    public abstract String toString();

    public abstract void check_in();

    public abstract void check_out();
}
