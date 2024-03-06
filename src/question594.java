import java.util.Arrays;

public class question594 {
    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxLength = 0;
        int currentLength = 1;
        int start = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[start] == 1) {
                currentLength = i - start + 1;
                maxLength = Math.max(maxLength, currentLength);
            } else if (nums[i] - nums[start] > 1) {
                while (i < nums.length && nums[i] - nums[start] > 1) {
                    start++;
                }
            }


        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(findLHS(arr));

    }
}
