package com.tex1.leetcode.editor.cn;

public class LianXuZiShuZuDeZuiDaHeLcof{
    public static void main(String[] args) {
        Solution solution = new LianXuZiShuZuDeZuiDaHeLcof().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[] dp;
        int max = Integer.MIN_VALUE;
        public int maxSubArray(int[] nums) {
            int len = nums.length;
            dp = new int[len + 1];
            dp(nums, len - 1);
            return max;
        }

        void dp(int[] nums, int i){
            if (i < 0) {
                return;
            }
            dp(nums, i - 1);
            dp[i] = i == 0 ? nums[i] : Math.max(dp[i - 1] + nums[i], nums[i]);
            if (dp[i] > max) {
                max = dp[i];
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}