package com.tex1.leetcode.editor.cn;

public class ImplementRand10UsingRand7{
    public static void main(String[] args) {
        Solution solution = new ImplementRand10UsingRand7().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        while (true) {
            int num = (rand7() - 1) * 7 +rand7();
            if (num <= 40) {
                return num % 10 + 1;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}