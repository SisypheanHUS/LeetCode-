public class question2960 {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            batteryPercentages[i] -= count;
            if(batteryPercentages[i]>0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        question2960 q = new question2960();
        int[] batteryPercentages = {1, 2, 3, 4, 5};
        System.out.println(q.countTestedDevices(batteryPercentages));
    }
}
