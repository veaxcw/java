package com.chengw.algorithm.doublepointer.containerWithMostWater;


/****
 *
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 *
 *
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 *
 *
 *
 * @author chengw
 */

public class Solution {

    /**
     * 双指针法
     * **/
    public int maxArea(int[] height) {

        int head = 0;
        int tail = height.length - 1;

        int maxArea = 0;

        while (head < tail){

            int length = Math.abs(tail - head);

            int area = length * Math.min(height[tail],height[head]);

            maxArea = area > maxArea?area:maxArea;

           if(height[head] < height[tail]) {
               head++;
           } else {
               tail--;
           }

        }

        return maxArea;
    }

    public static void main(String[] args) {

    }

}
