public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("Ernest", 456); // User Instance
        System.out.println(user); // New User assigned

        // Sample Operations
        Book res = new Book("Ben Carson", "ABU_DLC", "How to get rich", 137, 2014); // Book Instance
        Magazine msg = new Magazine("Forbes", "New York Times", "Richest Men", 1483, 2023);
        user.borrow_resource(res); // Borrow a book
        user.borrow_resource(msg); // Borrow a Magazine

        user.get_history(); // Check the user's history

        user.return_resource(137, res); // Return a book
        user.get_history(); // Check the user's history
    }
}