class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List <Integer> cur = new ArrayList<>();
        backtrace(nums,target,ans,cur,0);
            return ans;
        
    }
    public void backtrace(int[]nums,int target,List<List<Integer>> ans,List<Integer> cur,int index){

        if(target ==0){
            ans.add(new ArrayList(cur));
        }else if(target<0 || index>=nums.length){
            return;
        } else{
            cur.add(nums[index]);
            backtrace(nums,target - nums[index],ans,cur,index);
            cur.remove(cur.get(cur.size()-1));
            backtrace(nums,target,ans,cur,index+1);
        }
    }
}
