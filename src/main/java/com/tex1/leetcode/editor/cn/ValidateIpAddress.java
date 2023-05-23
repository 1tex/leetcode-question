package com.tex1.leetcode.editor.cn;

public class ValidateIpAddress{
    public static void main(String[] args) {
        Solution solution = new ValidateIpAddress().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String validIPAddress(String queryIP) {
            if (queryIP.contains(".")) {
                return validIPv4(queryIP);
            } else if (queryIP.contains(":")) {
                return validIPv6(queryIP);
            } else {
                return "Neither";
            }
        }

        String validIPv4(String ip) {
            String[] nums = ip.split("\\.", -1);
            for (int i = 0; i < nums.length; i++) {
                String x = nums[i];
                if (x.length() == 0 || x.length() > 3) {
                    return "Neither";
                }
                if (x.charAt(0) == '0' && x.length() != 1) {
                    return "Neither";
                }
                for (char ch : x.toCharArray()) {
                    if (!Character.isDigit(ch)) {
                        return "Neither";
                    }
                }
                if (Integer.parseInt(x) > 255) {
                    return "Neither";
                }
                if (nums.length != 4) {
                    return "Neither";
                }
            }
            return "IPv4";
        }

        String validIPv6(String ip) {
            String[] nums = ip.split(":", -1);
            String hexdigits = "0123456789abcdefABCDEF";
            for (int i = 0; i < nums.length; i++) {
                String x = nums[i];
                if (x.length() == 0 || x.length() > 4) {
                    return "Neither";
                }
                for (Character ch : x.toCharArray()) {
                    if (hexdigits.indexOf(ch) == -1) {
                        return "Neither";
                    }
                }
                if (nums.length != 8) {
                    return "Neither";
                }
            }
            return "IPv6";
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}