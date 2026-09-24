class Solution {
    public int longestOnes(int[] nums, int k) {
        int z = 0;
        int r = 0;
        int l = 0;
        int maxLen = 0;
        int n = nums.length;
        while(r<n){
            if(nums[r] == 0) z++;
            while(z>k){
                if(nums[l] == 0) z--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}