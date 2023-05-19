package com.tex1.leetcode.editor.cn;

public class SearchA2dMatrixIi{
    public static void main(String[] args) {
        Solution solution = new SearchA2dMatrixIi().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length, n = matrix[0].length;
            int i = 0, j = n - 1;
            while (i < m && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] < target) {
                    i++;
                } else if (matrix[i][j] > target) {
                    j--;
                }
            }
            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}