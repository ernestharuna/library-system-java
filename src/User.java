import java.util.ArrayList;

public class User {
    private String first_name;
    private String last_name;
    private ArrayList<Library> borrow_history;

    public User(String name_1, String name_2) {
        this.first_name = name_1;
        this.last_name = name_2;
        this.borrow_history = new ArrayList<>();
    }

    // add borrowed item to array & call check_out function
    public void borrow_item(Library item) {
        borrow_history.add(item);
        item.check_out();
    }

    // remove borrowed item from array & call check_in function
    public void return_item(Library item) {
        borrow_history.remove(item);
        item.check_in();
    }

    public ArrayList<Library> getHistory() {
        return borrow_history;
    }
}
