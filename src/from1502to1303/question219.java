import java.util.HashMap;
import java.util.HashSet;

public class question219 {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j <= i+k; j++) {
//                if(nums[i]==nums[j]){
//                    if(j-i<=k) return true;
//                }
//            }
//        }
//        return false;
//    } TLE VAI CA LOZ 


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k == 0)
            return false;
        HashMap<Integer,Integer> dup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(dup.containsKey(nums[i])){
                if(i-dup.get(nums[i])<=k) return true;
            }
            dup.put(nums[i],i);
        }
        return false;
    }
}
