import java.util.Scanner;

public class PlantingTrees {
   public static int mod(int v, int m) {
       return (v+1)%m;
   }
    public static int totalTrees(int input1, int input2) {
        return mod(2, input2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(totalTrees(sc.nextInt(), sc.nextInt()));
    }
}
