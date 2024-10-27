package com.quick.start.pure.algorithm.tree;

public class PhTree {

    private boolean isBalance = true;

    public boolean isPh(TreeNode root) {
        height(root);
        return isBalance;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        if (!isBalance) return 0;

        int leftH = height(node.left);
        int rightH = height(node.right);
        if (Math.abs(leftH - rightH) > 1) {
            isBalance = false;
        }
        return Math.max(leftH, rightH) + 1;
    }
}
