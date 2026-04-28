class Solution {
    public int maxProduct(int[] nums) {
        int res =nums[0];
        int currmax=1;
        int currmin=1;
        for(int n :nums){
            int temp =currmax;
            System.out.println(currmax);
            currmax = Math.max(n,Math.max(currmax*n,currmin*n));
            
            currmin= Math.min(n,Math.min(temp*n,currmin*n));
            res = Math.max(res,currmax);
        }
        return res;
    }
}
