package future;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class day2503024 {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> as = new ArrayList<>();
        for(Integer key : map.keySet()){
            if(map.get(key)==2) as.add(key);
        }
        return as;
    }

    public static void main(String[] args) {
        day2503024 obj = new day2503024();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(obj.findDuplicates(nums));
    }
}
