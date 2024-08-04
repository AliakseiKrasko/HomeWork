package HomeWork;

// Класс User теперь отвечает только за управление данными пользователя, что соответствует принципу SRP (Single Responsibility Principle)
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
