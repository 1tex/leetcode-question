package com.tex1.leetcode.editor.cn;

public class BestTimeToBuyAndSellStockIv{
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStockIv().new Solution();
        //test here...
        int[] prices = {3,2,6,5,0,3};
        System.out.println(solution.maxProfit(2, prices));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int k, int[] prices) {
            int len = prices.length;
            int dp[][][] = new int[len][k + 1][2];
            for (int i = 0; i < len; i++) {
                for (int j = k; j > 0; j--) {
                    if (i == 0) {
                        dp[i][j][0] = 0;
                        dp[i][j][1] = -prices[i];
                        continue;
                    }
                    dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                    dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
                }
            }
            return dp[len - 1][k][0];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}