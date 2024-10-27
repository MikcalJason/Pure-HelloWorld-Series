package com.quick.start.pure.algorithm.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 从一个数组中找出满足比左侧都要大比右侧都要小的数
 */
public class Solution1 {

    /**
     * 记录左边数组的最大值，记录右侧的最小值
     *
     * @param arr
     * @return
     */

    public static Integer findIndex(int[] arr) {
        Map<Integer, Integer> maxArr = findMax(arr);
        Map<Integer, Integer> minArr = findMin(arr);
        for (int i = 0; i < arr.length; i++) {
            if (maxArr.containsKey(i) && minArr.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }

    public static Map<Integer, Integer> findMax(int[] arr) {
        Map<Integer, Integer> maxMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxMap.put(i, arr[i]);
                max = arr[i];
            }
        }
        return maxMap;
    }

    public static Map<Integer, Integer> findMin(int[] arr) {
        Map<Integer, Integer> minMap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < min) {
                minMap.put(i, arr[i]);
                min = arr[i];
            }
        }
        return minMap;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{21, 11, 45, 56, 9, 66, 77, 89, 78, 68, 100, 120, 111};
        int index = findIndex(arr);
        System.out.println("一个数组中找出满足比左侧都要大比右侧都要小的数:" + index);
    }
}

// test
//const arr = [21, 11, 45, 56, 9, 66, 77, 89, 78, 68, 100, 120, 111]
//            console.log(find(arr)) // 5 --> 66
//}


