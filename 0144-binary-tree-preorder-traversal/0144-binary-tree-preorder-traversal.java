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
    
    public List<Integer> preorderTraversal(TreeNode root) {    
        if(root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversalLeft(root.left);
        preorderTraversalRight(root.right);
        return list;
    }

    public void preorderTraversalLeft(TreeNode node) {
        if(node == null) {
            return;
        }
        list.add(node.val);
        preorderTraversalLeft(node.left);
        preorderTraversalRight(node.right);
    }

    public void preorderTraversalRight(TreeNode node) {
        if(node == null) {
            return;
        }
        list.add(node.val);
        preorderTraversalLeft(node.left);
        preorderTraversalLeft(node.right);
    }
}