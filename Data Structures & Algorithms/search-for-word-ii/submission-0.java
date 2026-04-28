class TrieNode{
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isWord = false;
    int refs = 0;
    public void addWord(String word) {
        TrieNode cur = this;
        cur.refs++;
        for (char c : word.toCharArray()) {
            cur.children.putIfAbsent(c, new TrieNode());
            cur = cur.children.get(c);
            cur.refs++;
        }
        cur.isWord = true;
    }
        public void removeWord(String word) {
        TrieNode cur = this;
        cur.refs--;
        for (char c : word.toCharArray()) {
            if (cur.children.containsKey(c)) {
                cur = cur.children.get(c);
                cur.refs--;
            }
        }
    }

}
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> res = new HashSet<>();
        Set<String> visit = new HashSet<>();
        TrieNode root = new TrieNode();

        for(String w:words){
            root.addWord(w);
        }
        for(int r =0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                dfs(r,c,root,"",board,res,visit,root);
            }
        }
        return new ArrayList<>(res);
    }
    private void dfs(int r ,int c,TrieNode node,String word,char[][] board,Set<String>res,
    Set<String>visit,TrieNode root){
        if(r<0 || r>=board.length ||
        c<0 || c>=board[0].length || 
        !node.children.containsKey(board[r][c]) ||
        visit.contains(r+","+c) || node.children.get(board[r][c]).refs < 1 ){
            return;
        }
        visit.add(r+","+c);
        node =node.children.get(board[r][c]);
        word+=board[r][c];
        if(node.isWord){
            res.add(word);
            root.removeWord(word);
        }
        dfs(r + 1, c, node, word, board, res, visit, root);
        dfs(r - 1, c, node, word, board, res, visit, root);
        dfs(r, c + 1, node, word, board, res, visit, root);
        dfs(r, c - 1, node, word, board, res, visit, root);
        visit.remove(r + "," + c);
    }
}
