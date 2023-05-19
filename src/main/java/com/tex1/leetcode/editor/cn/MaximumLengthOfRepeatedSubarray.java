package com.tex1.leetcode.editor.cn;

public class MaximumLengthOfRepeatedSubarray{
    public static void main(String[] args) {
        Solution solution = new MaximumLengthOfRepeatedSubarray().new Solution();
        //test here...

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findLength(int[] nums1, int[] nums2) {
            int m = nums1.length, n = nums2.length;
            int[][] dp = new int[m + 1][n + 1];
            int max = 0;
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    dp[i][j] = nums1[i] == nums2[j] ? dp[i + 1][j + 1] + 1 : 0;
                    max = Math.max(dp[i][j], max);
                }
            }
            return max;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}