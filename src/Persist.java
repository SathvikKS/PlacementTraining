import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {
    public static void main(String[] args) {
        try {
            Student1 s1 = new Student1(211, "Ravi");
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(s1);
            oout.flush();
            oout.close();
            System.out.println("Success");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
