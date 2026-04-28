class Solution {
    public boolean isValid(String s) {
      Stack<Character> brackets = new Stack<>();
      Map<Character,Character> lookup = new HashMap<>();
        lookup.put(')', '(');
        lookup.put('}', '{');
        lookup.put(']', '['); 

        char ss[] =s.toCharArray();

        for (char c : ss){
            if(lookup.containsKey(c)){
                if(!brackets.isEmpty() &&lookup.get(c).equals(brackets.peek())){
                    brackets.pop();
                }
                else{
                    return false;
                }
            }
            else{
                brackets.push(c);
            }
        }
            return brackets.isEmpty();
        }
    }

