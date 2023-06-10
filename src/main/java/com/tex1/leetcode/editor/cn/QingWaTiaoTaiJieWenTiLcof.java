package com.tex1.leetcode.editor.cn;

public class QingWaTiaoTaiJieWenTiLcof{
    public static void main(String[] args) {
        Solution solution = new QingWaTiaoTaiJieWenTiLcof().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numWays(int n) {
            int[] dp = new int[n + 1];
            if (n == 0 || n == 1) {
                return 1;
            }
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 1000_000_007;
            }
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}