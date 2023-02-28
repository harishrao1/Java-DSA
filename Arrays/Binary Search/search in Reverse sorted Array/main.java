

import java.util.Scanner;

public class SearchInReverseSortedArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Length of the Array :");
        int n = sc.nextInt();
        
        System.out.println("Enter the Array values ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target element to be Searched");
        int target = sc.nextInt();

        System.out.println(Search(arr,target));
    }

        static int Search(int[] arr,int target){

        int start = 0;
        int end = arr.length;

        while(end > start){

            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                end = mid -1;
            }
            else {
                start = mid ;
            }
        }
        return -1;
    }
}
