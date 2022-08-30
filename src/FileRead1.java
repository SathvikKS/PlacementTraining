import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead1 {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        String toWrite = "Hello\nWorld\nWelcome to\nJAVA Programming\n";
        fw.write(toWrite);
        fw.close();
        FileReader fr = new FileReader(file);
        char[] a = new char[50];
        fr.read(a);
        for (char c: a)
            if (c!='\0') //for IntelliJ IDEA
                System.out.print(c);
        fr.close();
    }
}
