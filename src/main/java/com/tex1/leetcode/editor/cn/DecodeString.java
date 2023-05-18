package com.tex1.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Stack;

public class DecodeString{
    public static void main(String[] args) {
        Solution solution = new DecodeString().new Solution();
        //test here...
        String s = "3[a]2[bc]";
        solution.decodeString(s);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String decodeString(String s) {
            StringBuffer res = new StringBuffer();
            int multi = 0;
            LinkedList<Integer> stack_multi = new LinkedList<>();
            LinkedList<String> stack_res = new LinkedList<>();
            for (Character c : s.toCharArray()) {
                if (c == '[') {
                    stack_multi.addLast(multi);
                    stack_res.addLast(res.toString());
                    multi = 0;
                    res = new StringBuffer();
                } else if (c == ']') {
                    StringBuffer tmp = new StringBuffer();
                    int cur_multi = stack_multi.removeLast();
                    for (int i = 0; i < cur_multi; i++) {
                        tmp.append(res);
                    }
                    res = new StringBuffer(stack_res.removeLast() + tmp);
                } else if (c >= '0' && c <='9') {
                    multi = multi * 10 + Integer.parseInt(c + "");
                } else {
                    res.append(c);
                }
            }
            return res.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}