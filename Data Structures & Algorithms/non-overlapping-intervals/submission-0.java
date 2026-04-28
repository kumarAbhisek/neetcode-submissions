class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[0],b[0]));
        int res=0;
        int lastend = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start<lastend){
                res++;
                lastend = Math.min(end,lastend);
            }else{
                lastend = end;
            }
        }
        return res;
    }
}
