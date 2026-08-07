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
    int ans = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        mxPS(root);
        return ans;
        
    }

    public int mxPS(TreeNode root){
        if(root == null) return 0;

        int l = Math.max(0, mxPS(root.left));
        int r = Math.max(0, mxPS(root.right));

        ans = Math.max(ans, l+r+root.val);

        return root.val + Math.max(l, r);
    }
}