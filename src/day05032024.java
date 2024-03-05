public class day05032024 {
    public static int minimumLength(String s) {
        int right = s.length()-1;
        int lmao = 0;
        while( lmao < right ){
            if(s.charAt(lmao) != s.charAt(right)){
                return right -lmao+1;
            }
            else if(s.charAt(lmao) == s.charAt(lmao+1)){
                lmao++;
                if ((s.charAt(lmao) == s.charAt(right)) && lmao == right)return 0;

                continue;
            } else if (s.charAt(right)==s.charAt(right-1)) {
                right--;
                continue;
            }

            lmao++;
            right--;
        }

        return right-lmao+1;

    }

    public static void main(String[] args) {
        day05032024 obj = new day05032024();
        System.out.println(obj.minimumLength("bbbabbbbbbccbcbcbccbbabbb"));
    }
}
