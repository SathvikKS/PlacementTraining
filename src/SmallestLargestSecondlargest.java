import java.util.*;

public class SmallestLargestSecondlargest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.print("Enter the array elements: ");
            String[] input = sc.nextLine().split(" ");
            for (String i : input)
                arrayList.add(Integer.parseInt(i));
            Collections.sort(arrayList);
            int n = arrayList.size();
            System.out.println("Max: "+arrayList.get(n-1)+"\nSecond Largest: "+arrayList.get(n-2)+"\nSmallest: "+arrayList.get(0));
        }
}
