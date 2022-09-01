// Java code to print all possible subarrays for given array
// using recursion

import java.util.Scanner;

class solution {

    // Recursive function to print all possible subarrays
    // for given array
    static void printSubArrays(int[] arr, int start, int end)
    {
        // Stop if we have reached the end of the array
        if (end == arr.length)
            return;
            // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1);
            // Print the subarray and increment the starting
            // point
        else {
           // System.out.print("[");
            int sum=0;
            for (int i = start; i < end; i++)
                sum+=arr[i];
                //System.out.print(arr[i] + ", ");
            //System.out.println(arr[end] + "]");
            System.out.println(sum);
            printSubArrays(arr, start + 1, end);
        }
        return;
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String array = s.nextLine();
        String[] arr = array.split(" ");
        int[] ar = new int[n];
        for(int i=0; i<n; i++)
            ar[i] = Integer.parseInt(arr[i]);
        printSubArrays(ar, 0, 0);
    }
}

// This code is contributed by Sania Kumari Gupta
