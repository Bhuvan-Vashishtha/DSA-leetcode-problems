class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            pre[i] = nums[i+1]*pre[i+1];
        }
        suff[0] = 1;
        for(int i=1;i<n;i++){
            suff[i] = nums[i-1]*suff[i-1];
        }
        for(int i=0;i<n;i++){
            res[i] = pre[i]*suff[i];
        }
        return res;
    }
}