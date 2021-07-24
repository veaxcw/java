package com.chengw.algorithm.dynamicprogramming.fibonacci;

/****
 *
 * Those who cannot remember the past condemned to repeat id;
 *
 * 动态规划核心：
 *
 * A * "1+1+1+1+1+1+1+1 =？" *
 *
 * A : "上面等式的值是多少"
 * B : *计算* "8!"
 *
 * A *在上面等式的左边写上 "1+" *
 * A : "此时等式的值为多少"
 * B : *quickly* "9!"
 * A : "你怎么这么快就知道答案了"
 * A : "只要在8的基础上加1就行了"
 * A : "所以你不用重新计算因为你记住了第一个等式的值为8!动态规划算法也可以说是 '记住求过的解来节省时间'"
 *
 * @author chengw
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().fib(4));
    }


    public int fib(int n) {
        return n <= 0 ? 0 : (n == 1 ? 1 : (fib(n - 1) + fib(n - 2)));
    }


}
