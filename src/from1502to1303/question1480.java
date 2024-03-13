public class question1480 {
    public int[] runningSum(int[] nums) {
        int[] fredRunning = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+= nums[i];
            fredRunning[i] = sum;
        }
        return fredRunning;
    }
}

