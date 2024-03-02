import java.lang.reflect.Array;
import java.util.Arrays;

//question 977 Squares of a Sorted Array on Leetcode
public class day030224 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int start = 0, end = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                ans[i] = nums[start] * nums[start];
                start++;
            } else {
                ans[i] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,5,3};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
