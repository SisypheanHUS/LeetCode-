import java.util.*;

public class contest10032024ques3 {
    public static void main(String[] args) {
        String[] arr = {"cab", "ad", "bad" ,"c"};
        contest10032024ques3 obj = new contest10032024ques3();
        String[] result = obj.shortestUniqueSubstrings(arr);
        System.out.println(Arrays.toString(result));
    }

    private List<String> getSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        for (int len = 1; len <= s.length(); len++) {
            for (int start = 0; start <= s.length() - len; start++) {
                substrings.add(s.substring(start, start + len));
            }
        }
        return substrings;
    }

    private boolean isUnique(String sub, String[] arr, int excludeIndex) {
        for (int i = 0; i < arr.length; i++) {
            if (i != excludeIndex && arr[i].contains(sub)) {
                return false;
            }
        }
        return true;
    }

    public String[] shortestUniqueSubstrings(String[] arr) {
        String[] answer = new String[arr.length];
        Arrays.fill(answer, "");

        for (int i = 0; i < arr.length; i++) {
            List<String> substrings = getSubstrings(arr[i]);
            for (String sub : substrings) {
                if (isUnique(sub, arr, i) && (answer[i].isEmpty() || sub.length() < answer[i].length() || (sub.length() == answer[i].length() && sub.compareTo(answer[i]) < 0))) {
                    answer[i] = sub;
                }
            }
        }

        return answer;
    }
}