class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for(int i=1; i<prices.length; i++) {
            int nextVal = prices[i];
            max = Math.max(nextVal-min, max);
            if(min > nextVal) {
                min = nextVal;
            }
        }
        return max;
    }
}