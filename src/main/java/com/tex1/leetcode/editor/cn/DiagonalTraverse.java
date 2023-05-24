package com.tex1.leetcode.editor.cn;

public class DiagonalTraverse{
    public static void main(String[] args) {
        Solution solution = new DiagonalTraverse().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length, n = mat[0].length;
            int[] res = new int[m * n];
            int pos = 0;
            for (int i = 0; i < m + n - 1; i++) {
                if (i % 2 == 1) {
                    int x = i < n ? 0 : i - n + 1;
                    int y = i < n ? i : n - 1;
                    while (x < m && y >= 0) {
                        res[pos] = mat[x][y];
                        pos++;
                        x++;
                        y--;
                    }
                } else {
                    int x = i < m ? i : m - 1;
                    int y = i < m ? 0 : i - m + 1;
                    while (x >= 0 && y < n) {
                        res[pos] = mat[x][y];
                        pos++;
                        x--;
                        y++;
                    }
                }
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}