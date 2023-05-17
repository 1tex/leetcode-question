package com.tex1.leetcode.editor.cn;

import java.util.LinkedList;

public class SlidingWindowMaximum{
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        class motionQueue {
            LinkedList<Integer> q = new LinkedList<>();
            public void push(int n) {
                while(!q.isEmpty() && q.getLast() < n) {
                    q.pollLast();
                }
                q.addLast(n);
            }
            public int max() {
                return q.getFirst();
            }
            public void pop(int n) {
                if (q.getFirst() == n) {
                    q.pollFirst();
                }
            }
        }
        public int[] maxSlidingWindow(int[] nums, int k) {
            motionQueue window = new motionQueue();
            LinkedList<Integer> res = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                if (i < k - 1) {
                    window.push(nums[i]);
                } else {
                    window.push(nums[i]);
                    res.add(window.max());
                    window.pop(nums[i - k + 1]);
                }
            }
            return res.stream().mapToInt(Integer::intValue).toArray();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}