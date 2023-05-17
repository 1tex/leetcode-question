package com.tex1.leetcode.editor.cn;

public class MultiplyStrings{
    public static void main(String[] args) {
        Solution solution = new MultiplyStrings().new Solution();
        //test here...
        System.out.println(solution.multiply("123", "456"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public String multiply(String num1, String num2) {
            String res = "";
            if (num1.equals("0") || num2.equals("0")) {
                return "0";
            }
            int m = num1.length() - 1, n = num2.length() - 1;
            for (int i = n; i >= 0; i--) {
                StringBuffer sb = new StringBuffer();
                int carry = 0;
                for (int j = m; j >= 0 || carry != 0; j--) {
                    int a = j >= 0 ? num1.charAt(j) - '0' : 0;
                    int b = i >= 0 ? num2.charAt(i) - '0' : 0; // Use `i` here
                    int temp = a * b + carry;
                    carry = temp / 10;
                    sb.append(temp % 10);
                }
                sb.reverse();
                sb.append("0".repeat(num2.length() - i - 1));
                res = addString(res, sb.toString());
            }

            return res;
        }

        private String addString(String num1, String num2) {
            int i = num1.length() - 1, j = num2.length() - 1, add = 0;
            StringBuffer ans = new StringBuffer();
            while (i >= 0 || j >= 0 || add !=0) {
                int x = i >= 0 ? num1.charAt(i) - '0' : 0;
                int y = j >= 0 ? num2.charAt(j) - '0' : 0;
                int temp = x + y + add;
                add = temp / 10;
                ans.append(temp % 10);
                i--;j--;
            }
            ans.reverse();
            return ans.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}