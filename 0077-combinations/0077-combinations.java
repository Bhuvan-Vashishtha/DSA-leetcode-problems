class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        solver(n, k, res, new ArrayList<>(), 1);
        return res;
    }
    static void solver(int n, int k, List<List<Integer>> res, List<Integer> ans, int idx){
        if(ans.size() == k){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx;i<=n;i++){
            ans.add(i);
            solver(n, k, res, ans, i+1);
            ans.remove(ans.size()-1);
        }
    }
}