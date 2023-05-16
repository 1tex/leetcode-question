package com.tex1.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

public class RestoreIpAddresses{
    public static void main(String[] args) {
        Solution solution = new RestoreIpAddresses().new Solution();
        //test here...
        System.out.println(solution.restoreIpAddresses("25525511135"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> res = new LinkedList<>();
        LinkedList<String> track = new LinkedList<>();

        public List<String> restoreIpAddresses(String s) {
            backtrace(s, 0);
            return res;
        }

        void backtrace(String s, int start) {
            if (track.size() == 4) {
                if (start == s.length()) {
                    res.add(String.join(".", track));
                }
            }
            for (int i = start; i < s.length(); i++) {
                if (!isValid(s.substring(start, i + 1))) {
                    continue;
                }
                if (track.size() >= 4) {
                    break;
                }
                track.add(s.substring(start, i + 1));
                backtrace(s, i + 1);
                track.removeLast();
            }
        }

        private boolean isValid(String s) {
            if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
                return false;
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}