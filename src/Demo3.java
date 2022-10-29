import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public int totalParents(int input1, int input2, int[] input3) {
        int count=0;
        HashMap<Integer, Integer> par = new HashMap();
        for (int i=0; i<input1; i++) {
            if (input3[i] == -1) {
                par.put(input3[i], par.getOrDefault(input3[i], 0));
            }
            else {
                par.put(input3[i], par.getOrDefault(input3[i], 0)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: par.entrySet()) {
            if (entry.getValue()>=input2)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        int[] in = {-1};
        //d.totalParents(3, 1, in);
        System.out.println(d.totalParents(1, 0, in));
    }
}
