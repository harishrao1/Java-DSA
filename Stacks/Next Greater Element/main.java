//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
      
//       Brute FOrce
        
//         for(int i = 0;i<n;i++){
//           for(int j = i+1;j<n;j++){
//           }
//         }
        
        // Using stack
        
        long[] result = new long[n];
        
        Stack<Long> stack = new Stack();
        
        for(int i = n-1;i>= 0;i--){
            
            if(stack.isEmpty()){
                result[i] = -1;
            }
            else if(!stack.isEmpty() && stack.peek() > arr[i]){ 
        // if top ele of stack is greater than the current ele then update
                result[i] = stack.peek();
            }
            else if(!stack.isEmpty() && stack.peek() <= arr[i]){
        // if not less than or equal to curr ele then remove ele 
        // from stack until larger ele is found
                
                while(!stack.isEmpty() && stack.peek() <= arr[i] ){
                    stack.pop();
                }
        // if we remove all ele in the stack then update -1 or 
        //  if we get the greater ele in the then update that to result.
                
                if(stack.isEmpty()){
                    result[i] = -1;
                }
                else{
                    result[i] = stack.peek();
                }
            }
            // push curr ele to stack
             stack.push(arr[i]);
        }
        return result;
    } 
}
