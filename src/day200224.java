public class day200224 {

    class Solution {
        public int missingNumber(int[] nums) {
            int sumOfArray = (nums.length * (nums.length + 1)) / 2;
            int realSum = 0;
            for (int i = 0; i < nums.length; i++) {
                realSum += nums[i];
            }

            return sumOfArray - realSum;
        }
    }
}
