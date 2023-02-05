class Solution {
    public int maxSubArray(int[] nums) {

        int max_Sum = nums[0];
        System.out.println(max_Sum);
         int currSum = 0;
        for(int i=0;i<=nums.length-1;i++){

           
            currSum = currSum + nums[i];
            max_Sum = Math.max(max_Sum,currSum);
            if(currSum < 0){
                currSum = 0; 
                }
            }
        return max_Sum;
        
    }
}
