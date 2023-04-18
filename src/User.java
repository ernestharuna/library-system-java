import java.util.ArrayList;

public class User {
    private String name;
    private int user_id;
    private ArrayList<Integer> borrow_history;

    public User(String name_1, int id) {
        this.name = name_1;
        this.user_id = id;
        this.borrow_history = new ArrayList<>();
    }

    public void borrow_resource(Library resource) {
        borrow_history.add(resource.item_id);
        resource.check_out();
    }

    public void return_resource(int res_num, Library resource) {
        int index = borrow_history.indexOf(res_num);
        borrow_history.remove(index);
        resource.check_in();
    }

    public ArrayList<Integer> get_history() {
        if (borrow_history.isEmpty()) {
            System.out.println(borrow_history);
            return new ArrayList<Integer>();
        } else {
            System.out.println("You have borrowed these books " + borrow_history);
            return borrow_history;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public String toString() {
        return "Welcome " + name + " your user ID is " + user_id;
    }
}
