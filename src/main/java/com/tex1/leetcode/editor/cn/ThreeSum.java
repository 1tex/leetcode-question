package com.tex1.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        //test here...
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums));
        System.out.println(11);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    // 三数之和
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            // 排序
            Arrays.sort(nums);
            // 遍历
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) {
                    break;
                }
                // 去重
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                // 双指针
                int left = i + 1;
                int right = len - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum > 0) {
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        right--;
                        left++;
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}