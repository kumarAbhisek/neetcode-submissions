 class node{
    private char value;
    private boolean isWord;
    private node children[];
    public node(char value){
this.value =value;
this.isWord =false;
this.children = new node[26];
    }
}
class PrefixTree {
    node root;

    public PrefixTree() {
         root = new node('\0');
    }

    public void insert(String word) {
        node curr = root;
        for(char x:word.toCharArray()){
            if(curr.children[x-'a'] == null){
                curr.children[x-'a'] = new node(x);
            }
            curr= curr.children[x-'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        node curr =root;
        for(char x : word.toCharArray()){
            if(curr.children[x-'a'] == null){
                return false;
            }
            curr = curr.children[x-'a'];
        }
        return curr.isWord;
    }

    public boolean startsWith(String prefix) {
        node curr =root;
for(char x : prefix.toCharArray()){
            if(curr.children[x-'a'] == null){
                return false;
            }
            curr = curr.children[x-'a'];
        }
        return true;
    }
    }

