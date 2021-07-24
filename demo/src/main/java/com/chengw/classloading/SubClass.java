package com.chengw.classloading;

/**
 * @author chengwei
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("sub class init");
    }

}
