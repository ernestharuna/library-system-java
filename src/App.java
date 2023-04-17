public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");
        User user = new User("Ernest", 0);

        System.out.println(user);

        user.borrow_resource(null);
    }
}