package com.chengw.algorithm.dynamicprogramming.climstairs;

public class SolutionV2 {
    public static void main(String[] args) {
        System.out.println(new SolutionV2().climbStairs(4));
    }

    public int climbStairs(int n) {

        int[] result = new int[3];
        result[0] = 1;
        result[1] = 2;

        if (n <= 2) {
            return result[n - 1];
        }
        for (int i = 3; i <= n; i++) {
            result[2] = result[0] + result[1];
            result[0] = result[1];
            result[1] = result[2];
        }
        return result[2];

    }
}
