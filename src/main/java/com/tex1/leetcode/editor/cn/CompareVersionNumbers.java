package com.tex1.leetcode.editor.cn;

public class CompareVersionNumbers{
    public static void main(String[] args) {
        Solution solution = new CompareVersionNumbers().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int compareVersion(String version1, String version2) {
            String[] a = version1.split("\\.");
            String[] b = version2.split("\\.");

            for (int i = 0; i < a.length || i < b.length; i++) {
                int x = 0, y = 0;
                if (i < a.length) {
                    x = Integer.parseInt(a[i]);
                }
                if (i < b.length) {
                    y = Integer.parseInt(b[i]);
                }
                if (x < y) {
                    return -1;
                }
                if (x > y) {
                    return 1;
                }
            }
            return 0;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}