package com.chengw.algorithm.sort.isCovered;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给你一个二维整数数组 ranges 和两个整数 left 和 right 。每个 ranges[i] = [starti, endi] 表示一个从 starti 到 endi 的 闭区间 。
 *
 * 如果闭区间 [left, right] 内每个整数都被 ranges 中 至少一个 区间覆盖，那么请你返回 true ，否则返回 false 。
 *
 * 已知区间 ranges[i] = [starti, endi] ，如果整数 x 满足 starti <= x <= endi ，那么我们称整数x 被覆盖了。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-all-the-integers-in-a-range-are-covered
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chengwei
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(new Solution().isCovered(new int[][]{{36,50},{14,28},{4,31},{24,37},{13,36},{27,33},{23,32},
                {23,27},{1,35}},35,40));
    }



    public boolean isCovered(int[][] ranges, int left, int right) {
        int j = left;
        Arrays.sort(ranges, Comparator.comparingInt(a -> a[0]));
        for (int i = 0;i < ranges.length; i++) {
            for (; j <= right; j++) {
                if (j > ranges[i][1] || j < ranges[i][0]) {
                    break;
                }
            }
            if (j == right + 1) {
                return true;
            }
        }
        return false;
    }


}
