


static int lastOccurence(int[] arr, int target ){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(end >= start){
            int mid = start + (end- start)/2;

            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return ans;
    }

    static int firstOccurence(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(end >= start){
            int mid = start +(end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid -1;
            }
            else if(arr[mid] < target){
                //
                start = mid + 1;  
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
