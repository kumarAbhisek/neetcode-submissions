class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d=dict()
        for c in s:
            d[c]=d.get(c,0)+1
        for c in t:
            d[c]=d.get(c,0)-1
        for k,v in d.items():
            if v != 0:
                return False
        return True