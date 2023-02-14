// JAVA Code For Chocolate Distribution
// Problem
import java.util.*;

class GFG {
  
  	public static void main(String[] args)
	{
		int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30,
					40, 28, 42, 30, 44, 48, 43, 50 };

		int m = 7; // Number of students

		int n = arr.length;
		
      System.out.println("Minimum difference is "+ findMinDiff(arr, n, m));
	}

  
	static int findMinDiff(int arr[], int n, int m)
	{
		// if there are no chocolates or
		// number of students is 0
		if (m == 0 || n == 0)
			return 0;

//sorting
    Arrays.sort(arr);

		// Number of students cannot be
		// more than number of packets
		if (n < m)
			return -1;

		// Largest number of chocolates
		int min_diff = Integer.MAX_VALUE;


		for (int i = 0; i + m - 1 < n; i++) {
			int diff = arr[i + m - 1] - arr[i];
			if (diff < min_diff)
				min_diff = diff;
		}
		return min_diff;
	}
}



//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
    


// class Solution
// {
//     public long findMinDiff (ArrayList<Integer> a, int n, int m)
//     {
//         // your code here
//         Collections.sort(a);
        
//         long result = Integer.MAX_VALUE;
        
//         for(int i=0;i<=n-m;i++){
//             long difference = (a.get(i+m-1) - a.get(i));
            
//             if(result > difference){
                
//                 result = difference;
//             }
            
            
//         }
//         return result;
//     }
// }
