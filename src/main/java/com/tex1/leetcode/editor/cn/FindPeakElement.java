package com.tex1.leetcode.editor.cn;

public class FindPeakElement{
    public static void main(String[] args) {
        Solution solution = new FindPeakElement().new Solution();
        //test here...
        int[] nums = {1,2,3};
        solution.findPeakElement(nums);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = (left + right) >>> 1;
                if (nums[mid] > nums[mid + 1]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}