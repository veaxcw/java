package com.chengw.algorithm.doublepointer.uniqueletterstring;

/**
 * 我们定义了一个函数 countUniqueChars(s) 来统计字符串 s 中的唯一字符，并返回唯一字符的个数。
 *
 * 例如：s = "LEETCODE" ，则其中 "L", "T","C","O","D" 都是唯一字符，因为它们只出现一次，所以 countUniqueChars(s) = 5 。
 *
 * 本题将会给你一个字符串 s ，我们需要返回 countUniqueChars(t) 的总和，其中 t 是 s 的子字符串。注意，某些子字符串可能是重复的，但你统计时也必须算上这些重复的子字符串（也就是说，你必须统计 s 的所有子字符串中的唯一字符）。
 *
 * 由于答案可能非常大，请将结果 mod 10 ^ 9 + 7 后再返回。
 *
 *
 * @author chengwei
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().uniqueLetterString("LeetCode"));
    }

    public int uniqueLetterString(String input) {
        long sum = 0;

        long mod = 1000000007;
        int i, j, k;
        for (i = 0; i < input.length(); i++) {
            for (j = i - 1; j > -1 && input.charAt(j) != input.charAt(i); j--) {
            }
            for (k = i + 1; k < input.length() && input.charAt(k) != input.charAt(i); k++) {
            }
            sum += (i - j) * (k - i) % mod;
        }
        return (int) sum;
    }

    public String findUniqueSubString(String input) {
        long sum = 0;

        long mod = 1000000007;
        int i, j, k;
        for (i = 0; i < input.length(); i++) {
            for (j = i - 1; j > -1 && input.charAt(j) != input.charAt(i); j--) {
            }
            for (k = i + 1; k < input.length() && input.charAt(k) != input.charAt(i); k++) {
            }
            sum += (i - j) * (k - i) % mod;
        }
        return "";
    }

}
