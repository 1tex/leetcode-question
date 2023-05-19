package com.tex1.leetcode.editor.cn;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        //test here...
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] res = new int[]{-1, -1};
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] == target) {
                    int l = mid, r = mid;
                    while (l >= 0 && nums[l] == target) {
                        l--;
                    }
                    while (r < nums.length && nums[r] == target) {
                        r++;
                    }
                    res[0] = l + 1;
                    res[1] = r - 1;
                    break;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                }
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
