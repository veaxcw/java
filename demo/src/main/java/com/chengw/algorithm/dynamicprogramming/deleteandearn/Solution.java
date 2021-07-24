package com.chengw.algorithm.dynamicprogramming.deleteandearn;

import java.util.Arrays;

/**
 *
 * 给你一个整数数组 nums ，你可以对它进行一些操作。
 *
 * 每次操作中，选择任意一个 nums[i] ，删除它并获得 nums[i] 的点数。之后，你必须删除 所有 等于 nums[i] - 1 和 nums[i] + 1 的元素。
 *
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [3,4,2]
 * 输出：6
 * 解释：
 * 删除 4 获得 4 个点数，因此 3 也被删除。
 * 之后，删除 2 获得 2 个点数。总共获得 6 个点数。
 * 示例 2：
 *
 * 输入：nums = [2,2,3,3,3,4]
 * 输出：9
 * 解释：
 * 删除 3 获得 3 个点数，接着要删除两个 2 和 4 。
 * 之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
 * 总共获得 9 个点数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-and-earn
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chengwei
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(new Solution().deleteAndEarn(new int[]{3,4,2}));
    }

    public int deleteAndEarn(int[] nums) {
        int q = nums[0];
        if (nums.length == 1) {
            return q;
        }
        Arrays.sort(nums);
        // 以值为index，数量为value 构建新数组，则该问题转换为小偷问题
        int[] rob = new int[nums[nums.length - 1] + 1];
        for (int value : nums) {
            rob[value] += value;
        }

        int p = 0;
        q = rob[0];
        int result = 0;
        for (int i = 1; i < rob.length; i++) {
            result = Math.max(q, p + rob[i]);
            p = q;
            q = result;
        }
        return result;
    }

}
