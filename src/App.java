public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("Ernest", 456); // User Instance
        System.out.println(user); // New User assigned

        Book res = new Book("Ernest", "ABU_DLC", "How to get rich", 137, 2014); // Book Instance
        user.borrow_resource(res); // Borrow a book
        user.borrow_resource(res); // Borrow a book
        user.borrow_resource(res); // Borrow a book
        user.get_history();
        // user.return_resource(137, res);
    }
}