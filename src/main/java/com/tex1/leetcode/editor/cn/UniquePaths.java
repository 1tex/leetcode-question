package com.tex1.leetcode.editor.cn;

public class UniquePaths{
    public static void main(String[] args) {
        Solution solution = new UniquePaths().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int memo[][];
        public int uniquePaths(int m, int n) {
            memo = new int[m][n];
            return dp(m - 1, n - 1);
        }

        private int dp(int m, int n) {
            if (m == 0 || n == 0) {
                return 1;
            }
            if (memo[m][n] != 0) {
                return memo[m][n];
            }
            memo[m][n] = dp(m - 1, n) + dp(m, n - 1);
            return memo[m][n];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}