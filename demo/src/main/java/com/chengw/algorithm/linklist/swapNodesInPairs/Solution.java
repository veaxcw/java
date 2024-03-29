package com.chengw.algorithm.linklist.swapNodesInPairs;

import com.chengw.algorithm.linklist.common.ListNode;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * **/

/**
 * @author chengw
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode temp;

        temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;

        return temp;

    }



}
