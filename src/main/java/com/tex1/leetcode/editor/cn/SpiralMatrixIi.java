package com.tex1.leetcode.editor.cn;

public class SpiralMatrixIi{
    public static void main(String[] args) {
        Solution solution = new SpiralMatrixIi().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int num = 1;
            int left_bound = 0, right_bound = n - 1;
            int upper_bound = 0, lower_bound = n - 1;
            while (num <= n * n) {
                if (upper_bound <= lower_bound) {
                    for (int j = left_bound; j <= right_bound; j++) {
                        matrix[upper_bound][j] = num++;
                    }
                    upper_bound++;
                }

                if (left_bound <= right_bound) {
                    for (int i = upper_bound; i <= lower_bound; i++) {
                        matrix[i][right_bound] = num++;
                    }
                    right_bound--;
                }

                if (upper_bound <= lower_bound) {
                    for (int j = right_bound; j >= left_bound; j--) {
                        matrix[lower_bound][j] = num++;
                    }
                    lower_bound--;
                }

                if (left_bound <= right_bound) {
                    for (int i = lower_bound; i >= upper_bound; i--) {
                        matrix[i][left_bound] = num++;
                    }
                    left_bound++;
                }
            }
            return matrix;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}