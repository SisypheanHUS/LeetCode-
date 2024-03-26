package future;
import java.util.Arrays;
import java.util.HashMap;
public class day26032024 {
        public int firstMissingPositive(int[] nums) {
            Arrays.sort(nums);
            HashMap<Integer,Integer> map = new HashMap<>();
            Integer i = 1;
            for(int num:nums){
                map.put(num,1);
                if(map.containsKey(i)) i++;
            }
            return i;
    }
}
