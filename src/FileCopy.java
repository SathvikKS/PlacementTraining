import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("sample.txt");
        FileWriter fw = new FileWriter("output.txt");
        int c;
        while ((c=fr.read())!=-1) {
            fw.write(c);
        }
        fr.close();
        fw.close(); // required to save the written contents
        System.out.println("Success");
    }
}
