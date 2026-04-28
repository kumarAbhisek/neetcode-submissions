class Solution {
    public int rob(int[] nums) {
        int rob1=0,rob2=0,rob3=0,rob4=0;
        if(nums.length ==1){
            return nums[0];
        }
        for(int n =0;n<nums.length-1;n++){
            int temp1= Math.max(rob1+nums[n],rob2);
            rob1=rob2;
            rob2=temp1;
        }
        for(int n =1;n<nums.length;n++){
            int temp1=Math.max(rob3+nums[n],rob4);
            rob3=rob4;
            rob4=temp1;
        }
        return Math.max(rob2,rob4);
    }
}
