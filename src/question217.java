import java.util.HashMap;

public class question217 {
    public boolean containsDuplicateM(int[] nums) {
        HashMap<Integer, Integer> Kumden = new HashMap<>();
        for (int num : nums) {
            if (Kumden.containsKey(num) && Kumden.get(num) >= 1) return true;
            Kumden.put(num, Kumden.getOrDefault(num, 0) + 1);
        }
        return false;
    }

// 2nd choice of code
//    public boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> Kumden = new HashSet<>();
//        for (int num : nums) {
//            if (Kumden.contains(num)) return true;
//            Kumden.add(num);
//        }
//        return false;
//    }
}
