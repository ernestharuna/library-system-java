abstract class Library {
    // features || attributes
    protected String publisher;
    protected String title;
    protected int year;
    protected int item_id;

    public Library(String publisher, String title, int item_id, int year) {
        this.publisher = publisher;
        this.title = title;
        this.year = year;
        this.item_id = item_id;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public int getItem_id() {
        return this.item_id;
    }

    // abstract methods
    public abstract String toString();

    public void check_in() {
        System.out.println("Something was returned");
    };

    public void check_out() {
        System.out.println("Something was borrowed");
    };
}
