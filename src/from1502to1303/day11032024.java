import java.util.HashMap;
import java.util.HashSet;

public class day11032024 {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> set = new HashMap<>();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            set.put(s.charAt(i),set.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < order.length(); i++) {
            if(set.containsKey(order.charAt(i)) ) {
                while(set.get(order.charAt(i)) > 0) {
                    a += order.charAt(i);
                    set.put(order.charAt(i),set.get(order.charAt(i))-1);
                }

            }
        }
        for (Character c : set.keySet()) {
            while(set.get(c) > 0) {
                a += c;
                set.put(c,set.get(c)-1);
            }
        }
        return a;
    }
}
