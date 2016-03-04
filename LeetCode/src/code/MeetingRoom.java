package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MeetingRoom {
	
	public static void main(String[] args) {
//		int a = 26;
//		a = a / 26;
//		System.out.println(a);
//		a = a / 26;
//		System.out.println(a);
//		
//		String r = "";
//		r = r + 'a';
//		r = r + "a";
//		System.out.println(r);
//		
		Interval in1 = new Interval(0, 30);
		Interval in2 = new Interval(10,40);
		Interval in3 = new Interval(5, 6);
		Interval[] intervals = new Interval[3];
		intervals[0] = in1;
		intervals[1] = in2;
		intervals[2] = in3;

		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(0, 1));
		list.add(new Interval(1, 2));
		List<Interval> list2 = new ArrayList<Interval>(list);
		List<Interval> list3 = new ArrayList<Interval>();
		list3.addAll(list);
		list.get(0).start = 9;
		list.get(0).end = 10;
		for (Interval n : list) {
			System.out.println(n.start);
		}
		for (Interval n : list2) {
			System.out.println(n.start);
		}
		for (Interval n : list3) {
			System.out.println(n.start);
		}

 
		canAttendMeetings(intervals);
		for (int i = 0; i < intervals.length; i++) {
			System.out.println(intervals[i].start);			
		}
	}
	
    static class Interval {
        int start;
        int end;
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    
    public static boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                int r = o1.start - o2.start;
                return r==0? o1.end - o2.end : r;
            }
        });
        for(int i=1;i<intervals.length;i++) {
            Interval t1 = intervals[i-1];
            Interval t2 = intervals[i];
            if(t1.end>t2.start) return false;
        }
		return true;
	}
}
