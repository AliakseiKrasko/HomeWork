package HomeWork;

// Класс User теперь только управляет данными пользователя (SRP)
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void report() {
        System.out.println("User " + name);
    }
}
