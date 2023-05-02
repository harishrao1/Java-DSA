/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

prices = [7,1,5,3,6,4]
Output: 5
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Brute Force Method
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){

        //         if(nums[j] == target-nums[i]){
        //         //   int a[] = {i,j};
        //           return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;

        // Using Hashmap
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int temp = target - nums[i];

            if(map.containsKey(temp)){
                return new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};        
    }
}
