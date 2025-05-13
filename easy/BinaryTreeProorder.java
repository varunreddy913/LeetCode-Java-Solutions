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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        build(root,l);
        return l;
    }
    public void build(TreeNode root,List<Integer> l){
        if(root==null){return;}
        l.add(root.val);
        build(root.left,l);
        build(root.right,l);
    }
}