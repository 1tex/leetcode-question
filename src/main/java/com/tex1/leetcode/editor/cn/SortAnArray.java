package com.tex1.leetcode.editor.cn;

import java.util.Random;

public class SortAnArray{
    public static void main(String[] args) {
        Solution solution = new SortAnArray().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public static int[] temp;

        public int[] sortArray(int[] nums) {
            sort(nums);
            return nums;
        }

        public static void sort(int[] nums) {
            temp = new int[nums.length];
            sort(nums, 0, nums.length - 1);
        }

        public static void sort(int[] nums, int lo, int hi) {
            if (lo == hi) {
                return;
            }
            int mid = lo + (hi - lo) / 2;
            sort(nums, lo, mid);
            sort(nums, mid + 1, hi);
            merge(nums, lo, mid, hi);
        }

        public static void merge(int[] nums, int lo, int mid, int hi) {
            for (int i = lo; i <= hi; i++) {
                temp[i] = nums[i];
            }

            int i = lo, j = mid + 1;
            for (int p = lo; p <= hi; p++) {
                if (i == mid + 1) {
                    nums[p] = temp[j++];
                } else if (j == hi + 1) {
                    nums[p] = temp[i++];
                } else if (temp[i] < temp[j]) {
                    nums[p] = temp[i++];
                } else {
                    nums[p] = temp[j++];
                }
            }
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}