package com.tex1.leetcode.editor.cn;

public class WordSearch{
    public static void main(String[] args) {
        Solution solution = new WordSearch().new Solution();
        //test here...
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        boolean found = false;
        public boolean exist(char[][] board, String word) {
            int m = board.length, n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dfs(board, i, j, word, 0);
                    if (found) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void dfs(char[][] board, int i, int j, String word, int p) {
            if (p == word.length()) {
                found = true;
                return;
            }
            if (found) {
                return;
            }
            int m = board.length, n = board[0].length;
            if (i < 0 || j < 0 || i >= m || j >= n) {
                return;
            }
            if (board[i][j] != word.charAt(p)) {
                return;
            }

            board[i][j] = (char) (-board[i][j]);
            dfs(board, i + 1, j, word, p + 1);
            dfs(board, i - 1, j, word, p + 1);
            dfs(board, i, j + 1, word, p + 1);
            dfs(board, i, j - 1, word, p + 1);
            board[i][j] = (char) (-board[i][j]);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}