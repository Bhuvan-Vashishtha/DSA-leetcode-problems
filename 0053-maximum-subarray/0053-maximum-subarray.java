class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int t=Integer.MIN_VALUE;;
        for(int i=0;i<nums.length;i++){
            t= Math.max(nums[i],t);
            currSum+=nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum==0 ? t : maxSum;
    }
    }
