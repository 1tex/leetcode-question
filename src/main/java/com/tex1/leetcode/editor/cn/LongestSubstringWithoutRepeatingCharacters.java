package com.tex1.leetcode.editor.cn;

public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public static int solution(String S) {
            int maxWords = 0;
            String[] sentences = S.split("[.?!]");
            for (String sentence : sentences) {
                int wordCount = 0;
                String[] words = sentence.trim().split(" ");
                for (String word : words) {
                    if (word.matches(".*[a-zA-Z].*")) {
                        wordCount++;
                    }
                }
                maxWords = Math.max(maxWords, wordCount);
            }
            return maxWords;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}