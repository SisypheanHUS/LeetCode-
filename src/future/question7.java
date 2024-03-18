package future;

public class question7 {
    public int reverse(int x) {
        long t = Math.abs((long)x);
        String a = Long.toString(t);
        String res = "";
        for(int i = a.length()-1; i >= 0; i--){
            res += a.charAt(i);
        }
        long ra = Long.parseLong(res);
        if (ra > Integer.MAX_VALUE) {
            return 0;
        }
        if(x<0) return -(int)ra;
        return (int)ra;
    }

    public static void main(String[] args) {
        question7 q7 = new question7();
        System.out.println(q7.reverse(-2147483648));
    }
}