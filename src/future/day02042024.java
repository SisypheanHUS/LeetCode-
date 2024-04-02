package future;

import java.util.HashMap;

public class day02042024 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map1.containsKey(sChar) && map1.get(sChar) != tChar) return false;
            if (map2.containsKey(tChar) && map2.get(tChar) != sChar) return false;
            map1.put(sChar, tChar);
            map2.put(tChar, sChar);
        }
        return true;
    }

    public static void main(String[] args) {
        day02042024 obj = new day02042024();
        String s = "bbbaaaba";
        String t = "aaabbbba";
        System.out.println(obj.isIsomorphic(s, t));  // This will print the result
    }
}