package com.tex1.leetcode.editor.cn;

public class ContainerWithMostWater{
    public static void main(String[] args) {
        Solution solution = new ContainerWithMostWater().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int max = 0;
            while (left < right) {
                int s = Math.min(height[left], height[right]) * (right - left);
                max = Math.max(s, max);
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
           return max;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}