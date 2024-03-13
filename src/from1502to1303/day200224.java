public class day200224 {

    class Solution {
        public int missingNumber(int[] nums) {
            int sumOfArray = (nums.length * (nums.length + 1)) / 2;
            int realSum = 0;
            for (int num : nums) {
                realSum += num;
            }

            return sumOfArray - realSum;
        }
    }
}
