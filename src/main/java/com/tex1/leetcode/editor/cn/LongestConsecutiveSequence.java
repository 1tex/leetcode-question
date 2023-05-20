package com.tex1.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class LongestConsecutiveSequence{
    public static void main(String[] args) {
        Solution solution = new LongestConsecutiveSequence().new Solution();
        //test here...
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(solution.longestConsecutive(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            int res = 0;
            for (int num : set) {
                if (set.contains(num - 1)) {
                    continue;
                } else {
                    int count = 1;

                    while (set.contains(num + 1)) {
                        count++;
                        num++;
                    }
                    res = Math.max(res, count);
                }
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}