import java.util.Arrays;

public class question414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = nums.length-1; i > 0; i--) {
            if(nums[i]!=nums[i-1]) count++;
            if(count==3) return nums[i-1];
        }
        return nums[nums.length-1];
    }
}
