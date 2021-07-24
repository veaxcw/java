package com.chengw.algorithm.dynamicprogramming.mincostclimgstairs;

public class SolutionV2 {

    public static void main(String[] args) {
        System.out.println(new SolutionV2().minCostClimbingStairs(new int[]{10, 15, 20}));
    }


    public int minCostClimbingStairs(int[] cost) {

        int a = cost[0];
        int b = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int rest = Math.min(a, b) + cost[i];
            a = b;
            b = rest;
        }
        return Math.min(a, b);
    }

}
