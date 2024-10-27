package com.quick.start.pure.algorithm.sort;

import java.util.Arrays;

/**
 * 给你一个数字数组 arr 。
 * <p>
 * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 * <p>
 * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
 */
public class sort_solution3 {

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 0 || arr.length == 1 || arr.length == 2) return true;
        Arrays.sort(arr);
        int diffValue = arr[1] - arr[0];
        return isArithmeticProgression(arr, diffValue);
    }

    public boolean isArithmeticProgression(int[] arr, int diff) {
        for (int i = 2; i < arr.length; i++) {
            int diffA = arr[i] - arr[i - 1];
            if (diffA != diff) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        sort_solution3 s3 = new sort_solution3();
        boolean b = s3.canMakeArithmeticProgression(new int[]{1, 3, 5, 7, 9});
        System.out.println(b);
    }
}