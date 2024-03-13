import java.util.ArrayList;
import java.util.List;

public class question2951 {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
        }
        return peaks;
    }

    public static void main(String[] args) {
        question2951 q = new question2951();
        int[] mountain = {1, 3, 2, 4, 1, 5, 6, 3, 2};
        System.out.println(q.findPeaks(mountain));
    }
}
