class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sum =0
        countS,countT={},{}
        for i in range(len(s)):
            countT[t[i]] = 1 + countT.get(t[i],0)#sum =sum + (ord(s[i])-ord(t[i]))
            countS[s[i]] = 1 + countS.get(s[i],0)
            #print(sum)
        if countT ==countS:
            return True;
        return False