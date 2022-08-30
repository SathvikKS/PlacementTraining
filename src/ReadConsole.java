import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        char c;
        do {
            c = (char) is.read();
            System.out.print(c);
        } while(c!='\n');
        is.close();
    }
}
