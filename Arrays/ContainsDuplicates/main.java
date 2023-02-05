class Solution {
  
//   Input: nums = [1,2,3,1]
//   Output: true
    
  
//   using sort --> O(nlogn)
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
      
        for(int i =0;i<nums.length-1;i++){
            
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

// iterative method
// O(n^2)
/*
for(int i=0;i<nums.length;i++){
  for(int j=i+1;j<nums.lengthlj++){
    if(nums[j] == nums[i]){
      return true;
    }
  }
}
return false;
*/
