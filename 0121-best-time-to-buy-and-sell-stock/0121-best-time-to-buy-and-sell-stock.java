class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int n = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int profit = prices[i]-buy;
            if(profit<0){
                buy = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}