package com.tex1.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum{
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
        //test here...
        int[] candidates = {2,3,6,7};
        int target = 7;
        solution.combinationSum(candidates, target);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            if (candidates.length == 0) {
                return res;
            }
            backtrace(candidates, 0, target, 0);
            return res;
        }

        private void backtrace(int[] candidates, int start, int target, int sum) {
            if (sum == target) {
                res.add(new LinkedList<>(track));
                return;
            }
            if (sum > target) {
                return;
            }

            for (int i = start; i < candidates.length; i++) {
                track.add(candidates[i]);
                sum += candidates[i];
                backtrace(candidates, i, target, sum);
                track.removeLast();
                sum -= candidates[i];
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}