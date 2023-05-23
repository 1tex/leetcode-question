package com.tex1.leetcode.editor.cn;

public class MoveZeroes{
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        //test here...

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int slow = 0, fast = 0;
            for (int i = 0; i < n; i++) {
                if (nums[fast] == 0) {
                    fast++;
                } else {
                    swap(nums, fast, slow);
                    slow++;
                    fast++;
                }
                if (fast == n) {
                    break;
                }
            }
            for (int i = slow; i < n; i++) {
                nums[i] = 0;
            }
        }

        void swap(int[] nums, int fast, int slow) {
            nums[slow] = nums[fast];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}