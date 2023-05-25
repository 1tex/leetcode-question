package com.tex1.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BasicCalculator{
    public static void main(String[] args) {
        Solution solution = new BasicCalculator().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int calculate(String s) {
            Queue<Character> queueS = new LinkedList<>();
            for (char c : s.toCharArray()) {
                queueS.offer(c);
            }
            return calculate(queueS);
        }

        int calculate(Queue<Character> s) {
            Stack<Integer> stack = new Stack<>();
            char sign = '+';
            int num = 0;

            while (!s.isEmpty()) {
                char c = s.poll();
                if (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                }
                if (c == '(') {
                    num = calculate(s);
                }
                if ((!Character.isDigit(c) && c != ' ') || s.isEmpty()) {
                    switch (sign) {
                        case '+':
                            stack.push(num);
                            break;
                        case '-':
                            stack.push(-num);
                            break;
                        case '*':
                            stack.push(stack.pop() * num);
                            break;
                        case '/':
                            stack.push(stack.pop() / num);
                            break;
                    }
                    sign = c;
                    num = 0;
                }
                if (c == ')') {
                    break;
                }
            }

            int res = 0;
            while (!stack.isEmpty()) {
                res += stack.pop();
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}