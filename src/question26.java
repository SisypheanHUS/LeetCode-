import java.util.Arrays;

    public class question26 {
        class Solution {
            public int removeDuplicates(int[] nums) {
                int ans = 0;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] != nums[ans]) {
                        ans++;
                        nums[ans] = nums[i];
                    }
                    //1,1,2
                }
                return ans+1;
            }
        }
    }
