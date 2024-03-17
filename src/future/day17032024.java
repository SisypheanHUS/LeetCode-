package future;

public class day17032024 {
    public long countSubstrings(String s, char c) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
            }
        }
        return counter * (counter + 1) / 2;
    }

    public static void main(String[] args) {
        day17032024 test = new day17032024();
        String s = "abada";
        char c = 'a';
        System.out.println(test.countSubstrings(s, c));  // Output: 6
    }
}