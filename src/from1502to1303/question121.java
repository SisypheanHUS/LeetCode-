public class question121 {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int currentBuy = 999999;
        int currentProfit = 0;
        for(int i = 0;i <prices.length;i++){
            if(prices[i] < currentBuy) currentBuy = prices[i];
            currentProfit = prices[i] - currentBuy;
            if(currentProfit > maxprofit) maxprofit = currentProfit;
        }
        return maxprofit;
    }
}
