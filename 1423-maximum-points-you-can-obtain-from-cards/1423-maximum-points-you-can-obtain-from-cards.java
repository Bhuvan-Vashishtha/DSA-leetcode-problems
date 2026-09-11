class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lSum = 0;
        int rSum = 0;
        for(int i=0;i<k;i++){
            lSum += cardPoints[i];
        }
        int l =k-1;
        int r = n-1;
        int maxSum = Integer.MIN_VALUE;
        while(l>=0){
            int sum = lSum + rSum;
            maxSum = Math.max(maxSum, sum);
            lSum -= cardPoints[l];
            rSum += cardPoints[r];
            l--;
            r--;
        }
        return Math.max(maxSum, Math.max(lSum, rSum));
    }
}