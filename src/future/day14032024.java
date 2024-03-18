package future;

public class day14032024 {

        public int numSubarraysWithSum(int[] nums, int goal) {
            int count = 0;
            int sum;
            for(int i =0;i<nums.length;i++){
                sum = nums[i];
                if(sum == goal) count++;
                for(int j = i+1;j<nums.length;j++){
                    sum+=nums[j];
                    if(sum == goal) count++;
                }
            }
            return count;
        }

}
