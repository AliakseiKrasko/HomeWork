package HomeWork;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();
        
        // Используем интерфейс Saver для сохранения данных (DIP)
        Saver persister = new Persister(user);
        persister.save();
    }
}
