


// Binary Search;--> Time Complexity--O(logn);

static int[] binarySearch(int [] arr, int target){
  
int low = 0;
int end = arr.length-1;
  
  while(end > low){
    
         int mid = low + (end - low) /2;
    
              if (arr[mid] == target){
                return mid;
              }
              else if (arr[mid] > target) {
                low = mid + 1;
              }
              else{
                end = mid -1;
           }
      }
      return -1;
}
