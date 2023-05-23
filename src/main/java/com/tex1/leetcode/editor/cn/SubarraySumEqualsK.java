package com.tex1.leetcode.editor.cn;

import java.util.HashMap;

public class SubarraySumEqualsK{
    public static void main(String[] args) {
        Solution solution = new SubarraySumEqualsK().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0, pre = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            for (int num : nums) {
                pre += num;
                if (map.containsKey(pre - k)) {
                    count += map.get(pre - k);
                }
                map.put(pre, map.getOrDefault(pre, 0) + 1);
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}