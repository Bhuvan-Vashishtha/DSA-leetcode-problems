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
            if(nodes.peek() == null){
                result.add(new ArrayList<>(ans));
                ans.clear();
                nodes.poll();
                if(!nodes.isEmpty()){
                nodes.offer(null);
                }
            }
            else{
                if(nodes.peek().left != null) nodes.offer(nodes.peek().left);
                if(nodes.peek().right != null) nodes.offer(nodes.peek().right);
                ans.add(nodes.peek().val);
                nodes.poll();
            }
        }
        return result;
    }
}