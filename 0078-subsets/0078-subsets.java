class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), result);
        return result;
    }
    static void solve(int[] nums, int idx, List<Integer> ans, List<List<Integer>> result){
        
            result.add(new ArrayList<>(ans));
            
        for(int i=idx;i<nums.length;i++){
            ans.add(nums[i]);
            solve(nums, i+1, ans, result);
            ans.remove(ans.size()-1);
        }
    }
}