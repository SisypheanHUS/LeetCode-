public class question1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder abs = new StringBuilder() ;
        int left = 0;
        int right = 0;
        while(left<word1.length()||right<word2.length()){
            if(left<word1.length()){
                abs.append(word1.charAt(left));
            }
            if(right<word2.length()){
                abs.append(word2.charAt(right));
            }
            left++;
            right++;
        }
        String a = abs.toString();
        return a;
    }
}
