package com.tex1.leetcode.editor.cn;

public class SingleNumber{
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;
            for (int num : nums) {
                res ^= num;
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}