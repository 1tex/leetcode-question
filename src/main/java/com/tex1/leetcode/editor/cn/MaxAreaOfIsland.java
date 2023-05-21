package com.tex1.leetcode.editor.cn;

public class MaxAreaOfIsland{
    public static void main(String[] args) {
        Solution solution = new MaxAreaOfIsland().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            int res = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        res = Math.max(res, dfs(grid, i, j));
                    }
                }
            }
            return res;
        }

        int dfs(int[][] grid, int x, int y) {
            int m = grid.length, n = grid[0].length;
            if (x < 0 || y < 0 || x >= m || y >= n) {
                return 0;
            }
            if (grid[x][y] == 0) {
                return 0;
            }
            grid[x][y] = 0;
            return dfs(grid, x - 1, y)
                    + dfs(grid, x + 1, y)
                    + dfs(grid, x, y - 1)
                    + dfs(grid, x, y + 1) + 1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}