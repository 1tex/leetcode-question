package com.tex1.leetcode.editor.cn;

public class TrappingRainWater{
    public static void main(String[] args) {
        Solution solution = new TrappingRainWater().new Solution();
        //test here...
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution.trap(height));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trap(int[] height) {
            int n = height.length;
            if (n == 0) {
                return 0;
            }
            int res = 0;
            int[] lMax = new int[n];
            int[] rMax = new int[n];
            lMax[0] = height[0];
            rMax[n - 1] = height[n - 1];
            for (int i = 1; i < n; i++) {
                lMax[i] = Math.max(lMax[i - 1], height[i]);
            }
            for (int i = n - 2; i >= 0; i--) {
                rMax[i] = Math.max(rMax[i + 1], height[i]);
            }
            for (int i = 0; i < n; i++) {
                res += Math.min(lMax[i], rMax[i]) - height[i];
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}