public class MaxElementColumn {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,8,2},
                {5,1,10}
        };
        int s = 0;
        for (int j=0; j<arr[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i=0; i<arr.length; i++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            s+=max;
        }
        System.out.println(s);
    }
}
