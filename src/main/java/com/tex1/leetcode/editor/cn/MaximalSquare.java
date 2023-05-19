package com.tex1.leetcode.editor.cn;

public class MaximalSquare{
    public static void main(String[] args) {
        Solution solution = new MaximalSquare().new Solution();
        //test here...

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[][] dp;
        public int maximalSquare(char[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                dp[i][0] = matrix[i][0] - '0';
            }
            for (int j = 0; j < n; j++) {
                dp[0][j] = matrix[0][j] - '0';
            }
            int max = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    max = Math.max(max, dp(matrix, i, j));
                }
            }
            return max * max;
        }

        private int dp(char[][] matrix, int i, int j) {
            if (i < 0 || j < 0) {
                return 0;
            }
            if (dp[i][j] > 0) {
                return dp[i][j];
            }
            if (matrix[i][j] == '1') {
                dp[i][j] = Math.min(dp(matrix, i - 1, j - 1), Math.min(dp(matrix, i - 1, j), dp(matrix, i, j - 1))) + 1;
            }
            return dp[i][j];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}