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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<>();
        if(root == null) return result;
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        nodes.add(null);
        while(!nodes.isEmpty()){
            TreeNode curr = nodes.poll();
            if(curr == null){
                result.add(new ArrayList<>(ans));
                ans.clear();
                if(!nodes.isEmpty()){
                nodes.offer(null);
                }
            }
            else{
                if(curr.left != null) nodes.offer(curr.left);
                if(curr.right != null) nodes.offer(curr.right);
                ans.add(curr.val);
            }
        }
        return result;
    }
}