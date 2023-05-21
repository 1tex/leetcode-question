package com.tex1.leetcode.editor.cn;

import java.util.Arrays;
import java.util.List;

public class WordBreak{
    public static void main(String[] args) {
        Solution solution = new WordBreak().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[] memo;

        public boolean wordBreak(String s, List<String> wordDict) {
            memo = new int[s.length()];
            Arrays.fill(memo, -1);
            return dp(s, 0, wordDict);
        }

        boolean dp(String s, int i, List<String> wordDict) {
            if (i == s.length()) {
                return true;
            }
            if (memo[i] != -1) {
                return memo[i] == 1 ? true : false;
            }
            for (String word : wordDict) {
                int len = word.length();
                if (i + len > s.length()) {
                    continue;
                }
                if (!s.substring(i, i + len).equals(word)) {
                    continue;
                }
                if (dp(s, i + len, wordDict)) {
                    memo[i] = 1;
                    return true;
                }
            }
            memo[i] = 0;
            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}