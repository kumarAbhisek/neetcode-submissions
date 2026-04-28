class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        a=set()
        for num in nums:
            a.add(num)
        if len(nums)>len(a):
            return True
        return False
        