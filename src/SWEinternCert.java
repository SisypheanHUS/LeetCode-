import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SWEinternCert {
    public static int maxPresentations(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
    List<int[]> schedule = new ArrayList<>();
    for (int i = 0; i < scheduleStart.size(); i++) {
        schedule.add(new int[]{scheduleStart.get(i), scheduleEnd.get(i)});
    }
    Collections.sort(schedule, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
    int count = 1;
    int currentTime = schedule.get(0)[1];
    for (int i = 1; i < schedule.size(); i++) {
        if (currentTime <= schedule.get(i)[0]) {
            count++;
            currentTime = schedule.get(i)[1];
        }
    }
    return count;
}
}
