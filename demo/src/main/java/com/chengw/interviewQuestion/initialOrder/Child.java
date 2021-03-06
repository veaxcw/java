package com.chengw.interviewQuestion.initialOrder;


/**
 * 初始化顺序
 * 1.父类静态字段
 * 2.父类静态代码块
 * 3.子类静态字段
 * 4.子类静态代码快
 * 5.父类普通代码块
 * 5.父类构造方法
 * 6.子类普通代码块
 * 7.子类构造方法
 *
 * @author veax**/

public class Child extends Parents {
    static {
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类普通代码块");
    }

    public Child() {
        System.out.println("子类构造方法");
    }


}



