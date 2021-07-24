package com.chengw.algorithm.dynamicprogramming.jump;

/**
 * 贪心
 *
 * @author chengwei
 */
public class SolutionV3 {

    public static void main(String[] args) {
        System.out.println(new SolutionV3().canJump(new int[]{1, 2}));
    }

    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (max < i) {
                return false;
            }
            max = Math.max(i + nums[i], max);
            if (max >= nums.length - 1) {
                return true;
            }
        }
        return false;

    }

}


