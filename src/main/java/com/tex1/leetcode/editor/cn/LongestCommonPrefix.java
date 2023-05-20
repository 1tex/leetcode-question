package com.tex1.leetcode.editor.cn;

public class LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            StringBuffer sb = new StringBuffer();
            // 需要比较的前缀总长度
            int length = strs[0].length();
            // 字符串数量
            int count = strs.length;
            for (int i = 0; i < length; i++){
                char c = strs[0].charAt(i);
                for (int j = 0; j < count; j++){
                    if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                        return sb.toString();
                    }
                }
                sb.append(c);
            }
            return strs[0];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}