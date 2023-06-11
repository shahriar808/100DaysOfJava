package Java100.ArrayAndString;

public class BestTimeToBuyAndSellStock2 {
    public static int maxProfit(int[] prices) {
        int max_profit=0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                int current_profit = prices[i] - prices[i-1];
                max_profit += current_profit;
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
