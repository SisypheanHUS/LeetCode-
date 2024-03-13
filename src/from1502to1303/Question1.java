
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Question1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int sizeArr = nums.length;

        for (int i = 0; i < sizeArr; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }
}