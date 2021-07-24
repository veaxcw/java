package com.chengw.algorithm.dynamicprogramming.jump;

/**
 * 动态规划2.0 版本
 *
 * @author chengwei
 */
public class SolutionV2 {

    public static void main(String[] args) {
        int[] test = new int[]{
                2,3,1,1,4
        };
        System.out.println(new SolutionV2().canJump(test));
    }

    private byte[] backup;

    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        backup = new byte[nums.length + 1];
        return this.canJumps(nums, nums.length);

    }

    private boolean canJumps(int[] nums, int limit) {
        int index = limit - 2;
        byte success = 1;
        byte failed = -1;
        for (int i = 1; i < limit; i++, index--) {
            if (backup[index] == success || backup[index] == failed) {
                return backup[index] > 0;
            }
            if (nums[index] >= i && (backup[index] = canJumps(nums, limit - i) ? success : failed) == success) {
                return true;
            }
            backup[index] = failed;
        }
        return limit == 1 && index == -1;
    }


}
