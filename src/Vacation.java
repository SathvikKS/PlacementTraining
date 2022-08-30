import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");
        for (String a: arr2)
            System.out.print(a+" ");
        System.out.println();
        for (String a: arr1)
            System.out.print(a+" ");
    }
}
