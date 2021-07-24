package com.chengw.integer;

/**
 * @author chengwei
 */
public class IntegerEq {

    public static void main(String[] args) {
        Integer a = 128;
        Integer b = new Integer(128);
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }

}
