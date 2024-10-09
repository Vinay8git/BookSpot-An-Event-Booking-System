public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        User user1 = new User("Rosy", "Rosy@gmial.com");
        User user2 = new User("Roxie", "Roxie@g.ac.in");

        System.out.println(user1.getName());
        System.out.println(user2.getName());
    }
}
