class Solution {
    public int[] twoSum(int[] nums, int target) {
                Map<Integer,Integer> twosummap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
        if(twosummap.containsKey(target-nums[i]))
        return new int[]{twosummap.get(target-nums[i]),i};
        else{
            twosummap.put(nums[i],i);
        }

        }
        return new int[]{};
    }
}
