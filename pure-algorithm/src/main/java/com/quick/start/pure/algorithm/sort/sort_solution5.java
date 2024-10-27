package com.quick.start.pure.algorithm.sort;

/**
 * 教练使用整数数组 actions 记录一系列核心肌群训练项目编号。
 * 为增强训练趣味性，需要将所有奇数编号训练项目调整至偶数编号训练项目之前。
 * 请将调整后的训练项目编号以 数组 形式返回。
 * <p>
 * 示例 1：
 * <p>
 * 输入：actions = [1,2,3,4,5]
 * 输出：[1,3,5,2,4]
 * 解释：为正确答案之一
 * Odd|Even
 */
public class sort_solution5 {

    public int[] trainingPlan(int[] actions) {
        int i = -1;
        for (int j = 0; j < actions.length; j++) {
            if (isOdd(actions[j])) {
                swap(actions, i + 1, j);
                i++;
            }
        }
        return actions;
    }

    /**
     * 判断是否是奇数
     *
     * @param target
     * @return
     */
    private boolean isOdd(int target) {
        return target % 2 == 1;
    }

    private void swap(int[] actions, int i, int j) {
        int temp = actions[i];
        actions[i] = actions[j];
        actions[j] = temp;
    }

    public static void main(String[] args) {
        sort_solution5 s5 = new sort_solution5();
        int[] arrs = s5.trainingPlan(new int[]{1, 2, 3, 4, 5});
        for (int i : arrs) {
            System.out.println(i);
        }
    }
}