import java.util.ArrayList;

public class question350 {
    public int[] intersect(int[] nums1, int[] nums2) {
//        int i = 0;
//        HashMap<Integer, Integer> hmn1 = new HashMap<>();
//        for (int num : nums1) {
//            int currentValue = hmn1.getOrDefault(num, 0);
//            hmn1.put(num, currentValue + 1);
//        }
//        HashMap<Integer, Integer> hmn2 = new HashMap<>();
//        for (int num : nums2) {
//            int currentValue = hmn2.getOrDefault(num, 0);
//            hmn2.put(num, currentValue + 1);
//        }
//        HashMap<Integer, Integer> result = new HashMap<>();
//        for (int num : hmn1.keySet()) {
//            if(hmn1.containsKey(num) && hmn2.containsKey(num)){
//                int min = Math.min(hmn1.get(num), hmn2.get(num));
//                result.put(num, min);
//            }
//        }
//        ArrayList<Integer> res = new ArrayList<>();
//        for(Integer num : result.keySet()){
//            int count = result.get(num);
//            for (int j = 0; j < count; j++) {
//                res.add(num);
//            }
//        }
//        int[] resu = new int[res.size()];
//        for (int num : res) {
//            resu[i] = num;
//            i++;
//        }
//        return resu;
//    old idea of my solution but i think this way might be faster
        int[] count1 = new int[1001];
        int[] count2 = new int[1001];

        for (int num : nums1) {
            count1[num]++;
        }

        for (int num : nums2) {
            count2[num]++;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            int min = Math.min(count1[i], count2[i]);
            for (int j = 0; j < min; j++) {
                res.add(i);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
