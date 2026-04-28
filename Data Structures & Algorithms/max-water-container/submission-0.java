class Solution {
    public int maxArea(int[] heights) {
        int l =0;
        int r = heights.length -1;
        int area =0;
        while(l<r){
            area = Math.max((Math.min(heights[l],heights[r]) *(r-l)),area);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
}
