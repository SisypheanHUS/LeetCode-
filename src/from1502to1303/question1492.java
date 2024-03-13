public class question1492 {
    public int kthFactor(int n, int k) {
        int oggy = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0) {
                oggy++;
            }
            if(oggy == k) return i;
        }
        return -1;
    }
}
