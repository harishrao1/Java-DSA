

package Searching.BinarySearch;

public class NearlySortedArray {
    public static void main(String[] args){

        int arr[] = {2,1,3,5,4,7};
        int target = 7;

        System.out.println(Searching(arr,target));

    }

    static int Searching(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;
        
        while(end >= start){
            int mid = start + (end -start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid-1] == target ){
                return mid-1;
            }
            else if(arr[mid+1] == target){
                return mid+1;
            }
            else if(arr[mid] > target){
                end = mid -2;
            }
            else{
                start = mid + 2;
            }
        }
        return -1;
    }
}
