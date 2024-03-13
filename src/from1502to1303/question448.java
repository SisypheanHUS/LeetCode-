import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class question448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> fred = new ArrayList<>();
        HashMap<Integer,Integer> countOccur = new HashMap<>();
        for(int num:nums){
            countOccur.put(num,countOccur.getOrDefault(num,0)+1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(!countOccur.containsKey(i)) fred.add(i);
        }
        return fred;
    }
}
