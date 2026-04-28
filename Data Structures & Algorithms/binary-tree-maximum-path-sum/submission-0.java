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

class Solution {
    public int maxPathSum(TreeNode root) {

        int res [] = new int[]{root.val};
        maxsum(root,res);
        return res[0];
    }
    private int maxsum(TreeNode root,int[]res){
        if (root==null) {
            return 0;
        }
        int leftmax= Math.max(maxsum(root.left,res),0);
        int rightmax =Math.max(maxsum(root.right,res),0);
        res[0]= Math.max(res[0],root.val+leftmax+rightmax);
        return root.val + Math.max(leftmax,rightmax);
    }
}
