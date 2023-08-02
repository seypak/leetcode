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
    public boolean isSymmetric(TreeNode root) {
        // 1. root.left: a == root.right:b
        // 2. a.left == b.right
        // 2-1. a.right == b.left
        
        if(root == null) {
            return true;
        }

        return test(root.left, root.right);
    }

    public boolean test(TreeNode a, TreeNode b) {
        if(a == null && b == null) {
            return true;
        }
        if(a == null || b == null) {
            return false;
        }
        return (a.val == b.val) && test(a.left, b.right) && test(a.right, b.left);
    }
}