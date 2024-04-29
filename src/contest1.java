import java.util.HashMap;
import java.util.HashSet;

public class contest1 {
        public static int longestMonotonicSubarray(int[] nums) {
            int countDe = 1;
            int countIn = 1;
            int curMax = 1;
            int curMin = 1;
            for(int i = 0;i<nums.length-1;i++){
                if(nums[i+1]>nums[i]){
                    curMax++;
                    countIn = Math.max(curMax,countIn);
                    curMin = 1;
                    continue;
                }
                else if(nums[i+1]<nums[i]){
                    curMin++;
                    countDe = Math.max(curMin,countDe);
                    curMax = 1 ;
                    continue;
                }

            }
            return Math.max(countDe,countIn);
    }

    public static void main(String[] args) {
        //nums =
        //[1,9,7,1]
        int[] nums = {1,9,7,1};
        System.out.println(longestMonotonicSubarray(nums));    }
}
