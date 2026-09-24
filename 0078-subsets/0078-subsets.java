class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), result);
        return result;
    }
    static void solve(int[] nums, int idx, List<Integer> ans, List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[idx]);
        solve(nums, idx+1, ans, result);
        ans.remove(ans.size()-1);
        solve(nums, idx+1, ans, result);
    }
}