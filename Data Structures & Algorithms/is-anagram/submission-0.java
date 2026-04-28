class Solution {
    public boolean isAnagram(String s, String t) {
if (s.length() != t.length()) {
            return false;
        }
        
        int[] charCounts = new int[26];
        
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }
        
        for (char c : t.toCharArray()) {
            charCounts[c - 'a']--;
            if (charCounts[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
