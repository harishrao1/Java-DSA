

import java.util.Scanner;

public class sort {
    public static  void main(String[] args) {

//        Sort 0's 1's and 2's withot space and sorting Algo

//        int[] arr = {1, 2, 2, 0, 0, 0, 1, 2, 0, 1};    output -> [0 0 0 0 1 1 1 2 2 2]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();


        int result[] = sort012(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }


    }
        static int[] Sorting(int[]arr){
                /* Brute Force
                   Iterate and No of 0  1 2 and insert them
                Time Complexity -- O(n)
                Space - O(1)    */
            int countZero = 0;
            int countOne = 0;
            int countTwo = 0;
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == 0) {
                    countZero = countZero + 1;
                }
                if (arr[i] == 1) {
                    countOne = countOne + 1;
                }
                if (arr[i] == 2) {
                    countTwo = countTwo + 1;
                }
            }

            int i = 0;

            while (countZero != 0) {
                arr[i] = 0;
                i = i + 1;
                countZero--;
            }
            while (countOne != 0) {
                arr[i] = 1;
                i = i + 1;
                countOne--;
            }
            while (countTwo != 0) {
                arr[i] = 2;
                i = i + 1;
                countTwo--;
            }
            return arr;
    }

    static int[] sort012(int[] arr){

/*       partition process
         x[0...low-1] -> 0
         x[low...mid-1] -> 1
         x[mid... high] -> 2
    TC - O(n)
    Space -O(1)
 */
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){

            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low = low + 1;
                mid = mid + 1;
            }
            else if (arr[mid] == 1){
                mid = mid + 1;
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high = high -1;
            }
        }
        return arr;
    }

}
