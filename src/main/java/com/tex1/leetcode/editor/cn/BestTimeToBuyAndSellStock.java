package com.tex1.leetcode.editor.cn;

public class BestTimeToBuyAndSellStock{
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStock().new Solution();
        //test here...
        int nums[] = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    // 买卖股票的最佳时机
    class Solution {
        public int maxProfit(int[] prices) {
            int min = prices[0], profit = 0;
            for (int price : prices) {
                min = Math.min(min, price);
                profit = Math.max(profit, price - min);
            }
            return profit;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}