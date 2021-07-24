package com.chengw.algorithm.dynamicprogramming.climstairs;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 *
 * @author chengwei
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(4));
    }

    public int climbStairs(int n) {

        int[] results = n < 3 ? new int[2] : new int[n];
        results[0] = 1;
        results[1] = 2;
        if (n < 3) {
            return results[n - 1];
        }
        for (int i = 2; i < results.length; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }
        return results[n - 1];

    }


}
