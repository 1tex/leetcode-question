package com.tex1.leetcode.editor.cn;

import java.util.Stack;

public class IIQa4I{
    public static void main(String[] args) {
        Solution solution = new IIQa4I().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] res = new int[n];
            Stack<Integer> s = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]) {
                    s.pop();
                }
                res[i] = s.isEmpty() ? 0 : s.peek() - i;
                s.push(i);
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}