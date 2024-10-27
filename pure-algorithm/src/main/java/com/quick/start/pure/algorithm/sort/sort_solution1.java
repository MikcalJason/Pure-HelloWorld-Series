package com.quick.start.pure.algorithm.sort;

class sort_solution1 {
    public static void merge(int[] A, int m, int[] B, int n) {

        int p = m + n;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (A[m] >= B[n]) {
                A[--p] = A[m--];
            } else {
                A[--p] = B[n--];
            }
        }
        if (m >= 0) {
            return;
        }

        if (n >= 0) {
            for (; n >= 0; n--) {
                A[n] = B[n];
            }
        }
    }

    /**
     * 输入:
     * A = [1,2,3,0,0,0], m = 3
     * B = [2,5,6],       n = 3
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] A = new int[]{0};
        sort_solution1.merge(A, 0, new int[]{1}, 1);
        for (int j : A) {
            System.out.println(j);
        }
    }
}