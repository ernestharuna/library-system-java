public class Magazine extends Library {
    private String journalist;

    public Magazine(String journalist, String publisher, String title, int item_id, int year) {
        super(publisher, title, item_id, year);
        this.journalist = journalist;
    }

    public String getJournalist() {
        return this.journalist;
    }

    public void check_in() {
        System.out.println("A Magazine was returned");
    }

    public void check_out() {
        System.out.println("A Magazine was taken");
    }

    public String toString() {
        return "Welcome to the Magazines Shelve";
    }
}
