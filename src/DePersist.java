import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DePersist {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student1 s = (Student1) in.readObject();
            System.out.println(s.id+" "+s.name);
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
