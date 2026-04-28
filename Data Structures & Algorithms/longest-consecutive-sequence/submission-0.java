class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }

        int longest =0;
        for (int n:numset){
            if(!numset.contains(n-1)){
                int length =1;
                while(numset.contains(n+length)){
                    length++;
                }
                longest=Math.max(length,longest);
            }
        }
        return longest;
    }
}
