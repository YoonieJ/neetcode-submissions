class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minVal = prices[0];
        for (int i=0; i<prices.length-1; i++){
            if (prices[i+1] < minVal){
                minVal = prices[i+1];
            }
            else if (prices[i+1]- minVal > maxProfit) {
                maxProfit = prices[i+1]- minVal;
            }
        }
        return maxProfit;
    }
}
