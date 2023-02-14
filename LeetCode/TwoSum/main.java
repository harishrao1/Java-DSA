
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
       for(int i=0; i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
               if(nums[i]+nums[j]== target){
                   if(i!=j){
                      return new int[]{i,j};
                    }
                }
            }
        }
        return null;
        
    }
}

// nums=[1,2,3,4,7]

// target = 9

// output =[1,4]
