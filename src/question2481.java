public class question2481 {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==1) return n;
        else return n/2;
    }
}
