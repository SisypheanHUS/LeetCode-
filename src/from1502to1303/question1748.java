public class question1748 {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] == 1) sum += nums[i];
        }
        return sum;
    }
}
