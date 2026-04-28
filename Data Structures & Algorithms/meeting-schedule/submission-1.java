/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        //Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        if(intervals.isEmpty()){
            return true;
        }
        Collections.sort(intervals,Comparator.comparingInt(i->i.start));
        int lastend = intervals.get(0).end;

        for(int i=1;i<intervals.size();i++){
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;
            System.out.println(start);
            System.out.println(end);
            if(start<lastend){
                return false;
            }else{
                lastend=end;
            }
        }
        return true;
    }
}
