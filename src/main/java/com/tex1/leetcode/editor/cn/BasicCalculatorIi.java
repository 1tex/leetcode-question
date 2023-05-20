package com.tex1.leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

public class BasicCalculatorIi{
    public static void main(String[] args) {
        Solution solution = new BasicCalculatorIi().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int calculate(String s) {
            Deque<Character> deque = new LinkedList<>();
            for (char c : s.toCharArray()) {
                deque.add(c);
            }
            return helper(deque);
        }

        private int helper(Deque<Character> s) {
            Deque<Integer> stack = new LinkedList<>();
            char sign = '+';
            int num = 0;

            while (!s.isEmpty()) {
                char c = s.poll();
                if (Character.isDigit(c)) {
                    num = num * 10 + Character.getNumericValue(c);
                }
                if ((!Character.isDigit(c) && c != ' ') || s.isEmpty()) {
                    if (sign == '+') {
                        stack.push(num);
                    } else if (sign == '-') {
                        stack.push(-num);
                    } else if (sign == '*') {
                        stack.push(
                                stack.pop() * num
                        );
                    } else if (sign == '/') {
                        stack.push(
                                stack.pop() / num
                        );
                    }
                    num = 0;
                    sign = c;
                }

            }
            int res = 0;
            for (int i : stack) {
                res += i;
            }
            return res;

        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}