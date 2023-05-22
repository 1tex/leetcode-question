package com.tex1.leetcode.editor.cn;

public class MaximumProductSubarray{
    public static void main(String[] args) {
        Solution solution = new MaximumProductSubarray().new Solution();
        //test here...
        int[] nums = {2,3,-2,4};
        System.out.println(solution.maxProduct(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProduct(int[] nums) {
            int n = nums.length;
            int[] dp1 = new int[n];
            int[] dp2 = new int[n];
            dp1[0] = nums[0];
            dp2[0] = nums[0];

            for (int i = 1; i < n; i++) {
                dp1[i] = Math.max(Math.max(dp1[i - 1] * nums[i], dp2[i - 1] * nums[i]), nums[i]);
                dp2[i] = Math.min(Math.min(dp1[i - 1] * nums[i], dp2[i - 1] * nums[i]), nums[i]);
            }

            int res = Integer.MIN_VALUE;
            for (int i : dp1) {
                res = Math.max(res, i);
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}