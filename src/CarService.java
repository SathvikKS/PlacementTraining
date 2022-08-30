import java.util.Scanner;

public class CarService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int m = Integer.parseInt(in[0]);
        int n = Integer.parseInt(in[1]);
        System.out.println((m-1)*n);
    }
}
