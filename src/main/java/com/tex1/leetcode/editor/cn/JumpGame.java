package com.tex1.leetcode.editor.cn;

public class JumpGame{
    public static void main(String[] args) {
        Solution solution = new JumpGame().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canJump(int[] nums) {
            int farest = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                farest = Math.max(farest, i + nums[i]);
                if (farest <= i) {
                    return false;
                }
            }
            return farest >= nums.length - 1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}