package Arrays.july7;

public class Stocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

//        if(prices.length<=0){
//            return -1;
//        }

        int minPrice = prices[0];  // Initialize with the first price
        int maxProfit = 0;         // Initialize the profit as 0

        for (int i = 1; i < prices.length; i++) {
            // Find the min stock price encountered so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate the profit if we sell on day i
            int currentProfit = prices[i] - minPrice;

            // Update maxProfit if we found a higher profit
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        System.out.println(maxProfit);  // Output the maximum profit
    }
}
