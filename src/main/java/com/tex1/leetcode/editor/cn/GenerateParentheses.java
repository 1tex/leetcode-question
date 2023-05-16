package com.tex1.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses{
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> res = new LinkedList<>();

        public List<String> generateParenthesis(int n) {
            backtrace(n, 0, 0, "");
            return res;
        }

        private void backtrace(int n, int left, int right, String track) {
            if (left == n && right == n) {
                res.add(track);
            }
            if (left < right) {
                return;
            }
            if (left < n) {
                backtrace(n, left + 1, right, track + "(");
            }
            if (right < n) {
                backtrace(n, left, right + 1, track + ")");
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}