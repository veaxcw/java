package com.chengw.algorithm.dynamicprogramming.tibonacci;

public class Solution {

    public int tribonacci(int n) {
        int[] meme = n < 4 ? new int[4] : new int[n + 1];
        meme[0] = 0;
        meme[1] = 1;
        meme[2] = 1;
        meme[3] = 2;
        return n < 4 ? meme[4] : trib(n - 1, meme) + trib(n - 2, meme) + trib(n - 3, meme);

    }

    private int trib(int n, int[] meme) {
        if (meme[n] > 0) {
            return meme[n];
        }
        meme[n] = trib(n - 1, meme) + trib(n - 2, meme) + trib(n - 3, meme);
        return meme[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().tribonacci(25));
    }
}
