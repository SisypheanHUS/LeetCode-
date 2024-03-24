package future;

import java.util.HashMap;

public class day24032024
{
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>1) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        day24032024 obj = new day24032024();
        int[] nums = {1,3,4,2,2};
        System.out.println(obj.findDuplicate(nums));
    }
}
