package com.tex1.leetcode.editor.cn;

import java.util.Arrays;

public class RotateImage{
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Solution solution = new RotateImage().new Solution();
        //test here...
        solution.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    exchange(matrix, i, j, j, i);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0;j < n / 2; j++) {
                    exchange(matrix, i, j, i, n - 1 - j);
                }
            }
        }
        void exchange(int[][] matrix, int a, int b, int c, int d) {
            int temp = matrix[a][b];
            matrix[a][b] = matrix[c][d];
            matrix[c][d] = temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}