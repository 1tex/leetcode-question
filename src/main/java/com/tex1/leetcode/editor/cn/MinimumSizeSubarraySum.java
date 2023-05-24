package com.tex1.leetcode.editor.cn;

public class MinimumSizeSubarraySum{
    public static void main(String[] args) {
        Solution solution = new MinimumSizeSubarraySum().new Solution();
        //test here...
        int[] nums = {1,2,3,4,5};
        int target = 15;
        System.out.println(solution.minSubArrayLen(target, nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int slow = 0, fast = 0, sum = 0, ans = Integer.MAX_VALUE;
            while (fast < n) {
                while (sum < target && fast < n) {
                    sum += nums[fast];
                    fast++;
                }
                while (sum >= target) {
                    ans = Math.min(ans, fast - slow);
                    sum -= nums[slow];
                    slow++;
                }
            }
            if (ans == Integer.MAX_VALUE) {
                return 0;
            } else {
                return ans;
            }

        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}