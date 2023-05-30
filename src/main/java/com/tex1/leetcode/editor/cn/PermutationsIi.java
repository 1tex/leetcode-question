package com.tex1.leetcode.editor.cn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermutationsIi{
    public static void main(String[] args) {
        Solution solution = new PermutationsIi().new Solution();
        //test here...
        int[] nums = {1, 1, 2};
        System.out.println(solution.permuteUnique(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        boolean[] used;
        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            used = new boolean[nums.length];
            backtrace(nums);
            return res;
        }

        private void backtrace(int[] nums) {
            if (track.size() == nums.length) {
                res.add(new LinkedList(track));
            }

            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) {
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