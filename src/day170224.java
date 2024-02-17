public class day170224 {
    class Solution {
        public int maxOperations(int[] nums) {

            if (nums.length > 1) {
                int count = 1;
                int sum = nums[0] + nums[1];
                int i = 2;
                while ((nums.length - i) > 1) {
                    if (nums[i] + nums[i + 1] == sum) {
                        count++;
                        i += 2;
                    }
                    else break;

                }
                return count;
            }
            return 0;
        }
    }
}
}
