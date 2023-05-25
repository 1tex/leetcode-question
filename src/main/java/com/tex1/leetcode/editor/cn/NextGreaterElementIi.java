package com.tex1.leetcode.editor.cn;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementIi{
    public static void main(String[] args) {
        Solution solution = new NextGreaterElementIi().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int len = nums.length;
            int res[] = new int[len];
            Arrays.fill(res, -1);
            Stack<Integer> s = new Stack<>();

            for (int i = 0; i < 2 * len; i++) {
                while (!s.isEmpty() && nums[i % len] > nums[s.peek()]) {
                    res[s.pop()] = nums[i % len];
                }
                s.push(i % len);
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}