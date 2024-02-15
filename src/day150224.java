import java.util.Arrays;

public class day150224 {
    class Solution {
        public long largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            int ans = 0;
            for (int i = nums.length - 1; i > 1; i--) {
                if (CheckIfPolygon(nums, i)) {
                    for (int j = 0; j <= i; j++) {
                        ans += nums[j];
                    }
                    return ans;
                }
            }
            return -1;
        }

        public boolean CheckIfPolygon(int[] nums, int k) {
            for (int i = k; i > 1; i--) {
                int sum = 0;
                for (int j = 0; j < i; j++) {
                    sum += nums[j];
                }
                if (sum > nums[i]) return true;
            }
            return false;
        }
    }
}
