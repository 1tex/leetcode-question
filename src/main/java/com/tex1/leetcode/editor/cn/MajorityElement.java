package com.tex1.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement{
    public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> count = countnums(nums);
            Map.Entry<Integer, Integer> majorityEntry = null;

            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                    majorityEntry = entry;
                }

            }
            return majorityEntry.getKey();
        }

        private Map<Integer, Integer> countnums(int[] nums) {
            Map<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                if (!count.containsKey(num)) {
                    count.put(num, 1);
                } else {
                    count.put(num, count.get(num) + 1);
                }
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}