class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num : nums){
            int n = result.size();
            for(int j=0;j<n;j++){
                List<Integer> ans = new ArrayList<>(result.get(j));
                ans.add(num);
                result.add(ans);
            }
        }
        return result;
    }
}