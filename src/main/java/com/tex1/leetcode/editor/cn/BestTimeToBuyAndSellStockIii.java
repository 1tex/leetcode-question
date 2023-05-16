package com.tex1.leetcode.editor.cn;

public class BestTimeToBuyAndSellStockIii{
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStockIii().new Solution();
        //test here...
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(solution.maxProfit(prices));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int[][][] dp = new int[n][3][2];
            for (int i = 0; i < n; i++) {
                for (int k = 2; k > 0; k--) {
                    if (i == 0) {
                        dp[i][k][0] = 0;
                        dp[i][k][1] = -prices[i];
                        continue;
                    }
                    dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
                    dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
                }
            }
            return dp[n - 1][2][0];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}