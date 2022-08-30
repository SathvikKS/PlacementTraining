import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String[] in1 = sc.nextLine().split(" ");
        String[] in2 = sc.nextLine().split(" ");
        n = Integer.parseInt(in1[0]);
        String k = in1[1];
        if (n!=in2.length) {
            System.out.println("Insufficient or too many array elements provided");
            return;
        }
        ArrayList<String> myArray = new ArrayList<>(Arrays.asList(in2));
        if (!myArray.contains(k))
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
