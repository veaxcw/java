package com.chengw.algorithm.offer.fingdulnum;

import java.util.Arrays;

/**
 *  找到数组中重复的数字
 *
 * @author chengwei
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(find(2,2,3,5,3,5,7));

    }

    public static int find(int... input) {

        int result = 0;

        for (int i = 0; i < input.length;i++) {
            result ^= input[i];
        }

        return result;


    }

}
