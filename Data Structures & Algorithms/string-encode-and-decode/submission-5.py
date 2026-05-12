class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""

        for s in strs:
            res = res + str(len(s)) + "#" + s

        return res
    def decode(self, s: str) -> List[str]:
        i = 0
        res=[]
        while i < len(s):
            j = s.find("#", i)
            length = int(s[i:j])
            res.append(s[j+1 : j+1+length])
            i = j + 1 + length
        return res
            
