package com.tex1.leetcode.editor.cn;

import java.util.Arrays;

public class HouseRobber{
    public static void main(String[] args) {
        Solution solution = new HouseRobber().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        int[] memo;

        public int rob(int[] nums) {
            memo = new int[nums.length];
            Arrays.fill(memo, -1);
            return dp(nums, 0);
        }

        int dp(int[] nums, int go) {
            if (go >= nums.length) {
                return 0;
            }
            if (memo[go] != -1) {
                return memo[go];
            }
            memo[go] = Math.max(
                    dp(nums, go + 1),
                    dp(nums, go + 2) + nums[go]
            );
            return memo[go];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}