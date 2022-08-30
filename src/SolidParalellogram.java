public class SolidParalellogram {
    static int line=5;
    public static void main(String[] args) {
        for (int i=0; i<line; i++) {
            for (int space=line; space>i+1; space--)
                System.out.print(" ");
            for (int j=0; j<line; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
