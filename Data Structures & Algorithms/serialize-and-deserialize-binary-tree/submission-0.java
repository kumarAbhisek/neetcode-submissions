/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res = new ArrayList<>();
        preorder(root,res);
        System.out.println(res);
        return String.join(",",res);
    }
    public void preorder(TreeNode root, List<String> res){
        if (root == null){
            res.add("N");
            return;
            
        }
        res.add(String.valueOf(root.val));
        preorder(root.left,res);
        preorder(root.right,res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] val = data.split(",");
        int [] i = {0};
        
    return preorderprint(val,i);    }
    public TreeNode preorderprint(String []val,int []i){
        if(val[i[0]].equals("N")){
            i[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val[i[0]]));
        i[0]++;
        node.left= preorderprint(val,i);
        node.right=preorderprint(val,i);
        return node;
    }
}
