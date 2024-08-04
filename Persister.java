package HomeWork;

import java.io.FileWriter;
import java.io.IOException;

// Класс Persister теперь реализует интерфейс Saver, что позволяет следовать принципу DIP
public class Persister implements Saver {
    private User user;

    public Persister(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        try (FileWriter writer = new FileWriter("user.txt", true)) {
            writer.write(user.getName() + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
