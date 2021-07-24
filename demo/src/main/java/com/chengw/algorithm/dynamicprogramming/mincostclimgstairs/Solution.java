package com.chengw.algorithm.dynamicprogramming.mincostclimgstairs;

/**
 * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
 *
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 *
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-cost-climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chengwei
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().minCostClimbingStairs(new int[]{10,15,20}));
    }

    int[] costr;

    int[] ans;

    public int minCostClimbingStairs(int[] cost) {
        this.costr = cost;
        this.ans = new int[cost.length + 1];
        this.ans[0] = this.costr[0];
        this.ans[1] = this.ans[1];
        return cal(cost.length);
    }

    private int cal(int n) {
        if (this.ans[n] > 0) {
            return this.ans[n];
        }
        this.ans[n] = Math.min(cal(n - 1) + this.costr[n - 1], cal(n -2 ) + this.costr[n - 2]);
        return this.ans[n];
    }

}
