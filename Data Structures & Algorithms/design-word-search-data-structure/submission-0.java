class node {
    node[] children;
    boolean word;
    public node(){
        children = new node[26];
        word=false;
    }
}
class WordDictionary {
public node root;
    public WordDictionary() {
        root = new node();
    }

    public void addWord(String word) {
        node curr = root;
        for(char c: word.toCharArray()){
            if(curr.children[c-'a']==null){
                curr.children[c-'a']= new node();

            }
            curr=curr.children[c-'a'];
        }
        curr.word=true;

    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }
    private boolean dfs(String word, int j, node root) {
        node cur = root;

        for (int i = j; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (node child : cur.children) {
                    if (child != null && dfs(word, i + 1, child)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (cur.children[c - 'a'] == null) {
                    return false;
                }
                cur = cur.children[c - 'a'];
            }
        }
        return cur.word;
    }
}
