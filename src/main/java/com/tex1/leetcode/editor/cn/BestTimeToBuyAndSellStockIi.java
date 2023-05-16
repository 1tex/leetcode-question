package com.tex1.leetcode.editor.cn;

public class BestTimeToBuyAndSellStockIi{
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStockIi().new Solution();
        //test here...
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    // dp
    class Solution {
        public int maxProfit(int[] prices) {
            int len = prices.length;
            int[][] dp = new int[len][2];
            dp[0][0] = 0;
            dp[0][1] = -prices[0];
            for (int i = 1; i < len; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            }
            return dp[len - 1][0];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}