class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] results = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int product =1;
            for (int j=0;j<nums.length;j++){
                if(i!=j){
                    product=product*nums[j];
                }
            }
            results[i]=product;
            product=1;

        }
        return results;
    }
}  
