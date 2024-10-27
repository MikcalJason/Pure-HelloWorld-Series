package com.quick.start.pure.algorithm.tree;

public class Main {
    public static void main(String[] args) {
        PhTree p = new PhTree();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(new TreeNode(3), new TreeNode(4), 1);
        root.right = new TreeNode(new TreeNode(5), new TreeNode(6), 2);
        boolean ph = p.isPh(root);
        System.out.println(ph);
    }
}
