package com.tex1.leetcode.editor.cn;

public class ShuZuZhongDeNiXuDuiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongDeNiXuDuiLcof().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private int[] temp;

        public int reversePairs(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            sort(nums);
            return count;
        }

        public void sort(int[] nums) {
            temp = new int[nums.length];
            sort(nums, 0, nums.length - 1);
        }

        public void sort(int[] nums, int lo, int hi) {
            if (lo == hi) {
                return;
            }
            int mid = lo + (hi - lo) / 2;
            sort(nums, lo, mid);
            sort(nums, mid + 1, hi);
            merge(nums, lo, mid, hi);
        }

        private int count = 0;

        public void merge(int[] nums, int lo, int mid, int hi) {
            for (int i = lo; i <= hi; i++) {
                temp[i] = nums[i];
            }

            int end = mid + 1;
            for (int i = lo; i <= mid; i++) {
                while (end <= hi && nums[i] > nums[end]) {
                    end++;
                }
                count += end - (mid + 1);
            }

            int i = lo, j = mid + 1;
            for (int p = lo; p <= hi; p++) {
                if (i == mid + 1) {
                    nums[p] = temp[j++];
                } else if (j == hi + 1) {
                    nums[p] = temp[i++];
                } else if (temp[i] > temp[j]) {
                    nums[p] = temp[j++];
                } else {
                    nums[p] = temp[i++];
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}