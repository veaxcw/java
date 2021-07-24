package com.chengw.algorithm.dynamicprogramming.fibonacci;

/**
 * @author chengwei
 */
public class SolutionV2 {


    public static void main(String[] args) {
        System.out.println(new SolutionV2().fib(4));
    }

    /**
     * 自顶向下的备忘录法
     * 仍然需要递归
     **/
    public  int fib(int n) {
        if (n <= 0) {
            return n;
        }
        int[] memo = new int[n + 1];
        return fibonacci(n, memo);
    }

    public int fibonacci(int n, int[] memo) {

        if (memo[n] != 0) {
            return memo[n];
        }
        if (n <= 2) {
            memo[n] = 1;
        } else {
            memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        }
        return memo[n];

    }

}
