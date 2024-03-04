import java.util.Arrays;
import java.util.HashMap;

public class question136 {
    public int singleNumber(int[] nums) {
//        HashMap<Integer,Integer> countOccur = new HashMap<>();
//        for(int num:nums){
//            countOccur.put(num,countOccur.getOrDefault(num,0)+1);
//        }
//        for(int num:nums){
//            if(countOccur.get(num)==1) return num;
//        }
//        return -1;
        //this is HashMap solution

        //now this is for loop + sorting solution

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i+=2) {
            if(nums[i]!=nums[i+1] ) return nums[i];
        }
        return nums[nums.length-1];
    }
}
