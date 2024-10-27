package com.quick.start.pure.algorithm.sort;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的
 * 字母异位词
 */
class sort_solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        int[] arrInt = new int[26];
        push(arrInt, arrS);
        return pop(arrInt, arrT);
    }

    public void push(int[] arr, char[] arrS) {
        for (char c : arrS) {
            int index = convertToInt(c);
            arr[index]++;
        }
    }

    public boolean pop(int[] arr, char[] arrT) {
        for (char c : arrT) {
            int index = convertToInt(c);
            arr[index]--;
            if (arr[index] < 0) {
                return false;
            }
        }
        for (int a : arr) {
            if (a != 0) {
                return false;
            }
        }
        return true;
    }

    public int convertToInt(Character c) {
        return c - 'a';
    }

    public static void main(String[] args) {
        sort_solution2 s2 = new sort_solution2();
        boolean anagram = s2.isAnagram("anagram", "nagaram");
        System.out.println(anagram);

        boolean anagram2 = s2.isAnagram("rat", "car");
        System.out.println(anagram2);


    }
}
