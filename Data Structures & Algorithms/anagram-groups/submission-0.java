class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> a = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char s[] = strs[i].toCharArray();
            Arrays.sort(s);
            String sortedstring= new String(s);
            if(a.containsKey(sortedstring)){
               a.get(sortedstring).add(strs[i]);
            }else{
                a.put(sortedstring,new ArrayList<>());
                a.get(sortedstring).add(strs[i]);
            }

        }
        return new ArrayList<>(a.values());
    }}
