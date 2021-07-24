package com.chengw.algorithm.array.twosum;

/**
 * @author chengwei
 */
public class SolutionV2 {

    public static void main(String[] args) {
        int[] ints = new SolutionV2().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints[0] + " " + ints[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int cur = numbers[i] + numbers[j];
            if (cur == target) {
                return new int[]{i + 1, j + 1};
            }
            i = cur < target ? i + 1 : i;
            j = cur > target ? j - 1 : j;
        }
        return new int[]{0, 0};

    }

}
