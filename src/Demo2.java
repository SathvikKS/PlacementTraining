public class Demo2 {
    public static boolean canPrint(int n, int input1, int[] input2) {
        for (int i=0; i<input1; i++) {
            if (n%input2[i] == 0)
                return true;
        }
        return false;
    }
    public int maxFlowers(int input1, int[] input2) {
        int sum=0;
        for (int i=0; i<input1; i++)
            sum+=input2[i];
        int cannotPrint=1;
        for (int i=1; i<sum; i++) {
            if (!canPrint(i, input1, input2)) {
                cannotPrint = Math.max(cannotPrint, i);
            }
        }
        return cannotPrint;
    }
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        int[] arr = {2,5};
        System.out.println(d.maxFlowers(2, arr));
    }
}
