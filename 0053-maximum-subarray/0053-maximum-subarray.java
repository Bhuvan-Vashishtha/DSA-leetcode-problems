class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = check(nums, n);
        if(max != 0){
            return max;
        }
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(curr < 0){
                curr = 0;
            }
            curr += nums[i];
            maxSum = Math.max(curr, maxSum);
        }
        return maxSum;
    }
    static int check(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>0) return 0;
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}