import java.util.*;

public class MeetingOverlapping {

    public static boolean canAttendAllMeetings(int[][] intervals) {
        // Sort the intervals by start time.
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Iterate over the intervals.
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the previous interval,
            // then the person cannot attend all meetings.
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};

        boolean canAttendAllMeetings = canAttendAllMeetings(intervals);

        System.out.println("Can attend all meetings: " + canAttendAllMeetings);
    }
}
