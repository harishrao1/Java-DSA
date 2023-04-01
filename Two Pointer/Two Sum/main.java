


/*     Given an array of integers nums and an integer target, 
       return indices of the two numbers such that they add up to target.

     Input=> nums = [2,7,11,15] target = 9
     output => [0,1]
    



 Brute force -> 
     Time complexity-O(N*N)
     space -O(1)
  
   Using Hashing      Time - O(N)
                      Space -O(N) bacause used Map data structure 

*/
  
    public int[] twoSum(int[] nums, int target) {
        
        // Array to store ans
        int[] result = new int[2];
        
//         Create a hashmap to store the difference and index,Traverse the Array till n.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        
//         if we find the nums[i] in the map then we return or else store the differnce in the map and i++
            if (map.containsKey(nums[i])) {               
                result[0] = i;
                result[1] = map.get(nums[i]);
            }           
            else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

/* 
                  if the array is sorted we can solve by using Binary Search

                    if(arr[start] + arr[end] == target){
                      return ans;
                    }
                  else if(arr[start] + arr[end] > target){
                    end--;
                  }
                  else{
                    start++;
                  }

  */
