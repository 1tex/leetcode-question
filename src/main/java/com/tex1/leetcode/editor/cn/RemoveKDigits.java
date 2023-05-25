package com.tex1.leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveKDigits{
    public static void main(String[] args) {
        Solution solution = new RemoveKDigits().new Solution();
        //test here...
        String num = "1432219";
        int k = 3;
        System.out.println(solution.removeKdigits(num, k));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeKdigits(String num, int k) {
            Deque<Character> deque = new LinkedList<>();
            int len = num.length();
            for (int i = 0; i < len; i++) {
                while (!deque.isEmpty() && k > 0 && deque.peekLast() > num.charAt(i)) {
                    deque.pollLast();
                    k--;
                }
                deque.offerLast(num.charAt(i));
            }

            while (k > 0) {
                deque.pollLast();
                k--;
            }

            StringBuilder sb = new StringBuilder();
            while (!deque.isEmpty() && deque.peekFirst() == '0') {
                deque.pollFirst();
            }
            while (!deque.isEmpty()) {
                sb.append(deque.pollFirst());
            }
            return sb.length() == 0 ? "0" : sb.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}