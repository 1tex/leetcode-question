package com.tex1.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning{
    public static void main(String[] args) {
        Solution solution = new PalindromePartitioning().new Solution();
        //test here...
        System.out.println(solution.partition("aab"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    // 回文串
class Solution {
    List<List<String>> res = new LinkedList<>();
    LinkedList<String> track = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backtrace(s, 0);
        return res;
    }

    void backtrace(String s, int start) {
        if (s.length() == start) {
            res.add(new ArrayList<>(track));
        }
        for (int i = start; i < s.length(); i++) {
            if (!isPalindrome(s, start, i)) {
                continue;
            }
            track.add(s.substring(start, i + 1));
            backtrace(s, i + 1);
            track.removeLast();
        }
    }

    private boolean isPalindrome(String s, int lo, int hi) {
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}