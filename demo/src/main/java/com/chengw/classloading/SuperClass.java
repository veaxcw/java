package com.chengw.classloading;

/**
 * 被动引用
 *
 * @author chengwei
 */
public class SuperClass {

    static {
        System.out.println("Super class init");
    }

    public static final int VALUE = 123;

}
