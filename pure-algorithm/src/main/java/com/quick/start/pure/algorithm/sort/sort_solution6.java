package com.quick.start.pure.algorithm.sort;

/**
 * <a href="https://leetcode.cn/problems/sort-colors/description/">颜色分类</a>
 */
public class sort_solution6 {

    public void sortColors(int[] nums) {
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                swap(nums, i + 1, j);
                i++;
            }
        }

        for (int k = i + 1; k < nums.length; k++) {
            if (nums[k] == 1) {
                swap(nums, i + 1, k);
                i++;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        sort_solution6 s6 = new sort_solution6();
        int[] arr = new int[]{0, 1, 2, 0, 2, 1};
        s6.sortColors(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
