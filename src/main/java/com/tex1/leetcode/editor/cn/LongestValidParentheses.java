package com.tex1.leetcode.editor.cn;

import java.util.Stack;

public class LongestValidParentheses{
    public static void main(String[] args) {
        Solution solution = new LongestValidParentheses().new Solution();
        //test here...
        solution.longestValidParentheses("(()");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        Stack<Integer> stk = new Stack<>();
        public int longestValidParentheses(String s) {
            int[] dp = new int[s.length() + 1];
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '(') {
                    stk.push(i);
                    dp[i + 1] = 0;
                } else {
                    if (!stk.isEmpty()) {
                        int left = stk.pop();
                        int len = 1 + i - left + dp[left];
                        dp[i + 1] = len;
                    } else {
                        dp[i + 1] = 0;
                    }
                }
            }
            int res = 0;
            for (int i = 0; i < dp.length; i++) {
                res = Math.max(res, dp[i]);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}