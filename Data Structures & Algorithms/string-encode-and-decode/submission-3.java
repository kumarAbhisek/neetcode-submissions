class Solution {

    public String encode(List<String> strs) {
    StringBuilder s = new StringBuilder();
    for (String str : strs) {
        s.append(str.length()).append("#").append(str);
    }
    System.out.println(s);
    return s.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i =0;
        while(i<str.length()) {
             System.out.println(i);
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            System.out.println(str.substring(j+1,j+length+1));
            result.add(str.substring(j+1,j+length+1));
            i = j + length +1 ;


        }
        return result;
    }
}
