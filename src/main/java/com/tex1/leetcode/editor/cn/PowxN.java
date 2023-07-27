package com.tex1.leetcode.editor.cn;

public class PowxN{
    public static void main(String[] args) {
        Solution solution = new PowxN().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double myPow(double x, int n) {
            if (n == 0) {
                return 1;
            }
            if (n == Integer.MIN_VALUE) {
                return myPow(1 / x, -(n + 1)) / x;
            }

            if (n < 0) {
                return myPow(1 / x, -n);
            }

            if (n % 2 == 1) {
                return x * myPow(x, n - 1);
            } else {
                double tmp = myPow(x, n / 2);
                return tmp * tmp;
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}