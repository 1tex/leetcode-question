//package com.tex1.leetcode.editor.cn;
//
//import javax.swing.tree.TreeNode;
//
//public class PathSum{
//    public static void main(String[] args) {
//        Solution solution = new PathSum().new Solution();
//        //test here...
//    }
//    //leetcode submit region begin(Prohibit modification and deletion)
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode() {}
//     *     TreeNode(int val) { this.val = val; }
//     *     TreeNode(int val, TreeNode left, TreeNode right) {
//     *         this.val = val;
//     *         this.left = left;
//     *         this.right = right;
//     *     }
//     * }
//     */
//    class Solution {
//        public boolean hasPathSum(TreeNode root, int targetSum) {
//            if (root == null) {
//                return false;
//            }
//            if (root.left == null && root.right == null) {
//                return root.val == targetSum;
//            }
//            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
//        }
//    }
//    //leetcode submit region end(Prohibit modification and deletion)
//
//}