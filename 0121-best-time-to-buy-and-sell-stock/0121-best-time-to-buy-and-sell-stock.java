class Solution {
    public int maxProfit(int[] prices) {
        // If the array is empty or has one element, no profit can be made.
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to a very large number
        int maxProfit = 0;


        for (int price : prices) {
            // Update the minimum price seen so far
            minPrice = Math.min(minPrice, price);

            // Calculate potential profit and update maxProfit if it's higher
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit for [7, 1, 5, 3, 6, 4] is: " + sol.maxProfit(prices1)); 

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max profit for [7, 6, 4, 3, 1] is: " + sol.maxProfit(prices2));
    }
}