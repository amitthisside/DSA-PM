class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        
        for(int i = 1; i < prices.length; i++) {
            if (prices[i] > min)
                profit = Math.max(profit, prices[i] - min);
            else
                min = prices[i];
        }
        
        return profit;
    }
}
