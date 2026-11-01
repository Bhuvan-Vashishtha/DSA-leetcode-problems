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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        nodes.offer(null);
        int ans = root.val;
        while(!nodes.isEmpty()){
            TreeNode curr = nodes.poll();
            if(curr == null){
                result.add(ans);
                if(!nodes.isEmpty()) nodes.offer(null);
            }
            else{
                if(curr.left != null) nodes.offer(curr.left);
                if(curr.right != null) nodes.offer(curr.right);
                ans = curr.val;
            }
        }
        return result;
    }
}