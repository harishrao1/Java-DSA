// find the smallest missing positive integer

// Input ->
// 4
// 3 4 -1 1
// Output ->
// 2
  
import java.util.*;
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        // System.out.print(arr);

        int result = 1;

        for(int i=0;i<nums.length;i++){

            if(nums[i] == result){
                result++;
            }
        }
        return result;
    }
}

// O(1) - Space Complexity
// O(n) - Time Complexity
