package code;

import java.util.Arrays;
import java.util.Comparator;

import code.MeetingRoom.Interval;

public class CompareTest {


	    public boolean canAttendMeetings(Interval[] intervals) {
	        Arrays.sort(intervals, new Comparator<Interval>() {
	            @Override
	            public int compare(Interval in1, Interval in2) {
	                int ans = in1.start - in2.start;
	                return ans == 0 ? in1.end - in2.end : ans;
	            }
	        });
	        for (int i = 0; i < intervals.length - 1; i++) {
	            if (intervals[i].end > intervals[i + 1].start) {
	                return false;
	            }
	        }
	        return true;
	    }
	
}
