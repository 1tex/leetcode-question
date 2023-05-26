package com.tex1.leetcode.editor.cn;

import java.util.Random;

public class SortAnArray{
    public static void main(String[] args) {
        Solution solution = new SortAnArray().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArray(int[] nums) {
            shuffle(nums);
            sort(nums, 0 ,nums.length - 1);
            return nums;
        }

        void sort(int[] nums, int lo, int hi) {
            if (lo >= hi) {
                return;
            }
            int p = partition(nums, lo, hi);
            sort(nums, lo, p - 1);
            sort(nums, p + 1, hi);
        }

        int partition(int[] nums, int lo, int hi) {
            int povit = nums[lo];
            int left = lo + 1, right = hi;
            while (left <= right) {
                while (left < hi && nums[left] <= povit) {
                    left++;
                }
                while (lo < right && nums[right] > povit) {
                    right--;
                }

                if (left >= right) {
                    break;
                } else {
                    swap(nums, left, right);
                }
            }

            swap(nums, lo, right);
            return right;
        }

        void shuffle(int[] nums) {
            Random rand = new Random();
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                int r = i + rand.nextInt(n - i);
                swap(nums, i, r);
            }
        }

        void swap(int[] nums, int a, int b) {
            int temp = nums[b];
            nums[b] = nums[a];
            nums[a] = temp;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}