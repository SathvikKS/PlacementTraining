import java.util.Scanner;

public class SwapCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = (s.length()%2==0)?s.length():s.length()-1;
        for(int i=0; i<n; i+=2)
            System.out.print(s.charAt(i + 1) +String.valueOf(s.charAt(i)));
        if(s.length()%2!=0)
            System.out.print(s.charAt(s.length()-1));
    }
}
