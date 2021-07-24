package com.chengw.algorithm.recurision.addtwonumbers;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * @author chengwei
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return build(extract(l1).add(extract(l2)));
    }

    public ListNode addTwoNumbersByRecursion(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        int val = l1 == null ? ((l2 == null ? 0 : l2.val)) : (l1.val + (l2 == null ? 0 : l2.val));
        listNode.val = val % 10;
        if (val / 10 == 0 && l1.next == null && l2.next == null) {
            return listNode;
        }
        l1.next = l1.next == null ? new ListNode(0) : l1.next;
        l2.next = l2.next == null ? new ListNode(0) : l2.next;
        if (val / 10 > 0) {
            l1.next.val++;
        }
        listNode.next = addTwoNumbersByRecursion(l1.next, l2.next);
        return listNode;
    }

    private BigInteger extract(ListNode l1) {
        ListNode temp = l1;
        BigInteger result = BigInteger.valueOf(temp.val);
        int exp = 1;
        while ((temp = temp.next) != null) {
            if (temp.val == 0) {
                exp++;
                continue;
            }
            result = result.add(BigInteger.TEN.pow(exp++).multiply(BigInteger.valueOf(temp.val)));
        }
        return result;
    }

    private ListNode build(BigInteger input) {
        if (input.compareTo(BigInteger.TEN) < 0) {
            return new ListNode(input.intValue());
        }

        BigInteger num = input.remainder(BigInteger.TEN);

        ListNode head = new ListNode(num.intValue());
        ListNode node = head;
        BigInteger temp = input.divide(BigInteger.TEN);
        while (temp.compareTo(BigInteger.ZERO) > 0) {
            node.next = new ListNode(temp.remainder(BigInteger.TEN).intValue());
            node = node.next;
            temp = temp.divide(BigInteger.TEN);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode build = new Solution().build(new BigInteger("1001"));
        System.out.println(new Solution().extract(build));
    }

}
