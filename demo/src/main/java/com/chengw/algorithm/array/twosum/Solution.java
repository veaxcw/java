package com.chengw.algorithm.array.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chengwei
 */
public class Solution {

    public static void main(String[] args) {
        int[] ints = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints[0] + " " + ints[1]);
    }

    private Map<Integer, Integer> map = new HashMap<>();

    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i< numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i< numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[] {i + 1, map.get(target - numbers[i]) + 1};
            }
        }
        return new int[]{0, 0};

    }

}
