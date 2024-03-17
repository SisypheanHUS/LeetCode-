package future;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class testHK {
    public List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        List<Integer> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : dictionary) {
            String sortedWord = sortString(word);
            map.put(sortedWord, map.getOrDefault(sortedWord, 0) + 1);
        }
        for (String word : query) {
            String sortedWord = sortString(word);
            result.add(map.getOrDefault(sortedWord, 0));
        }
        return result;
    }

    private String sortString(String word) {
        char[] arr = word.toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        testHK test = new testHK();
        List<String> dictionary = List.of("heater", "cold", "clod", "reheat", "docl");
        List<String> query = List.of("codl", "heater", "abcd");
        List<Integer> result = test.stringAnagram(dictionary, query);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
