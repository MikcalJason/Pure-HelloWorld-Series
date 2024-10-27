package com.quick.start.pure.algorithm.sort;

public class sort_quick {
    public void sort(int[] arr, int n) {
        quick_sort(arr, 0, n - 1);
    }

    private void quick_sort(int[] arr, int p, int r) {
        if (p >= r) return;
        int q = partition(arr, p, r);
        quick_sort(arr, p, q - 1);
        quick_sort(arr, q + 1, r);
    }

    private int partition(int[] arr, int p, int r) {
        int j = p - 1;
        for (int i = p; i < r; i++) {
            if (arr[i] < arr[r]) {
                swap(arr, ++j, i);
            }
        }
        swap(arr, j + 1, r);
        return j + 1;
    }

    private void swap(int[] arr, int p, int q) {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }
}
