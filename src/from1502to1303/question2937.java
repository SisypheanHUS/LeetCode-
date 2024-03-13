public class question2937 {
    public static int findMinimumOperations(String s1, String s2, String s3) {
        int countPrefix = 0;
        int i = 0;
        while(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
            countPrefix++;
            i++;
            if(i == s1.length() || i == s2.length()) break;
            if(i == s3.length()) break;
        }
        if(countPrefix == 0) {
            return -1;
        }
        return s1.length() - countPrefix+s2.length()-countPrefix+s3.length()-countPrefix;
    }

    public static void main(String[] args) {
        System.out.println(findMinimumOperations("abc", "abb", "ab"));
    }
}
