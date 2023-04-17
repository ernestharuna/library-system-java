public class Magazine extends Library {
    private String journalist;

    public Magazine(String title, String publisher, int year, String journalist) {
        super(title, publisher, year);
        this.journalist = journalist;
    }

    public String getJournalist() {
        return this.journalist;
    }

    public void check_in() {
    }

    public void check_out() {
    }

    public String toString() {
        return "Welcome to the Magazines Shelve";
    }
}
