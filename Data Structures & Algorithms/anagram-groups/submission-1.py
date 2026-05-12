class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        result =[]
        for str in strs:
            currstr = "".join(sorted(str))
            if currstr not in map:
                map.setdefault(currstr,[]).append(str)
            else :
                map[currstr].append(str)
        for k,v in map.items():
            result.append(v)
        return result