class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for( char a :t.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+ 1);
        }

        int matched =0;
        int start =0;
        int result =0;
        int index=0;
        int chotta =s.length()+1;
        for (int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    matched++;
                }
            }
            while(matched == map.size()){
                if(chotta > i-start +1){
                    chotta = i-start +1;
                    index=start;
                }
            
            char del = s.charAt(start++);
            if(map.containsKey(del)){
                if(map.get(del) ==0)matched --;
                map.put(del,map.get(del) + 1);
            }
        }
        }
        return chotta > s.length() ? "":s.substring(index,index+chotta);
    }
}
