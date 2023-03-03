// GFG

//{ Driver Code Starts
//Initial Template for Java


// n = 5
// k = 3
// arr[] = {5,10,30,20,15}
// Output: 35

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

 class Solution{
     static long minTime(int[] arr,int n,int k){
        
        long sum = getSum(arr);
        long max = getMax(arr);
        return binarySearch(arr, max, sum, k);
    }

    static long binarySearch(int [] arr, long low, long high, int k) {
        while (low < high) {
            long middle = low + (high - low) / 2;
            int painters = findPainters(arr, middle);
            if (painters <= k) {
                high = middle;
            }
            else {
                low = middle + 1;
            }
        }
        return low;
    }

    static int findPainters(int [] arr, long maxTime) {
        int painter = 1;
        long sum = 0;
        int length = arr.length;
        for (int i=0; i<length; i++) {
            sum += arr[i];
            if (sum > maxTime) {
                painter ++;
                sum = arr[i];
            }
        }
        return painter;
    } 

    static long getSum(int [] arr) {
        long total = 0;
        for (int number : arr) {
            total += number;
        }
        return total;
    }

    static long getMax(int [] arr) {
        long max = Integer.MIN_VALUE;
        for (int number : arr) {
            max = Math.max(max, number);
        }
        return max;
    }
 }

    

// painter partition problem,, agressive cows

// (1) See what we have get(min or max)
// (2) Identify the search space (possible values we can have)
// (3) See if conditions 
// (4) Identify if increase in val will satisfy conditions and optimize or decrease in val will do so, then based on that apply binary search
