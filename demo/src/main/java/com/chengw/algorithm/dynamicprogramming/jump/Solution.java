package com.chengw.algorithm.dynamicprogramming.jump;

/**
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个下标。
 *
 * @author chengwei
 */
public class Solution {



    public static void main(String[] args) {
        System.out.println(new Solution().canJump(new int[]{3,2,1,0,4}));
    }

    private byte[] backup;

    public boolean canJump(int[] nums) {
        backup = new byte[nums.length + 1];
        backup[0] = 1;
        return this.canJumps(nums, nums.length);

    }

    private boolean canJumps(int[] nums, int limit) {
        int index = limit - 2;
        byte success = 1;
        byte failed = -1;
        if (nums.length == 1) {
            return true;
        }
        for (int i = 1; i < limit; i++, index--) {
            if (nums[index] < i) {
                continue;
            }
            if (backup[index] == (byte) 0 && (backup[index] = canJumps(nums,limit - i) ? success : failed) == failed) {
                continue;
            }
            return backup[index] > 0;
        }
        return index > 0 && backup[index] > 0;
    }
}
