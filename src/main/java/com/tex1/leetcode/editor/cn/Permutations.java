package com.tex1.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

public class Permutations{
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
        //test here...
        int[] nums = {1, 2, 3};
        System.out.println(solution.permute(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        boolean[] used;
        public List<List<Integer>> permute(int[] nums) {
            used = new boolean[nums.length];
            backtrace(nums);
            return res;
        }

        void backtrace(int[] nums) {
            if (track.size() == nums.length) {
                res.add(new LinkedList<>(track));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                track.add(nums[i]);
                used[i] = true;
                backtrace(nums);
                used[i] = false;
                track.removeLast();
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}