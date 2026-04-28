class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer> dupList = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(dupList.containsKey(nums[i]))
                return true;
            else
                dupList.put(nums[i],1);
        }
        return false;
    }
    }

