package com.tex1.leetcode.editor.cn;

import java.util.Arrays;

public class MinimumPathSum{
    public static void main(String[] args) {
        Solution solution = new MinimumPathSum().new Solution();
        //test here...
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        solution.minPathSum(grid);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[][] memo;
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            memo = new int[m][n];
            for (int[] row : memo) {
                Arrays.fill(row, -1);
            }

            int i = dp(grid, m - 1, n - 1);
            return i;
        }

        int dp(int[][] grid, int i, int j) {
            if (i < 0 || j < 0) {
                return Integer.MAX_VALUE;
            }

            if (memo[i][j] != -1) {
                return memo[i][j];
            }

            if (i == 0 && j == 0) {
                memo[i][j] = grid[i][j];
            } else {
                memo[i][j] = Math.min (dp(grid, i - 1, j), dp(grid, i, j - 1)) + grid[i][j];
            }

            return memo[i][j];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}