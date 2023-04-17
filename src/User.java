import java.util.ArrayList;

public class User {
    private String name;
    private int user_id;
    private ArrayList<Library> borrow_history;

    public User(String name_1, int id) {
        this.name = name_1;
        this.user_id = id;
        this.borrow_history = new ArrayList<>();
    }

    public void borrow_resource(Library resource) {
        borrow_history.add(resource);
        resource.check_out();
    }

    public void return_resource(Library resource) {
        borrow_history.remove(resource);
        resource.check_in();
    }

    public ArrayList<Library> get_history() {
        return borrow_history;
    }

    public String getName() {
        return this.name;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public String toString() {
        return "User name is " + name + " and user ID is " + user_id;
    }
}
