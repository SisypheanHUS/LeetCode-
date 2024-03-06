public class question905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] nah = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nah[j] = nums[i];
                j++;
            }
        }
        for (int num : nums) {
            if (num % 2 == 1) {
                nah[j] = num;
                j++;
            }
        }
        return nah;
    }
}
