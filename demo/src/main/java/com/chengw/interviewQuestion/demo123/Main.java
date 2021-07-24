package com.chengw.interviewQuestion.demo123;

import java.util.*;

public class Main {

    static int max = 1;

    public static void main(String[] args) {
        System.out.print(doCalculate(new int[]{10, 1, 3, 4, 7, 6, 20, 5, 13, 23, 14
        }));
    }

    public static int doCalculate(int[] input) {

        Set<Integer> set = new HashSet<>(input.length);

        for (int i : input) {
            set.add(i);
        }
        int current = 1;
        for (int i : input) {
            findRight(set, i, current);
            findLeft(set, i, current);
            max = Math.max(max, current);
        }
        return max;

    }

    public static void findRight(Set<Integer> set, int input, int cur) {
        if (!set.contains(input + 1)) {
            return ;
        }
        cur++;
        findRight(set, input + 1, cur);
    }

    public static void findLeft(Set<Integer> set, int input, int cur) {
        if (input <= 0 || !set.contains(input - 1)) {
            return ;
        }
        cur++;
        findLeft(set, input - 1, cur);
    }


}