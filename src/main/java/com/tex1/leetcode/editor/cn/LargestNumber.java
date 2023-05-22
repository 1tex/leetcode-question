package com.tex1.leetcode.editor.cn;

import java.util.Arrays;

public class LargestNumber{
    public static void main(String[] args) {
        Solution solution = new LargestNumber().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String largestNumber(int[] nums) {
            int n = nums.length;
            String[] ss = new String[n];
            for (int i = 0; i < n; i++) {
                ss[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(ss, (a, b) -> {
                String sa = a + b, sb = b + a;
                return sb.compareTo(sa);
            });
            StringBuffer sb = new StringBuffer();
            for (String s : ss) {
                sb.append(s);
            }

            int k = 0;
            while (k < n - 1 && sb.charAt(k) == '0') {
                k++;
            }
            return sb.substring(k);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}