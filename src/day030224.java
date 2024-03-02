import java.util.Arrays;

//question 977 Squares of a Sorted Array on Leetcode
public class day030224 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
}
