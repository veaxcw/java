package com.chengw.algorithm.sum;

/**
 * 求和，不允许使用乘除，循环，判断
 *
 * @author chengwei
 */
public class Main {

    static int res = 0;

    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    static int sum(int n) {
        boolean x = n > 1 &&  sum(n -1 ) > 0;
        res += n;
        return res;
    }

}
