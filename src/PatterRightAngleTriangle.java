public class PatterRightAngleTriangle {
    public static int line=5;
    public static void main(String[] args) {
        for(int i=0; i<line; i++) {
            for (int space=line; space>i; space--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j==0 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        for(int i=line; i>=0; i--) {
            for (int space=line; space>i; space--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j==0 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
