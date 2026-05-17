class Solution:
    def isPalindrome(self, s: str) -> bool:
        res = ""
        for a in s:
            if a.isalnum():
                res = res + a.lower()
        
        if res == res[::-1]:
            return True

        return False
        