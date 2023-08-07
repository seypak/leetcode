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
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        // root.left = null
        // root.right = 2
        // root.right.left = 3
        if(root == null) {
            return list;
        }
        postorderTraversalLeft(root.left);
        postorderTraversalRight(root.right);
        list.add(root.val);
        return list;
    }

    public void postorderTraversalLeft(TreeNode node) {
        if(node == null) {
            return;
        }
        
        postorderTraversalRight(node.left);
        postorderTraversalRight(node.right);
        list.add(node.val);
    }
    public void postorderTraversalRight(TreeNode node) {
        if(node == null) {
            return;
        }
        postorderTraversalLeft(node.left);
        postorderTraversalLeft(node.right);
        list.add(node.val);
    }
}