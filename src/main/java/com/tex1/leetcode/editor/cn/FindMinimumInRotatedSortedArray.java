package com.tex1.leetcode.editor.cn;

public class FindMinimumInRotatedSortedArray{
    public static void main(String[] args) {
        Solution solution = new FindMinimumInRotatedSortedArray().new Solution();
        //test here...
        int[] nums = {3,4,5,1,2};
        System.out.println(solution.findMin(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMin(int[] nums) {
            int len = nums.length;
            if (len == 0) {
                return 0;
            }

            if (nums[0] < nums[len - 1]) {
                return nums[0];
            } else {
                int left = 0, right = len - 1;
                while (left < right) {
                    int mid = (left + right) >>> 1;
                    if (nums[mid] < nums[right]) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                return nums[left];
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}