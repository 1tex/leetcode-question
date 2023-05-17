package com.tex1.leetcode.editor.cn;

public class AddStrings{
    public static void main(String[] args) {
        Solution solution = new AddStrings().new Solution();
        //test here...

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addStrings(String num1, String num2) {
            StringBuffer res = new StringBuffer();
            int i = num1.length() - 1, j = num2.length() - 1;
            int add = 0;
            while (i >= 0 || j >= 0 || add != 0) {
                int x = i >= 0 ? num1.charAt(i) - '0' : 0;
                int y = j >= 0 ? num2.charAt(j) - '0' : 0;
                int temp = x + y + add;

                res.append(temp % 10);
                add = temp / 10;
                i--;j--;
            }
            res.reverse();
            return res.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}