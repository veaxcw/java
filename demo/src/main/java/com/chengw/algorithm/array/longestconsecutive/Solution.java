package com.chengw.algorithm.array.longestconsecutive;

import java.util.*;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * <p>
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 * <p>
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-consecutive-sequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chengwei
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().longestConsecutive(new int[]{1,0,-1}));
    }

    private LinkedList<Integer> result = new LinkedList<>();

    private Set<Integer> set = new HashSet<>();

    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        for (int i = 1;i < nums.length; i++) {
            set.add(nums[i]);
        }
        result.push(nums[0]);
        int max = 0;
        while (!set.isEmpty()) {
            int cur = result.getFirst();
            set.remove(cur);
            boolean flag = false;
            if (set.contains(cur + 1)) {
                result.addFirst(cur + 1);
                set.remove(cur + 1);
                flag = true;
            }
            cur = result.getLast();
            set.remove(cur);
            if (set.contains(cur - 1)) {
                result.addLast(cur - 1);
                set.remove(cur - 1);
                flag = true;
            }
            if (flag) continue;
            max = Math.max(result.size(), max);
            if (set.isEmpty()) {
                break;
            }
            result = new LinkedList<>();
            result.push(set.iterator().next());
        }
        return Math.max(result.size(), max);
    }

}
